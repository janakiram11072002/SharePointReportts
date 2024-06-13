package com.jhonny.SharePointReports.Utils;

import java.io.FileInputStream;
import java.security.cert.Certificate;
import java.security.Key;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class CertificateLoader 
{
	@Autowired
	private Environment env;
	private KeyStore keyStore;
	private String alias;
	private Certificate cert;

	private PrivateKey privateKey;
	private String PublicKey;
	private String ThumbPrint;
	final private MessageDigest md;


	public PrivateKey getPrivateKey() 
	{
		return privateKey;
	}
	public String getPublicKey() 
	{
		return PublicKey;
	}
	private String getThumbPrint()
	{
		return ThumbPrint;
	}
	private FileInputStream fis ;


	public CertificateLoader() throws NoSuchAlgorithmException
	{
		 md = MessageDigest.getInstance("SHA-1");
	}
	public CertificateLoader(String CertPath) throws NoSuchAlgorithmException
	{
		this();
		try
		{
			//FileInputStream fis = new FileInputStream(CertPath);
			try
			{
				this.fis = new FileInputStream(CertPath);
			}
			catch(Exception e)
			{
				System.out.println("File Not Found\nError : " + e.getMessage());
				this.fis = null;
			}

			keyStore = KeyStore.getInstance("PKCS12");
			keyStore.load(fis, env.getProperty("Spring.Certificate.Key").toCharArray());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

	private PrivateKey GeneratePrivateKey()
	{
		try
		{
			//String alias = keyStore.aliases().nextElement();
			Key key  = keyStore.getKey(alias, env.getProperty("Spring.Certificate.Key").toCharArray());
			PrivateKey privateKey = (PrivateKey)key;
			return privateKey;
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}

	private String GeneratePublicKey()
	{
		try
		{
			cert = keyStore.getCertificate(alias);
			String PublicKey = Base64.getEncoder().encodeToString(cert.getPublicKey().getEncoded());
			return PublicKey;
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}

	}
	
	private String GenereateThumbPrint()
	{
		try
		{
			md.update(cert.getEncoded());
			byte[] dir = md.digest();
			ThumbPrint = Base64.getEncoder().encodeToString(dir);
			return ThumbPrint;
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

}
