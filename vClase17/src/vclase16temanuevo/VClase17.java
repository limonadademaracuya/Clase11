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
public class VClase17 {

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
        
//        System.out.println("**Estructura do-while**");
//        
//        /*
//        el do-while ejecuta al menos una vez las sentencias y luego evalua la condicion para seguir ejecutando.
//        
//        Sumar los nuemeros positivos ingresados por el usuario
//        */
//        
        int numero = 0;
        int suma = 0;
        Scanner teclado = new Scanner(System.in);
////        
////        do{
////            System.out.println("########################");
////            System.out.println("Ingrese un numero entero para sumar o el 0 para salir:");
////            numero = teclado.nextInt();
////            if(numero > 0) suma += numero;
////            
////        }while(numero != 0);
////        
////        System.out.println("Usted ingreso el 0 para salir");
////        System.out.println("La suma de numeros positivos es: " + suma);
////        
//        System.out.println("**Sentencia break**");
//        /* Clase 17 ----------
//        La sentencia break enera un corte en la secuencia de comandos y saca la ejecución del bloque de código.
//        Siguiendo con el ejemplo anterior, si la suma supera los 100 cortamos la ejecución del programa.
//        */
////        int suma = 0;
////        
////        do{
////            System.out.println("Ingrese un número entero para sumar ó el 0 para salir");
////            numero = teclado.nextInt();
////            if(numero>0) suma +=numero;
////            if(suma>100) break;
////            
////        }while(numero!=0);
////        
////        System.out.println("La suma de números enteros positivos es de: "+ suma);
//
//        System.out.println("**Sentencia Continue **");
//        /*
//        La sentencia continue genera un corte en la secuencia de comandos y vuelve al comienzo de la estructura.
//        
//        Continuando con nuestro ejemplo, sólo sumaremos los numeros pares:
//        */
//        
//        do {
//            System.out.println("Ingrese un número entero para sumar o el 0 para salir:");
//            numero = teclado.nextInt();
//            if(numero%2!=0) continue; // acá está evaluando única y exclusivamente si es impar,
//            // y le pide que si lo es, que deje de correr código y que le pida al usuario que ingrese
//            // un número diferente (par) que si pueda sumar
//            if(numero>0) suma+=numero;
//            if(suma>100) break;
//            
//        }while(numero!=0);
//        
//            System.out.println("La suma de los numeros positivos pares es de: " + suma);
        
            System.out.println("**Estructura FOR**"); // tambien es una estructura repetitiva
            
            //imprimir los números del 1 al 10 uno debajo del otro 
            for(int i=1; i<=10; i++){
                System.out.println(i);
            }
            // i viene de "index", porque es el indice que va 
            
            System.out.println("");
            
            // se puede utilizar el linea si sólo se ejecuta una sentencia
            // ej: imprimir "Hola mundo!" 5 veces uno debajo del otro
        
        for (int i = 1; i < 5; i++) System.out.println("Hola Mundo!!");
            
        /* La variable que está dentro del for es una variable local solo
        que se utiliza dentro del for, no tiene algance (scope) fuera de la estructura.
        Al terminar el bucle, se destruye (literal, no ocupa más lugar en memoria) 
        y desaparece.        
        */    
        
        // imprimir los números del 1 al 10 sin imprimir los números 2, 5 y 9 
   
//        for(int i=1; i <= 10 ; i++) {
//            if(i!=2 && i!=5 && i!=9) System.out.println(i);
//        }
        
        // imprimir los números del 1 al 30 sin imprimir los números entre el 10 y el 20 
        
//        System.out.println("!!!!!!");
//        for(int i=1; i <= 30 ; i++) {
//            if(i<10 || i>20) System.out.println(i);
//        }
        
        // imprimir los números del 1 al 20 salteando de a 2 
        //uno al lado del otro separado con un espacio
        
//        System.out.println("!!!!!!");
//        for(int i=1; i <= 20 ; i+=2) {            
//            System.out.print(i + " ");
//        }
           
// imprimir los numeos del 10 al 1
//            System.out.println("!!!!!!");
//            for(int i=10; i>=1 ; i--){
//              System.out.println(i);
//            }
            
// imprimir los números pares del 1 al 20 uno al lado del otro separados por / 
//        System.out.println("########");        
//        for(int i=1; i<=20 ; i++){
//              if(numero%2!=0) continue;
//              else System.out.print(i + "/");
//            }
            
// el de arriba está mal, este de abajo está bien 
    for(int i=1;  i<=20; i++){
        if(i%2==0) System.out.print(i + " / ");
    }
        
        /* ejercicios ------------------------
    Una persona desea invertir $10.000 en un banco, el cual le otorga un 2% de interes mensual. 
    ¿cuál será la cantidad de dinero que esta persona tendrá al cabo de un año?
    
    El primer mes tendrá un acumulado de $10.000 + $200 de interés (es el 2% de 10.000).
    En el segundo mes se le sumará un 2% a la base de 10.200 del mes anterior, y así sucesivametne.
    ("interes compuesto" se llama "porque incrementa el capital de inversión")
    */
        
        /* 
        Crear un programa que ingerse una oración y muestre cuál es el caracter que más se repite.
        No se cuenta el espacio en blanco. La oración a ingresar no debe estár vacía
        */    
        
        System.out.println("a ver");
        
        
        
    }
    
}
