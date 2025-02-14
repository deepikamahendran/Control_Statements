package demo;

import java.util.Scanner;

public class Name_of_day 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the day of the week:");
		String day = s.nextLine();
		switch(day)
		{
		case "sunday":
			System.out.println("Sunday - day 1");
			break;
		case "monday":
			System.out.println("Monday - day 2");
			break;
		case "tuesday":
			System.out.println("Tuesday - day 3");
			break;
		case "wednesday":
			System.out.println("Wednesday - day 4");
			break;
		case "thurday":
			System.out.println("Thursday - day 5");
			break;
		case "friday":
			System.out.println("Friday - day 6");
			break;
		case "saturday":
			System.out.println("Saturday - day 7");
			break;
			default:
				System.out.println("Invalid input enter valid day");
		}

	}

}
