package demo;

import java.util.Scanner;

public class Leap_Year 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		if (a % 400 == 0) 
		{
            System.out.println("LEAP YEAR");
        } 
		else if (a % 100 == 0) 
		{
            System.out.println("NOT LEAP YEAR");
        } 
		else if (a % 4 == 0) 
		{
            System.out.println("LEAP YEAR");
        } 
		else 
		{
            System.out.println("NOT LEAP YEAR");
        }
	}

}
