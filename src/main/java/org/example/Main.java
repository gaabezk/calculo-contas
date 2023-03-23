package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        /*Faça um sistema de faturamento em Java:

        O objetivo principal deste projeto de sistema de faturamento
        é calcular as contas automaticamente, ou seja, sem nenhum cálculo manual.
        Você pode preferir começar a construir este projeto com uma interface simples
        que exigirá que o usuário insira o nome do item, o preço por unidade
        e a quantidade. De acordo com esses detalhes, o sistema irá gerar uma fatura
        mencionando o valor total de dinheiro que deve ser pago.*/

        System.out.println("Qual nome do produto: ");
        String nome = sc.next();
        System.out.println("Qual o preço do item? ");
        Double preco = sc.nextDouble();
        System.out.println("Quantos "+nome+" voce deseja levar? ");
        Integer quantidade = sc.nextInt();

        System.out.println("\n\nVoce comprou "+quantidade+" "+nome+" por "+preco+" cada!");
        System.out.println("Total: "+(quantidade*preco));

        sc.close();
    }
}