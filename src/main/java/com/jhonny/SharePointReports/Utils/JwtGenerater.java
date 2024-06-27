package com.jhonny.SharePointReports.Utils;

import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.Date;

public class JwtGenerater 
{
	@Autowired
	Environment env;
	private String JwtToken;
	final private Date EXPIRY_DATE = new Date(System.currentTimeMillis() + 3600 * 1000);
	final private Date NOT_BEFORE_TIME = new Date(1601519114);
	final private String JWT_ID = java.util.UUID.randomUUID().toString();
	final private String AUDIENCE;
	private JWTClaimsSet climbSet;

	private JWSHeader jwsHeader ;


	
	public JwtGenerater() 
	{
		this.AUDIENCE = prepareAudiece();
	}
	
	private JWSSigner InitilizeSigner()
	{
		try {
			return new RSASSASigner(new CertificateLoader(env.getProperty("Spring.Certificate.path").toString()).getPrivateKey());
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
        return env.getProperty("Spring.jwt.AudienceEndPoint")+env.getProperty("Spring.jwt.TenantId")+env.getProperty("Spring.jwt.AudienceVersion");
	}
	private void PrepareHeader(String ThumbPrint)
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
					.issuer(env.getProperty("Spring.jwt.ClientId="))
					.subject(env.getProperty("Spring.jwt.ClientId="))
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
