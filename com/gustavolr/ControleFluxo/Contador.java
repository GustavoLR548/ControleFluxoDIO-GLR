package com.gustavolr.ControleFluxo;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
        terminal.nextLine();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        terminal.nextLine();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem de erro
			System.err.println(exception);
		}

        terminal.close();
		
	}

    /**
     * Método contendo a logica de contagem
     * @param parametroUm eh o inicio do intervalo numerico
     * @param parametroDois eh o fim do intervalo numerico
     * @throws ParametrosInvalidosException se {@code parametroUm} for maior do que {@code parametroDois}
     */
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		
		int contagem = parametroDois - parametroUm;
		
        //realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < contagem; i++, System.out.printf("Imprimindo o número %d\n", i));
	}
}