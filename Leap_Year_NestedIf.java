package demo;
import java.util.Scanner;
public class LeapYear 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the range (start and end year): ");
	        int start = s.nextInt();
	        int end = s.nextInt();

	        System.out.println("Leap years in the given range:");
	        for (int year = start; year <= end; year++) 
	        {
	            if (year % 4 == 0) 
	            {
	                if (year % 100 == 0) 
	                {
	                    if (year % 400 == 0) 
	                    {
	                        System.out.println(year);
	                    }
	                } 
	                else 
	                {
	                    System.out.println(year);
	                }
	            }
	        }
	    }
	}

