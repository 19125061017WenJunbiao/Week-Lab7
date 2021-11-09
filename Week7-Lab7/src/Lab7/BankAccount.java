package Lab7;

public class BankAccount {
  private double balance;
  private String belong;
  
  
  public BankAccount(double balance, String belong) {
	  this.balance = balance;
	  this.belong = belong;
	  
	}
public boolean deposit(double increase) {
	if(increase<0)
		return false;
	else if((balance+increase)<0)
		return false;
	else { balance = balance + increase;
	return true;
	}

	
}
public boolean withdraw(double decrease) {
	
	if(decrease<0)
		return false;
	
	else if((balance-decrease)<0)
		return false;
	else { balance = balance - decrease;
	return true;
	}
	
	
	
	
}

public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}


public String getBelong() {
	return belong;
}


public void setBelong(String belong) {
	this.belong = belong;
}
	
	
	
}
