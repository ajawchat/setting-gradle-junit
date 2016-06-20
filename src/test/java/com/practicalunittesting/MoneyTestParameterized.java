package test.java.com.practicalunittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import main.java.com.practicalunittesting.Money;

@RunWith(JUnitParamsRunner.class)
public class MoneyTestParameterized {
	
	private static final Object[] getMoney(){
		Object[] params = new Object[]{
			 new Object[] {10, "USD"},
			 new Object[] {20, "EUR"}
		};
		return params;
	}
	
	@Test
	@Parameters(method = "getMoney")
	public void constructorShouldSetAmountAndCurrency(int amt, String currency){
		Money money = new Money(amt, currency);
		assertEquals(amt, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}
}
