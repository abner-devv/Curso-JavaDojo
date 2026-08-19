package com.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // ==========================================
        // 1. TIPOS PRIMITIVOS, VARIÁVEIS E CASTING
        // ==========================================

        // Declaração de variáveis e tipos primitivos
        byte idadeByte = 25;
        short anoShort = 2026;
        int populacaoInt = 1500000;
        long distanciaLong = 5800000000L; // Requer 'L' no final
        float precoFloat = 19.99f;        // Requer 'f' no final
        double piDouble = 3.14159265359;
        char inicialChar = 'J';
        boolean ativoBoolean = true;

        // Casting Implícito (automático: menor para maior)
        int numeroInt = 100;
        double transformadoDouble = numeroInt;

        // Casting Explícito (manual: maior para menor)
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble; // Trunca as casas decimais (resultado: 9)


        // ==========================================
        // 2. OPERADORES
        // ==========================================

        // Aritméticos
        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        int divisao = 10 / 3;   // Divisão inteira resulta em 3
        int resto = 10 % 3;     // Resto da divisão resulta em 1

        // Atribuição
        int x = 10;
        x += 5; // x vira 15 (o mesmo que x = x + 5)
        x -= 2; // x vira 13
        x *= 2; // x vira 26

        // Relacionais
        boolean eIgual = (10 == 10);      // true
        boolean eDiferente = (10 != 5);   // true
        boolean maiorQue = (10 > 5);      // true
        boolean menorIgual = (10 <= 5);   // false

        // Lógicos
        boolean condicaoA = true;
        boolean condicaoB = false;

        boolean resultadoE = condicaoA && condicaoB;   // false (E lógico)
        boolean resultadoOU = condicaoA || condicaoB;  // true  (OU lógico)
        boolean resultadoNAO = !condicaoA;             // false (NÃO lógico)


        // ==========================================
        // 3. ESTRUTURAS CONDICIONAIS
        // ==========================================

        // Estrutura if / else
        int hora = 14;
        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!"); // Será executado
        } else {
            System.out.println("Boa noite!");
        }

        // Operador Ternário (if/else compacto de uma linha)
        int nota = 7;
        String resultadoFinal = (nota >= 6) ? "Aprovado" : "Reprovado";
        // resultadoFinal recebe "Aprovado" se nota >= 6, senão recebe "Reprovado"

        // Estrutura switch
        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira"); // Será executado
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
