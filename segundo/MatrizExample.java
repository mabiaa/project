package arrays;

import java.util.Scanner;

public class DuasMatrizes2x2 {
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		float[][] A = new float[2][2], B = new float[2][2], C = new float[2][2];
		float valor;
		int opc;
		char Matriz='A';
		
		for(int cont=0; cont<2; cont++)
		{
			for(int i=0; i<2; i++)
			{
				for(int j=0; j<2; j++)
				{
					System.out.printf("Preencha %c [%d][%d]: ", Matriz, (i+1), (j+1));
					if(Matriz=='A') A[i][j] = read.nextFloat();
					if(Matriz=='B') B[i][j] = read.nextFloat();
				}
			}
			Matriz = 'B';
			System.out.println();
		}
		
		System.out.println("Digite a opção...");
		System.out.printf("1 -- Soma das matrizes\n2 -- Subtrair a primeira da segunda matriz\n");
		System.out.printf("3 -- Adicionar uma constante às matrizes\n4 -- Mostrar as matrizes\n");
		opc = read.nextInt();
		while(opc<1 || opc>4)
		{
			System.out.printf("\nOpção inválida. Tente novamente: ");
			opc = read.nextInt();
		}
		
		System.out.println();
		System.out.println();

		switch(opc)
		{
			case 1:
				System.out.println("Matriz C (soma): ");
				for(int i=0; i<2; i++)
				{
					System.out.printf("| ");
					for(int j=0; j<2; j++)
					{
						C[i][j] = A[i][j] + B[i][j];
						System.out.printf("%.2f", C[i][j]);
						if(j<1) System.out.printf("\t");
					}
					System.out.printf(" |\n");
				}
				break;
			case 2:
				System.out.println("Matriz C (subtração): ");
				for(int i=0; i<2; i++)
				{
					System.out.printf("| ");
					for(int j=0; j<2; j++)
					{
						C[i][j] = B[i][j] - A[i][j];
						System.out.printf("%.2f", C[i][j]);
						if(j<1) System.out.printf("\t");
					}
					System.out.printf(" |\n");
				}
				break;
			case 3:
				System.out.printf("Insira a constante a ser somada: ");
				valor = read.nextFloat();
				System.out.println("\nMatriz A (somada a " +valor+ "): ");
				for(int i=0; i<2; i++)
				{
					System.out.printf("| ");
					for(int j=0; j<2; j++)
					{
						A[i][j] += valor;
						System.out.printf("%.2f", A[i][j]);
						if(j<1) System.out.printf("\t");
					}
					System.out.printf(" |\n");
				}
				System.out.println("\nMatriz B (somada a " +valor+ "): ");
				for(int i=0; i<2; i++)
				{
					System.out.printf("| ");
					for(int j=0; j<2; j++)
					{
						B[i][j] += valor;
						System.out.printf("%.2f", B[i][j]);
						if(j<1) System.out.printf("\t");
					}
					System.out.printf(" |\n");
				}
				break;
			case 4:
				System.out.println("\nMatriz A: ");
				for(int i=0; i<2; i++)
				{
					System.out.printf("| ");
					for(int j=0; j<2; j++)
					{
						System.out.printf("%.2f", A[i][j]);
						if(j<1) System.out.printf("\t");
					}
					System.out.printf(" |\n");
				}
				System.out.println("\nMatriz B: ");
				for(int i=0; i<2; i++)
				{
					System.out.printf("| ");
					for(int j=0; j<2; j++)
					{
						System.out.printf("%.2f", B[i][j]);
						if(j<1) System.out.printf("\t");
					}
					System.out.printf(" |\n");
				}
				break;
		}
		read.close();
	}
}
