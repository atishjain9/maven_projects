package com.cca;

import in.ahcareer.security.PwdUtils;

public class Test {

	public static void main(String[] args) {
		PwdUtils pwd=new PwdUtils();
		String encodedpwd=pwd.encodePassword("abc@123");
		System.out.println(encodedpwd);

	}

}
