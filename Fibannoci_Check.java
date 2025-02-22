package demo;
import java.util.Scanner;
public class Finanocci_Check 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the range (start and end): ");
	        int start = s.nextInt();
	        int end = s.nextInt();
	        int a = 0, b = 1, c = 0;
	        System.out.println("Fibonacci numbers in the given range:");

	        while (c <= end) 
	        {
	            if (c >= start) 
	            {
	                System.out.print(c + " ");
	            }
	            c = a + b;
	            a = b;
	            b = c;
	        }
	    }
	}
