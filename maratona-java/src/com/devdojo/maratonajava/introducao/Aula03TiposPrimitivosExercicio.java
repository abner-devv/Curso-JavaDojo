package com.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no <endereço> confirmo que recebi o <salário>, na <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "João";
        String endereco = "Marcilio Dias 250";
        double salario = 3500.00;
        String dataRecebimento = "10/03/2027";

        System.out.println("Eu " +nome+ ", morando no " +endereco+ " confirmo que recebi o salário de " +salario+ " na data " + dataRecebimento);
    }
}
