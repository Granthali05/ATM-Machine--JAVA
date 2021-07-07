import java.util.*;
public class Logic {
	double usd,rup,eur,jpy;
	int ch;
	Scanner sc=new Scanner(System.in);
	public void Print() {
		System.out.println("Welcome to Currency Converter");
		System.out.println("Choose Your Cuurency Pattern");
		System.out.println("1)USD 2)Rupee 3)EUR 4)JPY");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter The Amount to Convert");
			usd=sc.nextDouble();
			SelectOptions();
			break;
		case 2:
			System.out.println("Enter The Amount to Convert");
			rup=sc.nextDouble();
			SelectOptions1();
			break;

		case 3:
			System.out.println("Enter The Amount to Convert");
			eur=sc.nextDouble();
			SelectOptions2();
			break;

		case 4:
			System.out.println("Enter The Amount to Convert");
			jpy=sc.nextDouble();
			OptionsSelect3();
			break;
			//	case 5: System.out.println("BYE BYE");
		default:
			System.out.println("Choose Valid one");
			Print();
		}
	}


	public void SelectOptions() {
		System.out.println("Choose the Currency Type To Convert \n1)USD 2)Rupee 3)EUR 4)JPY ");
		ch =sc.nextInt();
		switch(ch) {
		case 1:System.out.println(usd+"usd");
		cont();
		break;
		case 2:rup=usd*74.38;
		System.out.println(rup+"rupees");
		cont();
		break;
		case 3:eur=usd*0.85;
		System.out.println(eur+"euro");
		cont();
		break;
		case 4:jpy=usd*110.79;
		System.out.println(jpy+"yen");
		cont();
		break;
		default: System.out.println("Choose Valid option");
		SelectOptions();
		}

	}

	public void SelectOptions1() {
		System.out.println("Choose the Currency Type To Convert \n1)USD 2)Rupee 3)EUR 4)JPY");
		ch =sc.nextInt();
		switch(ch) {
		case 1:usd=rup/74.38;
		System.out.println(usd+"usd");
		cont();

		break;
		case 2:System.out.println(rup+"rupees");
		cont();
		break;

		case 3:eur=rup*0.011;
		System.out.println(eur+"euro");
		cont();
		break;
		case 4: jpy=usd*1.48;
		System.out.println(jpy+"yen");
		cont();
		break;
		default: System.out.println("Choose Valid option");
		SelectOptions1();
		}
	}
	public void SelectOptions2() {
		System.out.println("Choose the Currency Type To Convert \n1)USD 2)Rupee 3)EUR 4)JPY");
		ch =sc.nextInt();
		switch(ch) {
		case 1:usd=eur*1.18;
		System.out.println(usd+"usd");
		cont();
		break;

		case 2:rup=eur*88.22;
		System.out.println(rup+"rupees");
		cont();
		break;

		case 3:System.out.println(eur+"euro");
		cont();
		break;

		case 4:jpy=eur*130.96;
		System.out.println(jpy+"yen");
		cont();
		break;

		default: System.out.println("Choose Valid option");
		SelectOptions2();
		}
	}
	public void OptionsSelect3() {
		System.out.println("Choose the Currency Type To Convert \n1)USD 2)Rupee 3)EUR 4)JPY");
		ch =sc.nextInt();
		switch(ch) {

		case 1:usd=jpy*0.0090;
		System.out.println(usd+"usd");
		cont();
		break;

		case 2:rup=jpy*0.76;
		System.out.println(rup+"rupees");
		cont();
		break;

		case 3:eur=jpy*0.0076;
		System.out.println(eur+"euro");
		cont();
		break;

		case 4:System.out.println(jpy+"yen");
		cont();
		break;

		default: System.out.println("Choose Valid option");
		OptionsSelect3();

		}

	}


	public void cont() {
		System.out.println("Do u want to continue ('y' or 'n')");
		String a=sc.next();
		switch(a) {
		case "y":Print();
		break;
		case "n":System.out.println("Thanks For Using");
		break;
		default: System.out.println("Enter in y or n");
		System.exit(0);
		}
	}

}
