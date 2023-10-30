/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vClase_20;

/**
 *
 * @author Alumno3
 */
public class Arreglos {
    
    public static void main (String [] args) {
        // Si tuvieramos que guardar varios numeros en variables
        
        int variable1 = 456 ;
        int variable2 = 34 ;
        int variable3 = 98 ;
        
        /*Podemos generar un conjunto de variables que tenga un mismo nombre que las agrupe a todas.
        Se puede acceder a cada variable por medio del indice.
        El indice comienza en 0.
        Con esto logramos optimizar la lectura de la información para acceder por un mismo nombre a distintas variables, 
        y no por el nombre de cada una
        
        */
        
        System.out.println("** Arreglos, vectores o Arrays **");
        
        /*DECLARACIÓN -------------------------
        tipoDeDato[] identificador; --> declaración
        tipoDeDato identificador []; --> declaración
        identificador = new tipoDeDato[n]; --> cantidad de variables que tendrá
        
        */
        
        float[] temperaturas; // declaración de arreglo // en estos dos renglones de declaración, es indistinto si los corchetes
        temperaturas = new float[10]; // definición de la longitud // van despues del tipo de dato o si van despues del identificador
        float temperaturas2[];
        temperaturas2 = new float[12];
        String[] nombres = new String[5]; // declaración y definición de longitud en linea 
        
        // Ahora, ASIGNACIÓN DE VALORES ----------
        
        temperaturas[0] = 25.32f;
        temperaturas[1] = 12.56f;
        temperaturas[2] = 23.12f;
        temperaturas[3] = 36.12f;
        // y así hasta el indice 9
        
        // temperaturas[4] = "Jose"; error, la variable no es del mismo tipo de dato
        
        nombres[0] = "Juan";
        nombres[1] = "Mariana";
        //nombres[5] = "Jorge";
        
        // leer el contenido de un subíndice:
        System.out.println(temperaturas[2]);
        System.out.println(nombres[1]);
        System.out.println(nombres[4]); // acá no tira error, aunque no le haya dado yo un  valor a ese específico indice;
        //no rompe el codigo, tira "null"
        // System.out.println(nombres[6]); // acá sí tira error porque le estoy pidiendo un indice que no existe
        
        // INICIALIZACIÓN -------------------
        int[] numeros = {12, 59, 87, 129, 0};
            // posición  0    1   2   3    4
        // en este caso, declaramos e inicializamos un vector de enteros con 5 posiciónes.
        
        // MOSTRAR EL CONTENIDO DE UN ARREGLO: --------------------
        System.out.println(numeros);// no muestra el conteindo
        
        //entonces, para mostrar el contenido:
        System.out.println("Contenido del arreglo:");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        
        System.out.println("\nRecorrido con un contador o referencia");
        int contador = 0;
        System.out.println(numeros[contador]);
        contador ++; 
        System.out.println(numeros[contador]);
        contador ++; 
        System.out.println(numeros[contador]);
        contador ++; 
        System.out.println(numeros[contador]);
        contador ++; 
        System.out.println(numeros[contador]);
        contador ++; 
        
        // recorrido con FOR 
        System.out.println("\nRecorrido con for");
        for(int i=0 ; i<5 ; i++){
            System.out.println(numeros[i]);
        }
        
        System.out.println("\nRecorrido con for, mostrando el indice");
        for(int i=0 ; i<5 ; i++) {
            System.out.println("El contenido del vector en la posición " + i + " es " + numeros[i]);
        }
        
        
        
    }
    
    
    
    
    
}
