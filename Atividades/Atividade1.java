package atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner Exer1 = new Scanner (System.in);
		
		float num, sucessor;
		
		System.out.println("Digite um número: ");
		num = Exer1.nextFloat();
		
		
		sucessor = num + 1;
		
		System.out.println("O sucessor de:"+num+" é "+ sucessor+".");
		
	}

}
