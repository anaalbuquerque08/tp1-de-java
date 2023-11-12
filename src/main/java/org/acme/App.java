package org.acme;

import package1.javaclass1;
import package2.javaclass2;
import package3.javaclass3;

public class App {
    public static void main(String[] args) {
        System.out.println("Calculando uma soma ...");

        // Crie instâncias das classes
        javaclass1 classe1 = new javaclass1();

        javaclass2 classe2 = new javaclass2();
        javaclass3 classe3 = new javaclass3();

        int numeroA = classe1.getNumeroA();
        int numeroB = classe2.getNumeroB();

        int numeroC = classe3.getNumeroC();

        int resultadoSoma = numeroA + numeroB + numeroC;

        System.out.println(numeroA + " + " + numeroB + " + " + numeroC + " =");
        System.out.println("Resultado da soma: " + resultadoSoma);
    }
}
