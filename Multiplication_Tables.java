package demo;
import java.util.Scanner;
public class Multiplication_Table 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number for the multiplication table: ");
	        int num = s.nextInt();

	        System.out.println("Multiplication Table for " + num);
	        for (int i = 1; i <= 10; i++) 
	        {
	            System.out.println(num + " x " + i + " = " + (num * i));
	        }
	    }
	}
