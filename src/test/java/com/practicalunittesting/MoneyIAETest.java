package test.java.com.practicalunittesting;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import main.java.com.practicalunittesting.Money;

@RunWith(JUnitParamsRunner.class)
public class MoneyIAETest {
	
	private final static int VALID_AMT = 5;
	private final static String VALID_CURRENCY = "USD";
	
	private static final Object[] getInvalidAmount(){
		return new Integer[][]{{-12}, {-5}, {-1}};
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidAmount")
	public void constructorShouldThrowIAEAmount(int invalidAmount){
		new Money(invalidAmount, VALID_CURRENCY);
	}
	
	// Unit Test Currency
	private static final Object[] getInvalidCurrency(){
		return new String[][]{{null}, {""}};
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidCurrency")
	public void constructorShouldThrowIAECurrency(String invalidCurrency){
		new Money(VALID_AMT, invalidCurrency);
	}
	
}
