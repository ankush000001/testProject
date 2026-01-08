package com.pkg1.test;

import org.testng.annotations.Test;

public class baseClass {


	public  static void  main(String []args) {

		System.out.println("main method calling");


	}






	@Test
	public void a()
	{
		System.out.println("method calling through testng test");
	}
	
	
	@Test
	public void z()
	{
		System.out.println("method calling through testng test");
	}
}
