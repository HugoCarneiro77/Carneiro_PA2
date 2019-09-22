package carneiro_p1;

import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) 
	{
		//declaring variables
		Scanner in = new Scanner(System.in);
		int a, b, c, d;
		int aE, bE, cE, dE;
		int temp1, temp2;
		int choice;
		
		//user input
		System.out.println("Please enter the 4 digits in 4 separate lines");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		d = in.nextInt();
		
		//encryption
		aE = ((a + 7) % 10);
		bE = ((b + 7) % 10);
		cE = ((c + 7) % 10);
		dE = ((d + 7) % 10);

		//swaps digits
		temp1 = aE;
		temp2 = bE;
		aE = cE;
		bE = dE;
		cE = temp1;
		dE = temp2;
		
		//prints out encrypted number
		System.out.printf("%d%d%d%d\n", aE, bE, cE, dE);
	}
}
