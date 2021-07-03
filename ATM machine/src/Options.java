import java.util.*;
import java.awt.color;
public class Options extends Account {

	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Integer> hs=new HashMap<>();
	
public void Login() {
		try {
		hs.put(19123,1212);
		hs.put(19129, 1002);
		System.out.println("Enter Your Customer ID");
		setAccountNo(sc.nextInt());
		
		System.out.println("Enter Pin");
		setPin(sc.nextInt());
		int gn=getAccountNo();
		int gp=getPin();
		
		if(hs.containsKey(gn) && hs.get(gn)== gp) {
		System.out.println("You are Loginned Successfully");
		ATMMachine();
		}
		else {
			System.out.println("Wrong Password");
			Login();
		}
		

//		if(data.containsKey(cn) && data.get(cn)== sn) {
//		ATMMachine();
//		}
//		else {
//			System.out.println("Wrong Pin OR Password");
//		}
	}
	catch(Exception e){
		System.out.println("Something went wrong please login again");
		Login();
	}
	finally {
//	System.out.println(	"Welcome To Our ATM machine");
	
	}
	
}

void ATMMachine() {
	System.out.println("Enter Options");
	System.out.println("1.Check Balance");
	System.out.println("2.Withdraw Money");
	System.out.println("3.Deposit Money");
	System.out.println("4.Exit");
	System.out.println("Your Choice is:");
	int choice =sc.nextInt();

	switch(choice)
	{

	case 1:
//		System.out.println("This option Checks Balanace");
			CheckBalance();
			ATMMachine();
			break;
	case 2:
//		System.out.println("this option is to WithDraw Money");
			withdrawMoney();
			ATMMachine();
			break;
	case 3: 
//		System.out.println("Crediting Money Now");
		depositMoney();
			ATMMachine();
			break;
	case 4: System.out.println("Thank you For Loginning In...\n Bye Bye!!!! ");
	Login();
			break;
	default: System.out.println("Invalid Choice");
	ATMMachine();
	}
	
	
}







}
