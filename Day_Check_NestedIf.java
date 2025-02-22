package demo;
import java.util.Scanner;
public class Day_Check 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a day: ");
	        String day = s.nextLine().toLowerCase();

	        if (day.equals("saturday") || day.equals("sunday")) 
	        {
	            System.out.println(day + " is a Weekend.");
	        }
	        else 
	        {
	            if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") ||
	                day.equals("thursday") || day.equals("friday")) 
	            {
	                System.out.println(day + " is a Weekday.");
	            } 
	            else
	            {
	                System.out.println("Invalid day entered.");
	            }
	        }
	    }
	}
