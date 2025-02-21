package demo;
import java.util.Scanner;
public class Factorial_Recursion 
{
	    public static int factorial(int n) 
	    {
	        if (n == 0 || n == 1)
	            return 1;
	        return n * factorial(n - 1);
	    }

	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();

	        if (num < 0)
	        {
	            System.out.println("Factorial is not defined for negative numbers.");
	        }
	        else
	        {
	            System.out.println("Factorial of " + num + " is: " + factorial(num));
	        }
	        s.close();
	    }
	}

