package demo;
import java.util.Scanner;
public class Divisible_7_11
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();

	        if (num % 7 == 0) 
	        {
	            if (num % 11 == 0)
	            {
	                System.out.println(num + " is divisible by both 7 and 11.");
	            } 
	            else 
	            {
	                System.out.println(num + " is divisible by 7 but not by 11.");
	            }
	        } 
	        else 
	        {
	            if (num % 11 == 0) 
	            {
	                System.out.println(num + " is divisible by 11 but not by 7.");
	            }
	            else
	            {
	                System.out.println(num + " is not divisible by 7 or 11.");
	            }
	        }
	    }
	}

