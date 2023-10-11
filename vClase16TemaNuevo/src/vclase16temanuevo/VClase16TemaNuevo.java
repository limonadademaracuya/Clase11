/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vclase16temanuevo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class VClase16TemaNuevo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // bucles de repeticion
        System.out.println("**Estructura while**");
        //La estructuar while evalua una condicion y, mientras sea verdadera, ejecuta las sentencias del cuerpo while
        // while es una estructura de repeticion, de bucles.
        
        /*
        Imprimir los numeros del 1 al 10, uno debajo del otro, 
        */
        
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }
        
        //error de bucle infinito
        
//        while (contador <= 10) {
//            System.out.println(contador);
//        }
        /* esto es un problema, porque el bucle no va a terminar: le pongo que mientras el contador
        sea menor a 10 imprima el valor de contador, pero el contador nunca incrementa, por lo que 
        se mantendra siendo menor a 10 y seguira corriendo el buble, mi codigo se queda estancado por 
        una mala sintaxis 
        
        Otro ejemplo seria:
        */
//        while (contador >= 1) {
//            System.out.println(contador);
//            contador++;
//        }
        /*
        aca, el contador ira incrementando sin problema, la cuestion es que no tiene un limite para 
        dejar de aumentar, hay infinitos numeros mayores a 1, por lo que el bucle seguia y seguira
        */
        
        System.out.println("**Estructura do-while**");
        
        /*
        el do-while ejecuta al menos una vez las sentencias y luego evalua la condicion para seguir ejecutando.
        
        Sumar los nuemeros positivos ingresados por el usuario
        */
        
        int numero = 0;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("########################");
            System.out.println("Ingrese un numero entero para sumar o el 0 para salir:");
            numero = teclado.nextInt();
            if(numero > 0) suma += numero;
            
        }while(numero != 0);
        
        System.out.println("Usted ingreso el 0 para salir");
        System.out.println("La suma de numeros positivos es: " + suma);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
