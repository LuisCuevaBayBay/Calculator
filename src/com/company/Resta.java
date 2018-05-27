package com.company;

public class Resta {
    private int a;
    private int b;

    private LectorTeclado lt = new LectorTeclado();

    public void totalResta(){
        System.out.println("Bienvenido a la opcion resta");
        int a = lt.leerEntero("Ingrese a","por favor intentelo de nuevo");
        int b = lt.leerEntero("Ingrese b","por favor intentelo de nuevo");

        double resultado = a-b;
        System.out.println("el resultado total es: "+resultado );
    }
}
