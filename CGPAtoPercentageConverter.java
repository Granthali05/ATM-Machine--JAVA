import java.util.*;
public class CGPAtoPercentageConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CGPAtoPercentageConverter cp=new CGPAtoPercentageConverter();
		cp.Print();
	}
	void Print() {
		System.out.println("MY CONVERTER");
		System.out.println("Choose following option:");
		System.out.println("1.Convert into CGPA");
		System.out.println("2.Convert into Percentage");
		System.out.println("3.Exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:CGPAConverter(); 
				break;
		case 2:PercentageConverter();
				break;
		case 3:System.exit(0);
		}
	}
	
	Scanner sc=new Scanner(System.in);
	double result;
	
	void CGPAConverter() {
	System.out.println("Enter your CGPA:");
	double Cgpa=sc.nextDouble();
	
	if(Cgpa<10) {
		result=Cgpa*9.5;
		System.out.println("Your Percentage is "+result+"%");
	}
	else {
		System.out.println("Couldn't Process...Please continue...");
		CGPAConverter();
	}
	}
	
	
	void PercentageConverter() {
		System.out.println("Enter your Percentage");
		double percentage=sc.nextDouble();
		if(percentage<100) {
			result=percentage/9.5;
			System.out.println("Your CGPA is"+result);
		}
		else {
			System.out.println("Couldn't Process...Please continue...");
			PercentageConverter();
		}

	}

}
