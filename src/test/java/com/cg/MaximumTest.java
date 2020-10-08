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
		assertEquals((Integer)9,(Integer)max.findMax(9, 2, 4));
	}	
	@Test
	public void testCase1_2() {
		assertEquals((Integer)20,(Integer)max.findMax(9, 20, 4));
	}
	@Test
	public void testCase1_3() {
		assertEquals((Integer)30,(Integer)max.findMax(9, 2, 30));
	}
	@Test
	public void testCase2_1() {
		assertEquals((Float)9.0F,(Float)max.findMax(9.0F, 2.0F, 3.0F));
	}
	@Test
	public void testCase2_2() {
		assertEquals((Float)20.0F,(Float)max.findMax(9.0F, 20.0F, 12.0F));
	}
	@Test
	public void testCase2_3() {
		assertEquals((Float)30.0F,(Float)max.findMax(9.0F, 2.0F, 30.0F));
	}
	@Test
	public void testCase3_1() {
		assertEquals("Peach",max.findMax("Peach","Apple","Banana"));
	}
	@Test
	public void testCase3_2() {
		assertEquals("Peach",max.findMax("Apple","Peach","Banana"));
	}
	@Test
	public void testCase3_3() {
		assertEquals("Peach",max.findMax( "Banana", "Apple","Peach"));
	}
}