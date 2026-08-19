package com.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main() {
        //int, double, float, chat, string, short, long, boolean
        int n = 10;
        long l = 1000;
        short s = 128;
        double d = 1.3d;
        float f = 13.5f;
        boolean b = true;
        String str = "string";

        char c = 'A';
        //Usando tabela Unicode
        char charactere = '\u0041';

        System.out.println(charactere);

        //Casting
        //Um valor maior em um tipo menor
        int k = (int) 10000000000l;
        System.out.println(k);
    }
}
