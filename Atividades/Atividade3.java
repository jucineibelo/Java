/*3) Calcular a quantidade de dinheiro gasta por um fumante. Dados: o
n�mero de anos que ele fuma, o n� de cigarros fumados por dia e o pre�o
de uma carteira.*/

package atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ciga = new Scanner(System.in);
		float anos, cigarrosDia, ValorDia, preco, diasFumados, calculoFinal;

		System.out.println("A quantos anos voc� fuma: ");
		anos = ciga.nextFloat();
		System.out.println("Quantos cigarros s�o fumados ao dia: ");
		cigarrosDia = ciga.nextFloat();
		System.out.println("Qual o pre�o de uma carteira de cigarro? ");
		preco = ciga.nextFloat();

		ValorDia = (preco / 20) * cigarrosDia;
		diasFumados = ValorDia * 365;
		calculoFinal = diasFumados * anos;
		
		System.out.println("O valor gasto ao ano foi de: " + calculoFinal);

	}

}
