package com.mare.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
        Scanner s = new Scanner(System.in);

        char userChoice = 'x';
        while(!(userChoice == 'q'))
        {
        	try {
        	   System.out.print("Enter the first number");
               double num1 = s.nextDouble();
               System.out.print("Enter the second number");
               double num2 = s.nextDouble();
        	System.out.println("Enter your choice ");
        	userChoice = s.next().charAt(0);
        	
        if(userChoice == '+')
        {
        	Addition adder = new Addition();

            System.out.println("The sum of the two number is " + adder.add(num1, num2));
        	
     
        }
        else if (userChoice == '-')
        {
        	Subtraction sub = new Subtraction();
        	System.out.println("the substraction is" + sub.substarct(num1,num2));
        	
        }
        else if (userChoice == '*')
        {
        multiplication mul = new multiplication();	
        System.out.println("the multi.. is " + mul.multiply(num1, num2));
        }
        else if (userChoice == '/')
        {
        	Division div = new Division();
        	System.out.println("the div.. is " + div.divide(num1, num2));
       
        }
        else
        {
        	System.out.println("invalid operation"); 
        }
        
        System.out.println("do you want to continue");
        userChoice = s.next().charAt(0);
        
        } catch (Exception e) {
        	    	
        	    	
        	       userChoice = s.next().charAt(0);
        	    }
    
    }
     
    }
    
}
