package string;

import java.util.Scanner;

public class stringjoin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a String1");
		String str1=scan.nextLine();
		System.out.println("enter a String2");
		String str2=scan.nextLine();
		System.out.println(joinstring( str1, str2));
		
		

	}
public static String joinstring(String str1,String str2) {
	return  str1+" "+str2;
}
}
