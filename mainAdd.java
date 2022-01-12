package com.test;

public class mainAdd {

	public static void main(String[] args) {
		System.out.println("Program to add 2 numbers");
		int a=10, b=15;

		login logObj = new login();
		logObj.testPrint();

		add obj = new add();
		obj.adding(a, b);

	}

}
