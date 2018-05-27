package com.company;

public class MultiplicacionFracciones {

    private LectorTeclado lt = new LectorTeclado();

    public void MultiFracc(){
        int a = lt.leerEntero("Ingrese el valor A","Ingrese un numero valido");
        int b = lt.leerEntero("Ingrese el valor B","Ingrese un numero valido");
        int c = lt.leerEntero("Ingrese el valor C","Ingrese un numero valido");
        int d = lt.leerEntero("Ingrese el valor D","Ingrese un numero valido");

        int Total1 = a*c;
        int Total2 = c*d;

        System.out.println("el resultado total de la resta es: "+Total1+" /"+Total2);
    }
}
