package demo;
import java.util.Scanner;
public class Prime_Numbers_Range 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the range (start and end): ");
	        int start = s.nextInt();
	        int end = s.nextInt();
	        
	        for (int num = start; num <= end; num++) 
	        {
	            if (num > 1) 
	            {
	                boolean isPrime = true;
	                for (int i = 2; i * i <= num; i++) 
	                {
	                    if (num % i == 0) 
	                    {
	                        isPrime = false;
	                        break;
	                    }
	                }
	                if (isPrime)
	                {
	                    System.out.println(num + " is a prime number");
	                }
	                else
	                {
	                    System.out.println(num + " is not a prime number");
	                }
	            }
	        }
	    }
	}
