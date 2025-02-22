package demo;
import java.util.Scanner;
public class Valid_Palindrome 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = s.nextLine();
	        String rev = "";
	        
	        int len = str.length();
	        for (int i = len - 1; i >= 0; i--) 
	        {
	            rev += str.charAt(i);
	        }

	        if (str.equalsIgnoreCase(rev)) 
	        {
	            System.out.println("The string is a Palindrome.");
	        } 
	        else 
	        {
	            System.out.println("The string is not a Palindrome.");
	        }
	    }
	}

