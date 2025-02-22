package demo;
import java.util.Scanner;
public class GCD_LCM 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int x = a, y = b;
	        while (y != 0) 
	        {
	            int temp = y;
	            y = x % y;
	            x = temp;
	        }
	        int gcd = x;
	        int lcm = (a * b) / gcd;
	        System.out.println("GCD: " + gcd);
	        System.out.println("LCM: " + lcm);
	    }
	}

