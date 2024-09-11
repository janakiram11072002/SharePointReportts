package com.jhonny.SharePointReports.Utils;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Date;

public class JwtGenerater
{

	// private String JwtToken;
	/*
	 * Audience
	 * Spring.jwt.AudienceEndPoint="https://login.microsoftonline.com/"
		Spring.jwt.AudienceVersion = "v2.0"
	 */
	final private String AudienceEndPoint = "https://login.microsoftonline.com/%s/v2.0";
	final private Date EXPIRY_DATE = new Date(System.currentTimeMillis() + 3600 * 1000);
	final private Date NOT_BEFORE_TIME = new Date(1601519114);
	final private String JWT_ID = java.util.UUID.randomUUID().toString();
	final private String AUDIENCE;
	private JWTClaimsSet climbSet;
	private CertificateLoader cert;

	private JWSHeader jwsHeader ;
	private AppConfig appConfig;

	
	public JwtGenerater() 
	{
		/*
		 to prepare a application context and make use of Spring bean
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppConfig appConfig = context.getBean(AppConfig.class);
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		appConfig = context.getBean(AppConfig.class);
		context.close();

		this.AUDIENCE = prepareAudiece();
		try
		{
			cert = new CertificateLoader(appConfig.getCertPath(), appConfig.getCertKey());
			prepareHeader(cert.getThumbPrint());
			prepareClimbSet();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}
	
	private JWSSigner InitilizeSigner()
	{
		try {
			return new RSASSASigner(cert.getPrivateKey());
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	private SignedJWT InitilizeSignedJWT()
	{
		SignedJWT signed = new SignedJWT(this.jwsHeader, this.climbSet);
		try
		{
			signed.sign(InitilizeSigner());
		}
		catch (Exception e)
		{
			System.out.println(e.getStackTrace());
		}
		return signed;
	}

	public String getJwtToken()
	{
		return InitilizeSignedJWT().serialize();
	}
	private String prepareAudiece()
	{
        return String.format(this.AudienceEndPoint,appConfig.getTenatId());
	}
	private void prepareHeader(String ThumbPrint)
	{
		JWSHeader header = null;
		try
		{
			header = new JWSHeader.Builder(JWSAlgorithm.RS256)
					.keyID(ThumbPrint)
					.build();
		}
		catch (Exception e)
		{
			System.out.println("Error while preparing JWS Header.\n Error :" + e.getMessage());
			throw new RuntimeException();
		}
		jwsHeader = header;
	}
	private void prepareClimbSet()
	{
		try
		{
			this.climbSet = new JWTClaimsSet.Builder()
					.issuer(appConfig.getClientId())
					.subject(appConfig.getClientId())
					.audience(this.AUDIENCE)
					.expirationTime(this.EXPIRY_DATE)
					.notBeforeTime(this.NOT_BEFORE_TIME)
					.jwtID(this.JWT_ID)
					.build();
		}
		catch (Exception e)
		{
			this.climbSet = null;
			System.out.println("Error while preparing JWT ClimbSet.\n Error :" + e.getMessage());
			throw new RuntimeException();
		}
	}
}
