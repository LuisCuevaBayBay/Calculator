package com.company;

public class SumaFracciones {
    private int a;
    private int b;

    private LectorTeclado lt = new LectorTeclado();

    public void SumaFracc(){
        int a = lt.leerEntero("Ingrese el valor A ","Intente de nuevo ");
        int b = lt.leerEntero("Ingrese el valor B ","Intente de nuevo");
        int c = lt.leerEntero("Ingrese el valor C ","Intente de nuevo");
        int d = lt.leerEntero("Ingrese el Valor D ","Intente de nuevo");

        int SumResult = a*d + b*c;
        int Result = b+c;

        System.out.println("El resultado total es: "+SumResult+"/"+Result);
    }
}
