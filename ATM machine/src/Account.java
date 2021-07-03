import java.util.*;

public class Account {
	double amount;
	private int AccountNo;
	private int Pin;
	double balance=0;
	Scanner sc=new Scanner(System.in);
	public void CheckBalance() {
		System.out.println("Your Balance is "+balance);
	}
	public void withdrawMoney() {
		System.out.println("Enter Amount:");
		amount=sc.nextDouble();
		if (amount>balance) {
			System.out.println("Insufficient Balance");
		}
		else {
			balance=balance-amount;
			System.out.println("Your Money is Withdrawn\n Your New Balance is"+balance);
		}
	}
	public void depositMoney() {
		System.out.println("Enter Ammount");
		amount=sc.nextDouble();
		balance= balance+amount;
		System.out.println("Your money is Deposited \n New Balance is "+balance);
		
	}
	public int getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(int accountNo) {
		AccountNo = accountNo;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
}
