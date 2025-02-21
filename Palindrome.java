package demo;
import java.util.Scanner;
public class Palindrome 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();
	        int temp = num;
	        int rev = 0;
	        while (temp > 0) 
	        {
	            rev = rev * 10 + temp % 10;
	            temp /= 10;
	        }

	        if (num == rev)
	        {
	            System.out.println(num + " is a palindrome.");
	        }
	        else
	        {
	            System.out.println(num + " is not a palindrome.");
	        }
	    }
	}
