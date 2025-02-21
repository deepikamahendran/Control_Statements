package demo;
import java.util.Scanner;
public class Grade 
{
	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter marks: ");
	        int marks = s.nextInt();
	        char grade;
	        
	        switch (marks / 10) 
	        {
	            case 10,9:
	                grade = 'A';
	                break;
	            case 8:
	                grade = 'B';
	                break;
	            case 7:
	                grade = 'C';
	                break;
	            case 6:
	                grade = 'D';
	                break;
	            case 5:
	                grade = 'E';
	                break;
	            default:
	                grade = 'F';
	                break;
	        }

	        System.out.println("Grade: " + grade);
	    }
	}

