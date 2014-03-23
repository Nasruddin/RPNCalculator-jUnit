package com.om.example;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class ACalculatorWithThreeValuesShould {
	
	private RpnCalculator calculator;
	BigDecimal value = new BigDecimal(43);
	BigDecimal value2 = new BigDecimal(44);
	BigDecimal value3 = new BigDecimal(40);
	
	
	@Before
	public void init(){
		calculator = new RpnCalculator();
		calculator.setAccumulator(value);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
		}
	
	@Test
	public void HaveLastValueEntered(){
		assertEquals(value3, calculator.getAccumulator());
	}
	
	@Test
	public void HaveLastToValueEnteredAccumulator(){
		calculator.drop();
		assertEquals(value2, calculator.getAccumulator());
	}
	
	@Test
	public void HaveLastValueEnteredInAccumulator(){
		calculator.drop();
		calculator.drop();
		assertEquals(value, calculator.getAccumulator());
	}
	
	@Test
	public void HaveLastValueZero(){
		calculator.drop();
		calculator.drop();
		calculator.drop();
		assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
		
	}
	
}
