package demo;
import java.util.Scanner;
public class Compare 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter two numbers: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        
	        if (a > b) 
	        {
	            System.out.println(a + ">" + b);
	        }
	        else if (a < b) 
	        {
	            System.out.println(a + "< " + b);
	        } else 
	        {
	            System.out.println(a + "="+ b);
	        }
	    }
	}
