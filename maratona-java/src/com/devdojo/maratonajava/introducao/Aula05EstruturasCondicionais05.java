package com.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana, considerando 1 como domingo
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();

        switch (entrada){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.printf("Quarta");
                break;
            case 5:
                System.out.printf("Quinta");
                break;
            case 6:
                System.out.printf("Sexta");
                break;
            case 7:
                System.out.printf("Sábado");
                break;
            default:
                System.out.printf("Opção inválida");
                break;
        }
    }
}
