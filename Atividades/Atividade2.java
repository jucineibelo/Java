package atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner combustivel = new Scanner(System.in);

		float km, litros, media;

		System.out.println("Qual a distancia percorrida em KM: ");
		km = combustivel.nextFloat();
		System.out.println("Quantos litros de combustivel foram gastos: ");
		litros = combustivel.nextFloat();

		media = km / litros;

		System.out.println("O cosumo médio foi de:" + media);

	}

}
