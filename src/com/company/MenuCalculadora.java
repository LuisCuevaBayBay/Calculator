package com.company;
import java.util.Scanner;


public class MenuCalculadora {

    private LectorTeclado lt = new LectorTeclado();

    public static void Menu(){
        int j=0 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora");
        System.out.println("");
        System.out.println("");
        System.out.println("Que operaciones desea realizar?");
        System.out.println("Las opciones son: ");
        System.out.println("\t 1. Suma");
        System.out.println("\t 2. Resta");
        System.out.println("\t 3. Multiplicacion");
        System.out.println("\t 4. Division ");
        System.out.println("\t 5. Exponentes");
        System.out.println("\t 6. Raiz Cuadrada");
        System.out.println("\t 7. Fracciones");
        System.out.println("\t 8. Raiz Cubica");
        System.out.println("\t 9. Salir del programa");
        System.out.println();

        int j2 = sc.nextInt();
        switch (j2){
            case 1:
                Suma suma = new Suma();
                suma.totalSuma();
                break;
            case 2:
                Resta resta = new Resta();
                resta.totalResta();
                break;
            case 3:
                Multiplicacion multiplicacion = new Multiplicacion();
                multiplicacion.Multiplicacion();
                break;
            case 4:
                Division division = new Division();
                division.TotalDivision();
                break;


        }


    }
    }
