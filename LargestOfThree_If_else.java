package demo;
import java.util.Scanner;
public class LargestOfThree 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        
	        if (a >= b && a >= c)
	        {
	            System.out.println("Largest number is: " + a);
	        }
	        else if (b >= a && b >= c)
	        {
	            System.out.println("Largest number is: " + b);
	        }
	        else
	        {
	            System.out.println("Largest number is: " + c);
	        }
	        
	    }
	}

