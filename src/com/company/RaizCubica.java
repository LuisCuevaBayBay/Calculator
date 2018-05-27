package com.company;

public class RaizCubica {

    private LectorTeclado lt = new LectorTeclado();

    public void RaizALa3(){
        int a = lt.leerEntero("Ingrese el radicando","Intente de nuevo");
        float total = (float)Math.pow(a, 1.0/3.0);

        System.out.println("La raiz cubica de :"+a+" es: "+total);
    }
}
