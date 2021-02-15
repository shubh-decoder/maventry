package com.Day6exq1.sentenceQ;

import static org.junit.Assert.*;

import org.junit.Test;

public class Voweltest {

	@Test
	public void testVowelword() {
		//fail("Not yet implemented");
		App test = new App();
		//test1 
		assertArrayEquals("Test1:  ",new String[]{"india","is"},test.vowelword("india is my country"));
		//test2
		assertArrayEquals("Test2:  ",null,test.vowelword("Welcome to Java"));
		//test3
		assertNull("Empty string should return null", test.vowelword(""));
		
	}

}
