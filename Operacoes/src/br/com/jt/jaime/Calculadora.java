package br.com.jt.jaime;

public class Calculadora {
	
	public static void main(String[] args) {
		int numero1 = 2, numero2 = 2;
		int resultadoSoma, resultadoMenos, resultadoDivisao, resultadoMultiplicacao;

		resultadoSoma = numero1 + numero2;
		resultadoMenos = numero1 - numero2;
		resultadoDivisao = numero1 / numero2;
		resultadoMultiplicacao = numero1 * numero2;
		
		System.out.println("Soma: " + resultadoSoma);
		System.out.println("Subtração: " + resultadoMenos);
		System.out.println("Divisão: " + resultadoDivisao);
		System.out.println("Multiplicação: " + resultadoMultiplicacao);
	}
}