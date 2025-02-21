package demo;
import java.util.Scanner;
public class Vowel_Consonant 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a character:");
	        char ch = s.next().toLowerCase().charAt(0);

	        switch (ch) 
	        {
	            case 'a': case 'e': case 'i': case 'o': case 'u':
	                System.out.println(ch + "vowel");
	                break;
	            default:
	                if (Character.isLetter(ch))
	                {
	                    System.out.println(ch + "consonant");
	                }
	                else
	                {
	                    System.out.println("Invalid input! Please enter a letter");
	                }
	        }
	    }
	}
