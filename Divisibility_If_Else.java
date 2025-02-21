package demo;
import java.util.Scanner;
public class Divisibility 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();

	        if (num % 5 == 0 && num % 3 == 0)
	        {
	            System.out.println(num + " is divisible by both 5 and 3.");
	        }
	        else
	        {
	            System.out.println(num + " is not divisible by both 5 and 3.");
	        }
	    }
	}
