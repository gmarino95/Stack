package it.uniba.tutorial.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniba.tutorial.CollezioneVuotaException;
import it.uniba.tutorial.NumeroNegativoException;
import it.uniba.tutorial.Stack;

public class StackTest {

	Stack stack;
	
	@Before
	public void setUp() throws Exception {	
		stack = new Stack();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testPush() throws NumeroNegativoException {
		
		//Act
		stack.push(3);
		stack.push(5);
		stack.push(10);
		
		//Assert
		assertEquals(3, stack.size());
	}
	
	@Test
	public void testPop() throws NumeroNegativoException, CollezioneVuotaException {
		
		//Act
		stack.push(3);
		stack.push(6);
		
		stack.pop();
		
		//Assert
		assertEquals(1, stack.size());
	}
	
	@Test 
	public void testisEmpty() throws NumeroNegativoException, CollezioneVuotaException {
		
		//Act
		stack.push(1);
		
		stack.pop();
		
		//Assert
		assertTrue(stack.isEmpty());
	}
	
	@Test
	public void testpeek() throws NumeroNegativoException, CollezioneVuotaException {
		
		//Act
		stack.push(5);
		stack.push(6);
		
		//Assert
		assertEquals(5, stack.peek());
	}
	
	@Test(expected = NumeroNegativoException.class)
	public void testNumeroNegativoException() throws NumeroNegativoException {
		stack.push(-1);
	}
	
	@Test(expected = CollezioneVuotaException.class)
	public void testCollezioneVuotaException() throws CollezioneVuotaException {
		stack.pop();
	}
	
	//@Test()
}
