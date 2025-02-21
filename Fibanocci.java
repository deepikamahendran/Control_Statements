package demo;
import java.util.Scanner;
public class Fibanocci 
{
	    public static boolean isPerfectSquare(int n) 
	    {
	        int sqrt = (int) Math.sqrt(n);
	        return (sqrt * sqrt == n);
	    }

	    public static boolean isFibonacci(int num) 
	    {
	        return isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4);
	    }

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (isFibonacci(num))
	            System.out.println(num + " is a Fibonacci number.");
	        else
	            System.out.println(num + " is not a Fibonacci number.");

	        sc.close();
	    }
	}

}
