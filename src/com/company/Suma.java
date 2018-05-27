package com.company;

public class Suma {

    private int to;
    private int po;

    private LectorTeclado lt = new LectorTeclado();

    public void totalSuma(){
        System.out.println("Bienvenido a la opcion suma");
        int a = lt.leerEntero("Ingrese a", "por favor intentelo de nuevo");
        int b = lt.leerEntero("Ingrese b", "por favor ntentelo de nuevo");

        double resultado = a+b;

        System.out.println(" El resultado total es: "+ resultado);

    }
    }


