package demo;
import java.util.Scanner;
public class Divisors_Of_Numbers 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();

	        System.out.print("Divisors of " + num + " are: ");
	        for (int i = 1; i <= num; i++) 
	        {
	            if (num % i == 0) 
	            {
	                System.out.print(i + " ");
	            }
	        }
	    }
	}
