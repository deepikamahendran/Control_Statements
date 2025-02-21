package demo;
import java.util.Scanner;
public class Automorphic 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = s.nextInt();
	        int sq = num * num;

	        if (sq % 10 == num || sq % 100 == num || sq % 1000 == num)
	        {
	            System.out.println(num + " is an Automorphic number.");
	        }
	        else
	        {
	            System.out.println(num + " is not an Automorphic number.");
	        }
	    }
	}
