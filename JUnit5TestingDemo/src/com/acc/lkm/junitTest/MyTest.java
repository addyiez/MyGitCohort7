package com.acc.lkm.junitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import com.acc.lkm.programLogic.LogicTest;

class MyTest {
	LogicTest logicTest;

	@BeforeEach
	void setUp() throws Exception {
		logicTest=new LogicTest();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each Test");
	}

	@Test
	void test() {
		System.out.println("Test Case Find Max");
		assertEquals(10, logicTest.findMax(new int[] {4,7,1,10}));
		assertEquals(100, logicTest.findMax(new int[] {40,70,90,100}));
	}
	
	@RepeatedTest(3)
	@DisplayName("Ensure Correct Handling of Array Max Element")
	void testMaxElement() {
		assertEquals(200, logicTest.findMax(new int[] {18,87,200,150}));
		assertEquals(100, logicTest.findMax(new int[] {40,70,90,100}));
	}
   
	@AfterAll
	static void tearDownAll() {
		System.out.println("After all Tests");
	}
}
