package accountTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import account.Account;
import account.InsufficientFundsException;

public class AccountTest extends Account {
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void Test(){
		@SuppressWarnings("unused")//used in different class
		Account defaultAccount = new Account();
		Account newAccount = new Account(1122, 20000.00, .045, getDateCreated());
		assertTrue(newAccount.getId() == 1122);
		setId(getId());
		assertTrue(newAccount.getBalance() == 20000.00);
		setBalance(getBalance());
		assertTrue(newAccount.getAnnualInterestRate() == .045);
		setAnnualInterestRate(getAnnualInterestRate());
		assertTrue(newAccount.withdraw(2500) == 2500);
		assertTrue(newAccount.deposit(3000) == 3000);
		System.out.print("Your current balance is " + newAccount.getBalance() + ". Your monthly interest is " + (newAccount.getMonthlyInterstRate() * 100) + "%. Your account was created on " + newAccount.getDateCreated() + ".");
	}
	
	@Test (expected = Exception.class)
	public final void testWithdraw() throws Exception{
		Account newAccount = new Account(0, 0, 0, getDateCreated());
		newAccount.deposit(500.00);
		assertEquals((long)newAccount.getBalance(), (long)500.00);
	newAccount.withdraw(1000.00);
	}
	
	@Test
	public final void testDeposit(){
		Account newAccount = new Account(0, 0, 0, getDateCreated());
		int x = 0;
		
		while(x < 50){
			newAccount.deposit(10000);
		}
	}

	
}
