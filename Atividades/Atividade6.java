/*  6) Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo na
linguagem Java que pergunte a idade de uma pessoa e diga se ela pode doar sangue
ou não. */

package atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sangue = new Scanner(System.in);
		int idade;

		System.out.println("Insira a idade: ");
		idade = sangue.nextInt();

		if (idade >= 18 && idade <= 67) {
			System.out.println("Você pode doar sangue!");
		} else {
			System.out.println("Você não pode doar sangue!");

		}

	}

}
