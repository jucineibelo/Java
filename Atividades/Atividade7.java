/* 7) Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
metro e cresce 3 centímetros por ano. Construa um algoritmo que calcule e
imprima quantos anos serão necessários para que Zé seja maior que Chico. */

package atividades;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		Scanner centimetros = new Scanner(System.in);
		
		double chico, ze;
		int contador;
		
		chico = 1.50;
		ze = 1.10;
		contador = 0;
		
		while (chico > ze) {
			chico = chico + 0.02;
			ze = ze + 0.03;
			contador++;
		}
		System.out.println("A idade será: "+contador+ " anos.");		
		

	}

}
