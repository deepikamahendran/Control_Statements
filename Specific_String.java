package demo;
import java.util.Scanner;
public class Specific_String 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = s.nextLine();

	        if (str.length() >= 2) 
	        {
	            if (str.startsWith("AI")) 
	            {
	                System.out.println("The string follows the pattern.");
	            } 
	            else 
	            {
	                System.out.println("The string does not follow the pattern.");
	            }
	        }
	        else 
	        {
	            System.out.println("String is too short for pattern check.");
	        }
	    }
	}
