import java.util.*;
public class PuzzleGame {
/*In this Game Our Program is guessing Number which user takes in mind while playing.
With Some inputs to our java program we can find the number
Lets Do It....*/
	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Any Number Keep in Mind \nWe will Guess It");


		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//PRINTING ARRAY
		for(int i=0;i<3;i++) {
			System.out.println("\n");
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]);
			}
		}

//Checking In  Row
		System.out.println("\nEnter Y Or N");
		for(int i=0;i<3;i++) {
			System.out.println("Is Your number in Row-"+i+"th");
			String ans = sc.nextLine();
			
			switch(ans) {
			case "y":System.out.println("Found"+i);
//Checking in Column
				System.out.println("Checking in Column..................");
				for (int j=0;j<3;j++) {
					System.out.println("Is your number in Column-"+j+"th");
					ans = sc.nextLine();
						switch(ans) {
							case "y":
								System.out.println("found"+j);
								System.out.println("Your Number is"+arr[i][j]);
								System.exit(0);
								
			case "n": continue;
				}
				
			}
			case "n":
				continue;
			}
		}

	}
	
}



