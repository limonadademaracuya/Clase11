/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Alumno3
 */
public class Ej1NotasDelAlumno {    
    public static void main(String[] args) {
        
        /*Consigna:
        Escribir un programa que permita el ingreso de la cantidad de notas a cargar, 
        luego, que permita ingresar cada una de las notas y mostrar por la pantalla:
        
        -Promedio de las notas ingresadas
        
        -Mensaje de "APROBADO" si el promedio es mayor o igual a 6.
        
        -Mensaje de "NO APROBADO" en caso de que el promedio sea menor a 6 y que alguna 
        de las notas cargadas sea menor o igual a 3.
        
        -Mensaje de "A RECUPERATORIO" en caso de que el promedio sea menor a 6 y que ninguna 
        de las notas sea menor o igual a 3.
        */
        
        notasDelAlumno();
        
    }
       
    public static void notasDelAlumno(){
        double[] notas = crearArreglo();
        System.out.println("Estas son las notas que ingresó: ");
        for(double n:notas) System.out.println(n);
        double promedio = promedioMaterias(notas);
        DecimalFormat formato = new DecimalFormat ("#.##");
        System.out.println("El promedio de las notas ingresadas es: "+ formato.format(promedio));
        String estadoMateria = mensajeAlumno(promedio, notas);
        System.out.println("El estudiante está: "+ estadoMateria);
    }
    
    public static double[] crearArreglo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas materias cursó el alumno?");
        int longitud = teclado.nextInt();
        double[] vector = new double[longitud];
        System.out.println("Ingrese las notas correspondientes a cada materia:");
        for(int i=0; i<vector.length; i++){
            vector[i] = teclado.nextDouble();
        }
        System.out.println("Notas ingresadas correctamente!");        
        return vector;
    }      
    
    public static double sumaDeNotas(double[] arreglo){
        double sumaTotal = 0;
        for(double a:arreglo) sumaTotal+=a;
        return sumaTotal;
    }
    
    public static double promedioMaterias(double[] arreglo){
        double promedio = sumaDeNotas(arreglo) / arreglo.length;
        return promedio;
    }   

    public static String mensajeAlumno(double promedio, double[] arreglo) {
        String estadoMateria = "";
        if (promedio >= 6) {
            estadoMateria = "APROBADO";
        } else {
            boolean hayNotaMenorOIgualA3 = false;

            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i] <= 3) {
                    hayNotaMenorOIgualA3 = true;                    
                }
            }

            if (hayNotaMenorOIgualA3) {
                estadoMateria = "NO APROBADO";
            } else {
                estadoMateria = "A RECUPERATORIO";
            }
        }
        return estadoMateria;
    }

  
    
}

