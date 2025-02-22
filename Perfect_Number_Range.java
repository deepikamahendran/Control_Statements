package demo;
import java.util.Scanner;
public class Perfect_Number_Range 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the range (start and end): ");
	        int start = s.nextInt();
	        int end = s.nextInt();

	        System.out.println("Perfect numbers in the given range:");
	        for (int num = start; num <= end; num++) 
	        {
	            int sum = 0;
	            for (int i = 1; i < num; i++) 
	            {
	                if (num % i == 0) 
	                {
	                    sum += i;
	                }
	            }
	            if (sum == num) 
	            {
	                System.out.println(num);
	            }
	        }
	    }
	}

