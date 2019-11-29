package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestExample {

	@Test
	void test() {
	//	fail("Not yet implemented");
		System.out.println("test successfully");
		AddExample ae=new AddExample();
		int actual=ae.addmethod(5, 5);
		int expected=11;
		assertEquals(expected, actual);
		
	}

}
