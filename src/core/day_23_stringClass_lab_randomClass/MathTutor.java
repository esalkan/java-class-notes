/**
 * 
 */
package core.day_23_stringClass_lab_randomClass;

import java.util.Random;
import java.util.Scanner;

/**
 * @author esalkan
 *
 */
public class MathTutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		int userAnswer;

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		num1 = rn.nextInt(100);
		num2 = rn.nextInt(100);

		System.out.println("What is the asnwer to do following problem?");
		System.out.println(num1 + " + " + num2 + " ? ");

		System.out.println("Please enter your answer : ");
		userAnswer = sc.nextInt();
		int result = num1 + num2;

		if (result == userAnswer) {
			System.out.println("Great Job");
		} else {
			System.out.println("Nope you are wrong");
		}

	}

}
