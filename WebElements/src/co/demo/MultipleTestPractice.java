package co.demo;

import org.testng.annotations.Test;

public class MultipleTestPractice {
		
		@Test(priority=0,invocationCount=5)
		public void one() {
		System.out.println("The the first method");
		}


		@Test(priority=1,enabled=false)
		public void two() {
		System.out.println("The the second method");
		}

		@Test(priority=2,enabled=false)
		public void three() {
		System.out.println("The the third method");
		}

		@Test(priority=3)
		public void four() {
		System.out.println("The the fourth method");
		}


	}

