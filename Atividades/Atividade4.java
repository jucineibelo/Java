package atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner numeros = new Scanner(System.in);

		int n1, n2, exibir;

		System.out.println("Digite o primeiro n�mero: ");
		n1 = numeros.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = numeros.nextInt();

		if (n1 > n2) {
			System.out.println("O primeiro n�mero � maior! " + n1);
		} else if (n1 < n2) {
			System.out.println("O segundo n�mero � maior! " + n2);
		} else {
			System.out.println("Os dois n�meros s�o iguais!");
		}
	}
}
