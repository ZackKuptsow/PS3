package account;

public class InsufficientFundsException extends Account {
	public String insufficientFunds(){
	try{
	}catch(Exception InsufficientFundsException){
		if(getBalance() < withdraw(getBalance()))
			return ("Insufficient funds.");
		}
	return null;
	}
}


