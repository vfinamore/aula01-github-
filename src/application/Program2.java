package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator();
		
		System.out.println("Digite o raio: ");
		double radius = sc.nextDouble();
		
		double c = calc.circunference(radius);
		
		double v = calc.volume(radius);
		
		System.out.printf("Circunferente: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi Value: %.2f%n", calc.PI);
	
		
		sc.close();
	}
}