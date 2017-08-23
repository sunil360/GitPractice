package com.maventest.TestExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

	
	public class FactoryExampleClass 
	{
		String testdata ;
		int objectID ;
		
		public FactoryExampleClass(int ojectID, String testdata)
		{
			this.objectID = ojectID ;
			this.testdata= testdata ;
		}
		
		@BeforeClass 
		 public void beforeClass(){ 
		  System.out.println("This is before class of " + objectID); 
		 } 
		
		@Test 
		 public void testmethod(){ 
		  System.out.println("This is test method, testdata is  :" + testdata); 
		 }
		
		@AfterClass 
		 public void afterClass(){ 
		  System.out.println("This is after class of " +  objectID); 
		 } 

	
}