package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b= scan.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtra��o(a, b);
		int multiplicacao = multiplica��o(a, b);
		int divisao = divisao(a, b);
		
		System.out.println("Soma " + soma);
		System.out.println("Sub " + subtracao);
		System.out.println("Mult  " + multiplicacao);
		System.out.println("Div  " + divisao);

	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtra��o(int a, int b) {
		return a - b;
	}
	public static int multiplica��o(int a, int b) {
		return a * b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
}
