package Test;

import org.junit.*;

import Logic.Calculator;

public class CalculatorTest {
	
	private Calculator calc;
	private Object ArithmeticException;
	
	@Before
	private void setup() {
		
		calc = new Calculator();
		
	}
	
	@Test
	public void calculatorTest1() {		
		
		Assert.assertEquals(9, calc.addtion(6,3));		
		
	}
	
	@Test
	public void calculatorTest2() {		
		
		Assert.assertEquals(6, calc.addtion(6,0));		
		
	}
	
	@Test
	public void calculatorTest3() {		
		
		Assert.assertEquals(3, calc.subtraction(6,3));		
		
	}
	
	@Test
	public void calculatorTest4() {		
		
		Assert.assertEquals(6, calc.subtraction(6,0));		
		
	}
	
	@Test
	public void calculatorTest5() {		
		
		Assert.assertEquals(-3, calc.subtraction(3,6));		
		
	}
	
	@Test
	public void calculatorTest6() {		
		
		Assert.assertEquals(6, calc.multiplication(3,2));		
		
	}
	
	@Test
	public void calculatorTest7() {		
		
		Assert.assertEquals(5, calc.division(10,2));		
		
	}
	
	@Test
	public void calculatorTest8() {		
		
		Assert.assertEquals(2, calc.division(5,2));		
		
	}
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void calculatorTest9() {		
		
		Assert.assertEquals(ArithmeticException, calc.division(10,0));		
		
	}
	
	@Test
	public void calculatorTest10() {		
		
		Assert.assertEquals(0, calc.multiplication(3,0));		
		
	}

}
