// Evan White
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ArrayList2EW {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(new File("wordList.txt"));
		
		ArrayList <String> list1 = new ArrayList <String>();
		
		ArrayList <String> list2 = new ArrayList <String>();
		
		while(input.hasNext())
		{
			list1.add(input.nextLine());
		}
		
		System.out.println("Size of list 1: " + list1.size());
		System.out.println();
		
		for(int w = 0; w < list1.size(); w++)
     {
			int WordLength = list1.get(w).length();
	
		if(list1.get(w).charAt(WordLength - 1) == 't')
		 {
			String holder = list1.get(w);
			list2.add(holder);
			list1.remove(holder);
		 }
     }
		for( int w = 0; w < list2.size(); w++)
		{
			System.out.println(list2.get(w));
		}
		
		System.out.println("Size of List 1: " + list1.size());
		System.out.println("Size of List 2: " + list2.size());
		
	}
  }
/*
Size of list 1: 50

robust
default
output
import
element
Size of List 1: 45
Size of List 2: 5
*/