package demo;
import java.util.Scanner;
public class Largest_Number
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = s.nextInt();
	        System.out.print("Enter numbers: ");
	        int max = s.nextInt();
	        for (int i = 1; i < n; i++) 
	        {
	            int num = s.nextInt();
	            if (num > max) {
	                max = num;
	            }
	        }
	        System.out.println("The largest number is: " + max);
	    }
	}
