package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159;

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio: ");
		double radius = sc.nextDouble();
		
		double c = circunference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circunferente: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi Value: %.2f%n", PI);
	
		
		sc.close();
	}
	
	public static double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
