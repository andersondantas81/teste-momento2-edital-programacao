package Graduado;

import java.util.Random;

public class Exercicio03 {
	
	public static int [][] geradorMatriz(int linhas, int colunas ){
		Random gerador = new Random();
		int[][] matriz = new int[linhas][colunas];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = gerador.nextInt(10);
				System.out.print(matriz[i][j]+" | ");
			}
			System.out.println("");
		}
		return matriz;
		
	}

	public static void main(String[] args) {
		int[][] a = geradorMatriz(3, 2);
		System.out.println("-------------");
		int[][] b = geradorMatriz(3, 2);
		System.out.println("-------------");
		int[][] c = new int[3][2];
		 
		System.out.println("-------------");
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j]+" | ");
			}
			System.out.println("");
		}
		
		
		
	}
}
