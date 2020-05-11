package com.vbaixinho.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyMathTest {

	MyMath myMath = new MyMath();

	@Test
	public void testSum_with3numbers() {

		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
	}

	@Test
	public void testSum_with1numbers() {

		assertEquals(3, myMath.sum(new int[] { 3 }));
	}

}
