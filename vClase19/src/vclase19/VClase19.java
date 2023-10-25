/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vclase19;

import java.util.Scanner;

/**
 *
 * @author Alumno3
 */
public class VClase19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("**Funciones y procedimientos**");
        
        
        
        /* Las funciones y procedimientos son un bloque de código que contienen una o más instrucciones,
        al cual podemos invocar para que sean ejecutadas. Las funciones y los proedimientos nos van a ayudar
        a hacer nuestro código más legible y evitar código duplicado.
        */
        
        /*Los métodos de tipo función siempre retornan un valor.
        En su declaración deben indicar qué tipo de valor retornan.
        En su cuerpo debe contener la sentencia 'return' con el retorno del tipo de dato que se indicó en su cabecera.        
        */
        
        /* vamos a crear los metodos dentro de la clase y fuera del metodo main (el metodo main es public static void main)
        
            lo que escribamos fuera del metodo main no se ejecuta 
        
        public = modificador de visivilidad, tiene que ver con el encapsulamiento y proteccion de informacion, 
        nos permiten acceder o no a ciertas partes de código
        
        que tenga un 'public' implica que el codigo que ponga aquí será viisible para cualquier persona
        
        static = para poder usar este objeto no tengo que crear un metodo antes, con solo llamarlo ya puedo usarlo
        
        la firma de un metodo es la declaración y la cabecera de mi metodo 
        
        Ahora, SIEMPRE será mejor, más útil y más intuitivo ponerle un nombre DESCRIPTIVO a métodos y variables 
        
        Un método DEBE tener parentesis SI O SI, SIEMPRE. Esto también es una manera de identificar métodos de atributos,
        los métodos siempre tendrán parentesis al final, con o sin parametros especificados
        
            */ 

        int numero1 = retornarNumeroDiez(); // acá estoy llamando o invocando al metodo que creé fuera de las llaves del final
        System.out.println(numero1);
        System.out.println(retornarNumeroDiez());
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un número entero");
        int primerNumero = teclado.nextInt() ;
        System.out.println("Por favor ingrese otro número entero");
        int segundoNumero = teclado.nextInt();
        
        System.out.println("La suma de los dos números enteros ingresados es de: ");
        System.out.println(sumarDosEnteros(primerNumero, segundoNumero));
        
    } // final del metodo main
    
    // ejemplos de funciones 
    
    public static int retornarNumeroDiez(){
        return 10; // el return debe retornar el mismo tipo de dato declarado en la firma del método
    }
    
    public static int sumarDosEnteros(int num1, int num2){
        return num1 + num2;
    
    }
    
} // este es el final de la clase 
