package com.testng.automation;

import org.testng.annotations.Test;

public class LearnTestNGPriority {

	@Test (priority=0, enabled=false)
		public void amethod1() {
			System.out.println("This is First method");
			}
		
		@Test (priority=0, alwaysRun=true)
		public void Amethod2() {
			System.out.println("This is Second Method");
		}
			
			@Test (priority=1)
			public void method3() {
				System.out.println("This is third Method");
					
		}
			@Test(invocationCount =4)
			public void method0() {
			System.out.println("This is Fourth method");
			}
				
				/*@Test
				public void method5() {
				System.out.println("This is fifth method");

				} */
				@Test
				public void method6() {

				//throws IO exception
				System.out.println("This is sixth method");
				}
				@Test
				public void method7() {
				System.out.println("This is seventh method");
				}
				@Test
				public void method8() {
				System.out.println("This is eighth method");
				}
				@Test
				public void method9() {
				System.out.println("This is ninth method");
				}
				}
	
			