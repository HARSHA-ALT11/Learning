package elseifLadder.first;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your Score: ");
		int score = scan.nextInt();
		grade grade = new grade();
		grade.grade(score);
		
		
		
	}

}
