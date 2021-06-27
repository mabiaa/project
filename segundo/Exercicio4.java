package Array;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		int opcao;
		double constante = 0;
		
		double [][] matrizA = new double[2][2];
		double [][] matrizB = new double[2][2];
		double [][] matrizC = new double[2][2];
		
		for (int l = 0 ; l < 2 ; l++) {
			for(int c = 0 ; c < 2 ; c++) {
				System.out.println(" Digite o valor que está na linha " + l + " coluna " + c + " da matrizA[2][2] : " );
				matrizA[l][c] = ler.nextDouble();
				System.out.println(" Digite o valor que está na linha " + l + " coluna " + c + " da matrizB[2][2] : " );
				matrizB[l][c] = ler.nextDouble();
			}
		}
		
		do {
			System.out.println(" Escolha uma opção: \n(1) Somar as duas matrizes \n" + 
					"(2) Subtrair a primeira matriz da segunda \n" + 
					"(3) Adicionar uma constante as duas matrizes \n" + 
					"(4) Imprimir as matrizes \n" + "(5) Sair");
			
			opcao = ler.nextInt();
			
			
			switch(opcao) {
			case 1:
			System.out.println("MatrizC[2][2]");
				for(int l = 0 ; l < 2 ; l++) {
					for(int c = 0 ; c < 2 ; c++) {
						matrizC[l][c] = matrizA[l][c] + matrizB[l][c];
						System.out.print("\t \t" + matrizC[l][c]);
					}
					System.out.println("\n");
				}
				break;
				
			case 2:
			System.out.println("MatrizC[2][2]");
				for (int l = 0 ; l < 2 ; l++) {
					for (int c = 0 ; c < 2 ; c++) {
						matrizC[l][c] = matrizB[l][c] - matrizA[l][c];
						System.out.print("\t \t" + matrizC[l][c]);
					}
					System.out.println("\n");
				}			
				break;
				
			case 3:
				 System.out.println(" Digite um número que deseja adicionar as matrizes: ");
				 constante = ler.nextDouble();
				 
				for (int l = 0; l < 2 ; l++) {
					for(int c = 0 ; c < 2 ; c++) {
						matrizA[l][c] = matrizA[l][c] + constante;
						matrizB[l][c] = matrizB[l][c] + constante;
					}
				}
				
				System.out.println(" MatrizA[2][2] :");
				for (int l = 0 ; l < 2 ; l ++) {
					for(int c = 0 ; c < 2 ; c++) {
						System.out.print("\t \t" + matrizA[l][c]);
					}
					System.out.println("\n");
				}
				
				System.out.println(" MatrizB[2][2] :");
				for (int l = 0 ; l < 2 ; l ++) {
					for(int c = 0 ; c < 2 ; c++) {
						System.out.print("\t \t" + matrizB[l][c]);
					}
					System.out.println("\n");
				}
				break;
			case 4:
				System.out.println(" MatrizA[2][2] :");
				for(int l = 0 ; l < 2 ; l++) {
					for(int c = 0 ; c < 2 ; c++) {
						System.out.print("\t \t " + matrizA[l][c]);
					}
					System.out.println("\n");
				}
				
				System.out.println(" MatrizB[2][2] : ");
				for(int l = 0 ; l < 2 ; l++) {
					for(int c = 0 ; c < 2 ; c++) {
						System.out.print("\t \t" + matrizB[l][c]);
					}
					System.out.println("\n");
				}
				break;
				
			case 5:
				System.out.println(" Programa finalizado");
				break;
				
			default:
				System.out.println(" Digite uma opção valida ");
				break;
				
			}
			
		}while(opcao != 5);
		
	}
	
}
