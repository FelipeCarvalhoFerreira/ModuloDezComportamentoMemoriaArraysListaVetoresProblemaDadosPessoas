package ModuloDezComportamentoMemoriaArraysListaVetoresProblemaDadosPessoas;

import java.util.Locale;
import java.util.Scanner;

import ModuloDezComportamentoMemoriaArraysListaVetoresProblemaMaisVelho.Pessoas;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double altura [] = new double [n];
		char genero [] = new char [n];
		
		
		
		for (int i = 0; i < n; i++) {

			System.out.printf("ALtura da %da pessoa: ", i + 1);
			altura [i]= sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: ", i + 1);
			genero [i]= sc.next().charAt(0);

			}
		double menorAltura = altura[0];
		double maiorAltura = altura [0];
		
		System.out.print("Menor Altura = ");
		for (int i = 0; i < n; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		System.out.printf("%.2f\n", menorAltura);
		
		System.out.print("Maior Altura = ");
		for (int i = 0; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		System.out.printf("%.2f\n", maiorAltura);
		
		double mediaAlturaMulheres = 0;
		double totalAlturaMulheres = 0;
		double totalHomens = 0.0;
		double totalMulher = 0.0;
		
		System.out.print("Media das alturas das mulheres = ");
		for (int i = 0; i < n; i++) {
			
			
			if(genero[i] == 'M') {
				totalHomens++;
				
			} else if(genero[i] == 'F') {
				totalMulher++;
				totalAlturaMulheres = totalAlturaMulheres + altura[i];
				
				
			}
			 
			
		}
		
		mediaAlturaMulheres = totalAlturaMulheres / totalMulher;
		
		System.out.printf("%.2f\n", mediaAlturaMulheres);
		System.out.print("Numero de homens = "+ totalHomens);

		sc.close();

	}

}
