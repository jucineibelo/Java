/* 5) Leia o nome e a idade. Se a idade for menor que 16, Exiba o nome juntamente
com a mensagem "N�o pode votar!", caso contr�rio, exiba o nome com a
mensagem "Apto para votar!�  */

package atividades;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		Scanner votar = new Scanner (System.in);
		
		String nome;
		int idade;
		
		System.out.println("Insira o nome: ");
		nome = votar.next();
		System.out.println("Qual sua idade: ");
		idade = votar.nextInt();
		
		if (idade >= 16) {
			System.out.println(nome+" Voc� pode votar! ");
		} else {
			System.out.println(nome+" Voc� ainda n�o pode votar! ");
		}

	}

}
