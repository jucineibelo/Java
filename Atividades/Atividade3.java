/*3) Calcular a quantidade de dinheiro gasta por um fumante. Dados: o
número de anos que ele fuma, o nº de cigarros fumados por dia e o preço
de uma carteira.*/

package atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ciga = new Scanner(System.in);
		float anos, cigarrosDia, ValorDia, preco, diasFumados, calculoFinal;

		System.out.println("A quantos anos você fuma: ");
		anos = ciga.nextFloat();
		System.out.println("Quantos cigarros são fumados ao dia: ");
		cigarrosDia = ciga.nextFloat();
		System.out.println("Qual o preço de uma carteira de cigarro? ");
		preco = ciga.nextFloat();

		ValorDia = (preco / 20) * cigarrosDia;
		diasFumados = ValorDia * 365;
		calculoFinal = diasFumados * anos;
		
		System.out.println("O valor gasto ao ano foi de: " + calculoFinal);

	}

}
