package carneiro_p2;

import java.util.Scanner;

public class carneiro_p2 {
	public static void main(String[] args) 
    {
		//declaring variables
    	Scanner in = new Scanner(System.in);
    	int userChoice;
    	double weight;
    	double height;
    	double BMI;
    	
    	//user input
        System.out.println("Hello and Welcome to the BMI Calculator!");
        System.out.println("Please select one of the options:");
        System.out.println("1. Calculate BMI in the standard system");
        System.out.println("2. Calculate BMI in the metric system");
        userChoice = in.nextInt();
        
        //user chooses standard system
        if(userChoice == 1)
        {
        	//user input
        	System.out.println("You have chosen the standard system");
        	System.out.println("Please input your weight in pounds:");
        	weight = in.nextDouble();
        	
        	System.out.println("Please input your height in inches:");
        	height = in.nextDouble();
        	
        	//BMI calculator
        	BMI = ((703 * weight) / (height * height));
        	
        	System.out.printf("BMI = %.1f\n", BMI);
        	
        	//determines what range BMI is at
        	if(BMI < 18.5)
        	{
        		System.out.println("Your BMI level suggests you are underweight");
        	}
        	else if(18.5 <= BMI && BMI <= 24.9)
        	{
        		System.out.println("Your BMI level suggests you are normal weight");
        	}
        	else if(25 <= BMI && BMI <= 29.9)
        	{
        		System.out.println("Your BMI level suggests you are overweight");
        	}
        	else if(BMI > 30)
        	{
        		System.out.println("Your BMI level suggests you are obese");
        	}
        }
        
        //user chooses metric system
        if(userChoice == 2)
        {
        	System.out.println("You have chosen the metric system");
        	System.out.println("Please input your weight in kilograms:");
        	weight = in.nextDouble();
        	
        	System.out.println("Please input your height in meters:");
        	height = in.nextDouble();
        	
        	BMI = (weight / (height * height));
        	
        	System.out.printf("BMI = %.1f\n", BMI);
        	
        	if(BMI < 18.5)
        	{
        		System.out.println("Your BMI level suggests you are underweight");
        	}
        	else if(18.5 <= BMI && BMI <= 24.9)
        	{
        		System.out.println("Your BMI level suggests you are normal weight");
        	}
        	else if(25 <= BMI && BMI <= 29.9)
        	{
        		System.out.println("Your BMI level suggests you are overweight");
        	}
        	else if(BMI > 30)
        	{
        		System.out.println("Your BMI level suggests you are obese");
        	}
        }
        
        else if(userChoice != 1 && userChoice != 2)
        {
        	System.out.println("Please pick a valid option");
        }
    }
}

    