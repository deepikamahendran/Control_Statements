package demo;
import java.util.Scanner;
public class Greatest_of_four 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter four numbers: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();
	        int d = s.nextInt();
	        int max = (a > b) ? ((a > c) ? ((a > d) ? a : d) : (c > d ? c : d)):(b > c) ? ((b > d) ? b : d) : (c > d ? c : d);
	        System.out.println("Greatest number is: " + max);
	    }
	}
