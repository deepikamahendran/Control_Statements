package demo;
import java.util.Scanner;
public class String_is_Palindrome 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = s.next();
	        String rev = "";

	        for (int i = str.length() - 1; i >= 0; i--)
	        {
	            rev += str.charAt(i);
	        }
	        if (str.equals(rev))
	        {
	            System.out.println(str + " is a palindrome.");
	        }
	        else
	        {
	            System.out.println(str + " is not a palindrome.");
	        }
	    }
	}
