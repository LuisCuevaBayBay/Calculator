package com.company;

public class Multiplicacion {
    private int a;
    private int b;

    private LectorTeclado lt= new LectorTeclado();

    public void Multiplicacion(){
        System.out.println("Bienvenido a la opcion multiplicacion");
        int a = lt.leerEntero("Ingrese un numero","Ingrese una opcion valida");
        int b = lt.leerEntero("Ingrese un numero","Ingrese una opcion valida");

        double Resultado = a*b;
        System.out.println("El resultado total es: "+Resultado);

    }
}
