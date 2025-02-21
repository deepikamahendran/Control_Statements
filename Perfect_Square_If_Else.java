package demo;
import java.util.Scanner;
public class Perfect_square 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();
	        int sqrt = (int) Math.sqrt(num);

	        if (sqrt * sqrt == num)
	        {
	            System.out.println(num + " is a perfect square.");
	        }
	        else
	        {
	            System.out.println(num + " is not a perfect square.");
	        }
	    }
	}
