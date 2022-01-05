package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		 
		System.out.println("Informe os lados do tri�ngulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		double areaX = x.area();
		
		System.out.println("Informe os lados do tri�ngulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		double areaY = y.area();
		
		System.out.println("�rea do X: " + areaX);
		System.out.println("�rea do Y: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("MAIOR: X");
		} else {
			System.out.println("MAIOR: Y");
		}
		
		sc.close();
		
	}

}
