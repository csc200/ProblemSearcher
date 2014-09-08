package nvcc.csc200.lecture;
import java.util.Scanner;
/*
  multiple line comments in java
 */
/**
 * A program to find chapter number and problem number based on student ID
 * @author tkanchanawanchai6403
 * Date: 9/3/2014
 * 
 * Algorithm:
 * 1. Prompt the user for student ID
 * 2. Read and calculate student ID 
 * 3. If student ID is odd, output chapter1 -> !(studentID%2==0) or (studentID%2==1)
 * 4. If student ID is even, output chapter2 -> (studentID%2==0)
 * 5. If the chapter number is 1, divide your student ID by 10, 
 *    consider the remainder and increment it by 1, output the problem number
 * 6. If the chapter number is 2, divide your student ID by 11, 
 *    consider the remainder and increment it by 1, output the problem number
 */

public class ProblemFinder {

	public static void main(String[] args) {
		int id;
		//Prompt the user for input
		System.out.println("Enter a student ID");
		//instantiation - an action to create a new instance
		Scanner sc = new Scanner(System.in);
		//read input from user keyboard as an integer
		id = sc.nextInt();
		
		//If student ID is odd, output chapter1
		if (id%2==1) {
			//If the chapter number is 1, divide your student ID by 10 and increment by 1
			System.out.println("Chapter1 " + "Problem number " + ((id%10)+1));
		} else {
			//If the chapter number is 2, divide your student ID by 11 and increment by 1
			System.out.println("Chapter2 " + "Problem number " + ((id%11)+1));
		}
	}
}
