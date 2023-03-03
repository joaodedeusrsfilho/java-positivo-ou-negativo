package com.junior.curso_java_basico.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Pegue um valor e mostre se é positivo ou negativo
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite um valor para saber se o mesmo E possitivo ou negativo");
		numero = ler.nextInt();
		if(numero < 0) {
			System.out.println("Numero negativo");
		}else {
			System.out.println("Numero positivo");
		}
	}

}
