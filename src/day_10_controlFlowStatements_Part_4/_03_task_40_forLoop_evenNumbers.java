/**
 * 
 */
package day_10_controlFlowStatements_Part_4;

/**
 * @author esalkan
 *
 */
public class _03_task_40_forLoop_evenNumbers {

	/**
	 * @param args
	 */
	
	//	Write a program that displays all even numbers between 1-100 in same line
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.print(i +", ");
			}
		}
	}

}
