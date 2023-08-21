package tempratureconverter;

import java.util.Scanner;

public class tempratureconverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a temprature");
		double F=scan.nextDouble();
		tempraturecoverter temperatureconverter = new temperatureconverter();

		System.out.println(temperatureconverter.convertFahrenheitToCelsius());

		
		
		
	}

}
