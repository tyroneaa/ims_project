package com.qa.ims.utils;

import java.util.Scanner;

public class Utils {

	public static final String MYSQL_URL = "localhost:3306/ims?useSSL=false";
	public static final Scanner SCANNER = new Scanner(System.in);

	private Utils() {

	}

	public static String getInput() {
		return SCANNER.nextLine();
	}
	
	public static int getInt() {
		return SCANNER.nextInt();
	}
	
	public static double getDouble() {
		return SCANNER.nextDouble();
	}
	
	public static Long getLong() {
		return SCANNER.nextLong();
	}

}
