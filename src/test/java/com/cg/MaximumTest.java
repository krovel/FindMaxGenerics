/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cg;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumTest {
	Maximum max =new Maximum();

	@Test
	public void testCase1_1() {
		assertEquals((Integer)9,(Integer)max.findMaxInt(9, 2, 4));
	}	
	@Test
	public void testCase1_2() {
		assertEquals((Integer)20,(Integer)max.findMaxInt(9, 20, 4));
	}
	@Test
	public void testCase1_3() {
		assertEquals((Integer)30,(Integer)max.findMaxInt(9, 2, 30));
	}
}