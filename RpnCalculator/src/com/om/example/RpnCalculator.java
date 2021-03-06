package com.om.example;

import java.math.BigDecimal;
import java.util.Stack;

public class RpnCalculator {
	
    private Stack<BigDecimal> values = new Stack<BigDecimal>(); 
	
	public BigDecimal getAccumulator() {
		if(values.size() > 0){
		    return values.peek();
		} else {
			return BigDecimal.ZERO;
		}
		
	}

	public void setAccumulator(BigDecimal value) {
		if(values.size() > 0){
		values.pop();
		}
		values.push(value);
			
	}

	public void enter() {
		values.push(getAccumulator());
		
	}

	public void drop() {
		if(values.size() > 0)
		values.pop();
		
	}

}
