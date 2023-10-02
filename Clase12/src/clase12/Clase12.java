/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase12;

import java.util.Scanner;

/**
 *
 * @author Aula 8 - Docente
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Solicitar al usario que ingrese dos números.
            Devolver el primer número aumentado en 17
            y el segundo número decrementado en 10
        */
        
        Scanner teclado = new Scanner(System.in);
        
//        System.out.println("Por favor ingrese un número entero y presione enter:");
//        int numero1 = teclado.nextInt();
//        System.out.println("Por favor ingrese otro número entero y presione enter:");
//        int numero2 = teclado.nextInt();
        
//        int incremento = numero1 + 17;
//        int decremento = numero2 -10;
//        
//        System.out.println("El primer número aumentado en 17 es igual a: "+incremento);
//        System.out.println("El segundo número decrementado en 10 es igual a: "+decremento);
        
//        numero1 += 17;
//        numero2 -= 10;
//        
//        System.out.println("El primer número aumentado en 17 es igual a: "+numero1);
//        System.out.println("El segundo número decrementado en 10 es igual a: "+numero2);
        
        /*
        Solicitar al usuario que ingrese la base y la altura de un rectángulo e informar:
        El área del rectángulo
        El perímetro del rectángulo.
        */
        
//        System.out.println("Por favor, ingrese la base del rectángulo y presione enter:");
//        double base = teclado.nextDouble();
//        System.out.println("Por favor, ingrese la altura del rectángulo y presione enter:");
//        double altura = teclado.nextDouble();
//        
//        double area = base * altura;
        //double perimetro = (base * 2) + (altura * 2);
//        double perimetro = (base + altura) * 2 ;
//        
//        System.out.println("El área del rectángulo es de "+area);
//        System.out.println("El perímetro del rectángulo es de "+perimetro);
        
        /*
        Solicitar al usuario que ingrese el radio de un círculo en informar el área
        */
        
//        System.out.println("Ingrese el radio de un círculo:");
//        double radio = teclado.nextDouble();
//        final double PI = 3.14;
//        double areaCirculo = PI * (radio * radio);
//        System.out.println("El área del círculo es de: "+areaCirculo);
////        double areaCirculo = Math.PI * Math.pow(radio, 2);
////        System.out.println("El área del círculo es de: "+areaCirculo);
        System.out.println("****************");
        System.out.println(Math.PI);
        //PI es una constante de la clase Math que representa el valor de PI
        //pow() es un método de la clase Math que se utiliza para elevar un
        //número a una potencia. El primer parámetro es el valor a elevar y
        //el segundo parámetro es la potencia.
        
        /* 
        Se pide que ingrese por consola dos párrafos y muestre por pantalla lo siguiente:
        1. Los párrafos, ¿son iguales con el operador relacional ==?
        2. Los párrafos, ¿poseen el mismo contenido? Sin importar si están en mayúsculas o
        minúsculas.
        3. Mostrar los párrafos en mayúsculas.
        4. Mostrar los párrafos en minúsculas.
        5. Mostrar la primera letra en mayúscula de cada párrafo.
        6. Unir los párrafos con una coma.
        */
        
        System.out.println("Por favor, ingrese el primer párrafo y presione enter:");
        String parrafo1 = teclado.nextLine();
        System.out.println("Por favor, ingrese el segundo párrafo y presione enter:");
        String parrafo2 = teclado.nextLine();
        
        boolean condicion = parrafo1 == parrafo2;
        
        System.out.println("Respuesta consigna 1)");
        System.out.println("El resultado de comparar ambos párrafos "
                + "con el operador == es: "+condicion);
        
        condicion = parrafo1.equalsIgnoreCase(parrafo2);
        System.out.println("\nRespuesta consigna 2)");
        System.out.println("El resultado de comparar el contenido de "
                + "ambos párrafos de acuerdo a su contenido es: "
                +condicion);
        
        System.out.println("\nRespuesta consigna 3)");
        System.out.println("El párrafo1 en mayúscula es:\n"+parrafo1.toUpperCase());
        System.out.println("El párrafo2 en mayúscula es:\n"+parrafo2.toUpperCase());
        
        System.out.println("\nRespuesta consigna 4)");
        System.out.println("El párrafo1 en minúscula es:\n"+parrafo1.toLowerCase());
        System.out.println("El párrafo2 en minúscula es:\n"+parrafo2.toLowerCase());
        
        System.out.println("\nRespuesta consigna 5)");
        String primeraMayuscula = parrafo1.substring(0, 1).toUpperCase() + parrafo1.substring(1).toLowerCase();
        System.out.println("El párrafo1 con su primera letra en mayúscula es:\n"+primeraMayuscula);
        primeraMayuscula = parrafo2.substring(0, 1).toUpperCase() + parrafo2.substring(1).toLowerCase();
        System.out.println("El párrafo2 con su primera letra en mayúscula es:\n"+primeraMayuscula);
        
        System.out.println("\nRespuesta consigna 6)");
        System.out.println(parrafo1 + ", " + parrafo2);
        
        /*Crear un programa que solicite al usuario que ingrese su primer 
        nombre y su apellido de una sola vez.
        Luego mostrarlo por consola, por separado, indicando cuál es su 
        apellido primero y luego debajo entre comillas dobles, su nombre.
        Nombre y apellido deben ir con la primer letra en mayúscula.
        */
        
        System.out.println("Por favor, ingrese su primer nombre y su apellido.");
        System.out.println("Luego, presione enter:");
        String nombreApellido = teclado.nextLine();
        int espacio = nombreApellido.indexOf(" ");
        String nombre = nombreApellido.substring(0,espacio);
        String apellido = nombreApellido.substring(espacio+1);
        nombre = nombre.substring(0,1).toUpperCase()+nombre.substring(1).toLowerCase();
        apellido = apellido.substring(0,1).toUpperCase()+apellido.substring(1).toLowerCase();
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su nombre es: \""+nombre+"\"");
        
    }
    
}
