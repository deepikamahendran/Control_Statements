package demo;
import java.util.Scanner;
public class Day_With_Date 
{
    public static String getDayOfWeek(int day, int month, int year) 
    {
        if (month < 3) 
        {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;

        int dayIndex = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        String[] days = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

        return days[dayIndex];
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter day, month, and year: ");
        int day = s.nextInt();
        int month = s.nextInt();
        int year = s.nextInt();
        System.out.println("Day of the week: " + getDayOfWeek(day, month, year));
    }
}

