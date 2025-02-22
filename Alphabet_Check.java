package demo;
import java.util.Scanner;
public class Alphabet_Check 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char ch = s.next().charAt(0);

	        if (ch >= 'A' && ch <= 'Z') 
	        {
	            System.out.println("Uppercase Alphabet");
	        }
	        else 
	        {
	            if (ch >= 'a' && ch <= 'z') 
	            {
	                System.out.println("Lowercase Alphabet");
	            }
	            else 
	            {
	                System.out.println("Non-Alphabet Character");
	            }
	        }
	    }
	}
