package in.ahcareer.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtils {

	public String encodePassword(String pwd)
	{
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pwd.getBytes());
		String encodedpwd=new String(encode);
		return encodedpwd;
	}
}
