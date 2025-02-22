package demo;
import java.util.Scanner;
public class Triangle_Type 
{
	    public static void main(String[] args) 
	    {
	        Scanner s= new Scanner(System.in);
	        System.out.print("Enter three angles of the triangle: ");
	        int a = s.nextInt();
	        int b = s.nextInt();
	        int c = s.nextInt();

	        if (a + b + c == 180) 
	        {
	            if (a < 90 && b < 90 && c < 90) 
	            {
	                System.out.println("The triangle is Acute.");
	            } 
	            else
	            {
	                if (a == 90 || b == 90 || c == 90) {
	                    System.out.println("The triangle is Right-angled.");
	                } 
	                else 
	                {
	                    System.out.println("The triangle is Obtuse.");
	                }
	            }
	        }
	        else 
	        {
	            System.out.println("Invalid angles. The sum must be 180 degrees.");
	        }
	    }
	}

