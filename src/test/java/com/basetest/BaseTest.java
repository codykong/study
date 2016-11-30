package com.basetest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(JUnit4.class)
public class BaseTest {
	
	@Before
	public void preTest(){
		System.out.println("----------------------------");
	}
	
	@After
	public void endTest(){
		System.out.println("----------------------------");
	}
	
	@Test
	public void testTest(){
        System.out.println("-----------------------------");
	}
}

