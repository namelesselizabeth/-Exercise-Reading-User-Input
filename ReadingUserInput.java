package exercise_week_2;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a number between 50 and 300");
		String numberInput = input.nextLine();
		
		Integer convertedInput = Integer.parseInt(numberInput);
		
		/* Either or works
		if(convertedInput >= 50) {
			
			if(convertedInput <= 300) {
				System.out.println("Yes!");
			} else {
				System.out.println("No!");
			}
			
		} else {
			System.out.println("No!");
		}
		*/
		
		if (convertedInput >=50 && convertedInput <= 300) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		
	}

}
