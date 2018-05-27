package com.company;

public class RaizCuadrada {
    private int a;

    private LectorTeclado lt = new LectorTeclado();

    public void TotalSQRT(){
        double a = lt.leerEntero("Ingrese un radicando ","Intentelo de nuevo");
        float total = (float)Math.sqrt(a);

        System.out.println("la raiz cuadrada de "+a+" es: "+total);
    }

}
