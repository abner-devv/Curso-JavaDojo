package com.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Operador ternario
        //Doar se salario > 5000;
        double salario = 6000;
        String mensagemDoar = "Eu vou doar";
        String mensagemNaoDoar = "Eu não vou doar";
        String resultado = (salario > 6000) ? mensagemDoar : mensagemNaoDoar;
        System.out.print(resultado);
    }
}
