package com.company;

public class Division {
    private  int a;
    private int b;

    private LectorTeclado lt = new LectorTeclado();

    public void TotalDivision(){
        System.out.println("Bienvenido a la opcion de division");
        double a = lt.leerEntero("Ingrese un numero ","Ingrese una opcion valida");
        double b = lt.leerEntero("Ingrese un numero","Ingrese una opcion valida");

        double resultado = a/b;
        System.out.println("el resultado total es: "+resultado);
    }
}
