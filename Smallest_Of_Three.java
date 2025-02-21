package demo;
import java.util.Scanner;

public class Smallest_of_three
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter three numbers: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        int minimum = (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);
	        System.out.println("Smallest number is: " + min);
	    }
	}

