package demo;
import java.util.Scanner;
public class Positive_Negative_Nestedif 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int num = s.nextInt();

	        if (num > 0) {
	            System.out.println("The number is Positive.");
	        } 
	        else 
	        {
	            if (num < 0) 
	            {
	                System.out.println("The number is Negative.");
	            } 
	            else 
	            {
	                System.out.println("The number is Zero.");
	            }
	        }
	    }
	}

