package demo;
import java.util.Scanner;
public class Positive_Negative 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();

	        if (num >= 0) 
	        {
	            if (num == 0)
	            {
	                System.out.println("zero.");
	            }
	            else
	            {
	                System.out.println("positive.");
	            }
	        }
	            else 
	            {
	            System.out.println("negative.");
	            }
	    }
	}

