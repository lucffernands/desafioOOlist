package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Digite os dados do " + (i + 1) + "o contribuinte:");
			System.out.print("Renda anual com salário: ");
			double salaryincome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesincome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalincome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			list.add(new TaxPayer(salaryincome, servicesincome, capitalincome, healthSpending, educationSpending));
		}
			
	    int i = 1;
		for (TaxPayer obj : list) {	
			System.out.println();
			System.out.printf("Resumo do %do contribuinte:", i++);
			System.out.println();
			System.out.printf("Imposto bruto total: %.2f%n", obj.grossTax());
			System.out.printf("Abatimento: %.2f%n", obj.TaxRebate());
			System.out.printf("Imposto devido: %.2f%n", obj.netTax());
		}

		sc.close();
	}
}
