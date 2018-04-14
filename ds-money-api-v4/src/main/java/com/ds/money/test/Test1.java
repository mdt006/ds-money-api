package com.ds.money.test;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.yooyo.util.MD5;

public class Test1 {
	public static void main(String[] args) throws Exception {//XEY6JTUod/V8f4ENPLG9sQ==
		System.out.println(MD5.hashToBase64String("aaaaa-12280938470.00"));//yQ329nq6V4wCVVcG7EsgZw==
		System.out.println(MD5.hashToBase64String("aaaaa-12280938470.00"));//yQ329nq6V4wCVVcG7EsgZw==
		System.out.println(new BigDecimal("0").setScale(2));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		java.util.Date date = sdf.parse("2008-08-08 12:10:12");
	//	sdf.
		System.out.println(date);
	}
}
