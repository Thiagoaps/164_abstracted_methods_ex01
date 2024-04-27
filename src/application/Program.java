package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Entreprise;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthCare = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthCare));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Entreprise(name, annualIncome, numberOfEmployees));
			}		
		}
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer taxPayer : list) {
			System.out.printf("%s: $ %.2f%n", taxPayer.getName(), taxPayer.tax());
			sum += taxPayer.tax();
		}
			
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}
}
