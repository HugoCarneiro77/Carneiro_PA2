package carneiro_p3;

import java.util.Scanner;

public class carneiro_p3 {
	public static void main(String[] args) 
    {
		//declaring variables
		Scanner in = new Scanner(System.in);
		int x, i, j;
		int avg1 = 0, avg2 = 0, avg3 = 0, avg4 = 0, avg5 = 0;
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;

		int[][] responses = new int[5][10];
		String[] topics = new String[5];
		topics[0] = "Video games";
		topics[1] = "Movies";
		topics[2] = "Music";
		topics[3] = "Sports";
		topics[4] = "Netflix";
		
		
		System.out.println("POLLING PROGRAM");
		System.out.println("You will be given 5 topics, rate each topic from 1(least important) to 10(most important)");
		
		//gets user input
		for(i = 0; i < 10; i++)
		{
			System.out.printf("Responder Number %d\n", i + 1);
			
			System.out.printf("%s\n", topics[0]);
			responses[0][i] = in.nextInt();
			
			System.out.printf("%s\n", topics[1]);
			responses[1][i] = in.nextInt();
			
			System.out.printf("%s\n", topics[2]);
			responses[2][i] = in.nextInt();
			
			System.out.printf("%s\n", topics[3]);
			responses[3][i] = in.nextInt();
			
			System.out.printf("%s\n", topics[4]);
			responses[4][i] = in.nextInt();
			
			System.out.printf("Are there any more responders? (up to 10 responders)\n");
			System.out.printf("1. To exit ; Any other number to continue\n");
			x = in.nextInt();
			
			sum1 += responses[0][i];
			sum2 += responses[1][i];
			sum3 += responses[2][i];
			sum4 += responses[3][i];
			sum5 += responses[4][i];
			
			//ends for loop
			if(x == 1)
			{
				avg1 = sum1 / i; 
				avg2 = sum2 / i; 
				avg3 = sum3 / i; 
				avg4 = sum4 / i; 
				avg5 = sum5 / i; 
				
				break;
			}
			
		}
		
		//initializes all unused responses to 0
		for(j = i + 1; j < 10; j++)
		{
			responses[0][i] = 0;
			responses[1][i] = 0;
			responses[2][i] = 0;
			responses[3][i] = 0;
			responses[4][i] = 0;
		}
		
		//prints out table
		System.out.printf("   | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | AVG |\n");
		System.out.printf("___|___|___|___|___|___|___|___|___|___|____|_____|\n");
		System.out.printf(" 1 | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d |\n", 
				responses[0][0], responses[0][1], responses[0][2], responses[0][3], responses[0][4], 
				responses[0][5], responses[0][6], responses[0][7], responses[0][8], responses[0][9],
				avg1);
		System.out.printf(" 2 | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d |\n", 
				responses[1][0], responses[1][1], responses[1][2], responses[1][3], responses[1][4], 
				responses[1][5], responses[1][6], responses[1][7], responses[1][8], responses[1][9],
				avg2);
		System.out.printf(" 3 | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d |\n", 
				responses[2][0], responses[2][1], responses[2][2], responses[2][3], responses[2][4], 
				responses[2][5], responses[2][6], responses[2][7], responses[2][8], responses[2][9],
				avg3);
		System.out.printf(" 4 | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d |\n", 
				responses[3][0], responses[3][1], responses[3][2], responses[3][3], responses[3][4], 
				responses[3][5], responses[3][6], responses[3][7], responses[3][8], responses[3][9],
				avg4);
		System.out.printf(" 5 | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d | %d |\n", 
				responses[4][0], responses[4][1], responses[4][2], responses[4][3], responses[4][4], 
				responses[4][5], responses[4][6], responses[4][7], responses[4][8], responses[4][9],
				avg5);
    }
}
