package com.company;

public class DivisionFracciones {

    private LectorTeclado lt = new LectorTeclado();

    public void DivFracc(){
        int a = lt.leerEntero("Ingrese el valor A","Ingrese un numero valido");
        int b = lt.leerEntero("Ingrese el valor B","Ingrese un numero valido");
        int c = lt.leerEntero("Ingrese el valor C","Ingrese un numero valido");
        int d = lt.leerEntero("Ingrese el valor D","Ingrese un numero valido");

        int Total1 = a*d;
        int Total2= b*c;

        System.out.println("El total de la division de Fracciones es: "+Total1+" /"+Total2);
    }
}
