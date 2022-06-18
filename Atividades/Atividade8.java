/* 8) Faça um algoritmo que leia 2 valores inteiros e positivos: X e Y. O algoritmo
deve calcular e escrever o resultado da função de potência entre X e Y,sendo X a
base e Y o expoente. */

package atividades;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		Scanner potencia = new Scanner(System.in);
		
		int x, y, contador, multi;
		
		System.out.println("Insira o valor de X: ");
		x = potencia.nextInt();
		System.out.println("Insira o valor de Y: ");
		y = potencia.nextInt();
		
		multi = 1;
					
		for (contador = 1; contador <= y; contador ++) {
			multi = multi * x; 
		}
		
		System.out.println("O valor de "+x+ " na potência "+y+ " é: "+multi+".");
	}

}
