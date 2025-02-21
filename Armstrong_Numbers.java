package demo;
import java.util.Scanner;
public class Armstrong_Number 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();
	        int temp = num;
	        int sum = 0;
	        int digits = 0;
	        int temp1 = num;
	        while (temp1 > 0) 
	        {
	            digits++;
	            temp1 /= 10;
	        }
	        while (temp > 0) 
	        {
	            int digit = temp % 10;
	            sum += Math.pow(digit, digits);
	            temp /= 10;
	        }
	        if (sum == num)
	        {
	            System.out.println(num + " is an Armstrong number.");
	        }
	        else
	        {
	            System.out.println(num + " is not an Armstrong number.");
	        }
	    }
	}
