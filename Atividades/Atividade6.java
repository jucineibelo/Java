/*  6) Para doar sangue � necess�rio ter entre 18 e 67 anos. Fa�a um aplicativo na
linguagem Java que pergunte a idade de uma pessoa e diga se ela pode doar sangue
ou n�o. */

package atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		Scanner sangue = new Scanner(System.in);
		int idade;

		System.out.println("Insira a idade: ");
		idade = sangue.nextInt();

		if (idade >= 18 && idade <= 67) {
			System.out.println("Voc� pode doar sangue!");
		} else {
			System.out.println("Voc� n�o pode doar sangue!");

		}

	}

}
