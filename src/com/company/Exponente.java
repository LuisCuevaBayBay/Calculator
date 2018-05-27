package com.company;

public class Exponente {
    private int a;
    private int b;

    private LectorTeclado lectorTeclado = new LectorTeclado();

    public void totalExponente (){
        System.out.println("Bienvenido a la opcion de Exponentes");
        int a = lectorTeclado.leerEntero("Por favor ingrese la base: ","Intente de nuevo");
        int b = lectorTeclado.leerEntero("Por favor ingrese el exponente","Intente de nuevo");

        int resultado = (int) Math.pow(a,b);
        System.out.println(a+ " Elevado a la "+b+" es igual a: "+resultado);
    }
}
