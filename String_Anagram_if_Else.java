package demo;
import java.util.Scanner;
import java.util.Arrays;
public class String_Anagram 
{
	    public static String sortString(String str) 
	    {
	        char[] charArray = str.toCharArray();
	        Arrays.sort(charArray);
	        return new String(charArray);
	    }

	    public static void main(String[] args) 
	    {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter first string: ");
	        String str1 = s.next();
	        System.out.print("Enter second string: ");
	        String str2 = s.next();

	        if (str1.length() != str2.length())
	        {
	            System.out.println("Not an anagram.");
	        }
	        else if (sortString(str1).equals(sortString(str2)))
	        {
	            System.out.println("The strings are anagrams.");
	        }
	        else
	        {
	            System.out.println("The strings are not anagrams.");
	        }
	    }
	}

