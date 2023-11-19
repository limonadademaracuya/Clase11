

package clase24;

import java.util.Scanner;


public class EjerciciosVectores {
    public static void main(String[] args) {
        /*
        Ejercicio:
        Crear un vector de enteros de 10 posiciones --
        Pedirle al usuario que cargue 10 valores para ese vector --
        Mostrar con foreach el listado de números que ingresó. --
        Mostrar la suma de todos los elementos --
        Mostrar el promedio --
        Indicar cuántos números pares y cuántos impares hay --
        Indicar cuántas veces se repitió el número 2
        Resolver todo dentro de un método que sea invocado dentro del main.
        */
        
        /*
        Ejercicio2:
        Crear un vector que contenga el monto de la facturación total de
        una empresa durante un año (de enero a diciembre).
        Informar:
        - la máxima facturación
        - la facturación más baja
        - el promedio de facturación
        */
        resoverEjercicio2();
        
    }
    
    public static void resolverEjercicio1(){
        double[] array = crearArreglo();
        System.out.println("Estos son los valores que ingresó:");
        for(double a:array) System.out.println(a);
        System.out.println("La suma de todos los elementos que ingresó es: "+sumaTotalDelArregloDouble(array));
        System.out.println("Y el promedio del mismo fue: "+promedioDelArregloDouble(array));
        System.out.println("La cantidad de números pares ingresados es de: " + cuantosPares(arreglo));
        System.out.println("Y la cantidad de números impares ingresados es: " + cuantosImpares(arreglo));
    }
    
    public static void resoverEjercicio2(){
        double[] array = crearArreglo();
        System.out.println("Estos son los valores que ingresó:");
        for(double a:array) System.out.println(a);
        System.out.println("La máxima facturación fue de: "+maximoValorDelArregloDouble(array));
        System.out.println("La facturación más baja fue de: "+minimoValorDelArregloDouble(array));
        System.out.println("El promedio de la facturación fue de: "+promedioDelArregloDouble(array));
    }
    
    public static double[] crearArreglo(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos datos quiere guardar?");
        int longitud = teclado.nextInt();
        double[] vector = new double[longitud];
        System.out.println("Ingrese los valores correspondientes:");
        for(int i=0; i<vector.length; i++){
            vector[i] = teclado.nextDouble();
        }
        System.out.println("Usted ingresó todos los valores!");
        teclado.close();
        return vector;
    }
    
    public static double maximoValorDelArregloDouble(double[] arreglo){
        double mayor = arreglo[0];
        for(double v:arreglo) if(v>mayor) mayor=v;
        return mayor;
    }
    
    public static double minimoValorDelArregloDouble(double[] arreglo){
        double menor = arreglo[0];
        for(double v:arreglo) if(v<menor) menor=v;
        return menor;
    }
    
    public static double sumaTotalDelArregloDouble(double[] arreglo){
        double suma = 0;
        for(double v:arreglo) suma+=v;
        return suma;
    }
    
    public static double promedioDelArregloDouble(double[] arreglo){
        double promedio = sumaTotalDelArregloDouble(arreglo) / arreglo.length;
        return promedio;
    }
    
    public static double cuantosPares(double[] arreglo){
        int cantidadDePares =0;
        for(double a:arreglo) if(a%2==0) cantidadDePares++;
        return cantidadDePares;
    }
    
    public static int cuantosImpares(double[] arreglo){
        int cantidadDeImpares =0;
        for(double a:arreglo) if(a%2!=0) cantidadDeImpares++;
        return cantidadDeImpares;
    }
    
    
}
