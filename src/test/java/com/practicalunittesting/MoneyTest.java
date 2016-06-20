package test.java.com.practicalunittesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import main.java.com.practicalunittesting.Money;;

public class MoneyTest {

	@Test
	public void constructorShouldSetAmountAndCurrency(){
		Money money = new Money(10, "USD");
		assertEquals(10, money.getAmount());
		assertEquals("USD", money.getCurrency());
		assertNotEquals(20, money.getAmount());
	}
}
