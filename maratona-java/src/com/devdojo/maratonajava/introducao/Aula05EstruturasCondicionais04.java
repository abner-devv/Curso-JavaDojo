package com.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //Exercicio sobre if e else
        System.out.println("Seu salário anual em Euros: ");
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();

        double imposto;
        if(salario <= 34712){
            imposto = (9.70/100) * salario;
            System.out.printf("Receba nos peitos o imposto de: %.2f%n", imposto);
        }else if(salario >= 34712 && salario <= 68507){
            imposto = (37.35 / 100) * salario;
            System.out.printf("Receba nos peitos o imposto de: %.2f%n", imposto);
        }else{
            imposto = (49.50 / 100) * salario;
            System.out.printf("Receba nos peitos o imposto de: %.2f%n", imposto);
        }
        System.out.print(salario);
    }
}
