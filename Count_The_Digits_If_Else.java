package demo;
import java.util.Scanner;
public class Count_The_Digits 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();
	        int count = 0;
	        int temp = num;

	        while (temp != 0) 
	        {
	            count++;
	            temp /= 10;
	        }

	        if (num == 0)
	        {
	            System.out.println("Number of digits: 1");
	        }
	        else
	        {
	            System.out.println("Number of digits: " + count);
	        }
	    }
	}
