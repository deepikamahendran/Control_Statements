package demo;
import java.util.Scanner;
public class Valid_Date 
{
	    public static boolean isValidDate(int day, int month, int year) 
	    {
	        if (month < 1 || month > 12) 
	        {
	            return false;
	        }

	        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	        if (month == 2) 
	        {
	            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	            {
	                daysInMonth[1] = 29;
	            }
	        }

	        return day >= 1 && day <= daysInMonth[month - 1];
	    }

	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter day, month, and year: ");
	        int day = s.nextInt();
	        int month = s.nextInt();
	        int year = s.nextInt();

	        if (isValidDate(day, month, year)) 
	        {
	            System.out.println("Valid Date");
	        }
	        else 
	        {
	            System.out.println("Invalid Date");
	        }
	    }
	}
