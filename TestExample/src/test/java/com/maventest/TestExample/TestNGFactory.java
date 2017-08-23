package com.maventest.TestExample;

import org.testng.annotations.Factory;

public class TestNGFactory 
{
	
	@Factory
	public static Object[] testData()
	{ 
	  Object[] object = new Object[3]; 
	   
	  object[0]= new FactoryExampleClass(1,"testdata1"); 
	  object[1]= new FactoryExampleClass(2,"testdata2"); 
	  object[2]= new FactoryExampleClass(3,"testdata3"); 
	  		   
	  return object; 
	 } 
}