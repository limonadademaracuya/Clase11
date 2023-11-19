

package Clase25Tarea;

import java.util.Arrays;
import java.util.Collections;


public class Arreglos {
    public static void main(String[] args) {
        
        //Si tuviéramos que guardar varios números en variables:
        int variable1 = 456;
        int variable2 = 34;
        int variable3 = 98;
        
        /*
        Podemos generar un conjunto de variables que tenga un mismo
        nombre que las agrupe a todas.
        Se puede acceder a cada variable por medio del índice.
        El índice comienza en 0 y finalizan en la longitud -1.
        Con esto logramos optimizar la lectura de la información para
        acceder por un mismo nombre a distintas variables, y no por 
        el nombre de cada una.
        */
        
        System.out.println("** Arreglos, vectores o Arrays **");
        
        /*
        DECLARACIÓN:
        tipoDeDato[] indentificador; --> declaración
        tipoDeDato identificador[]; --> declaración
        identificador = new tipoDeDato[n]; --> cantidad de variables que tendrá
        */
        
        float[] temperaturas; //declaración de arreglo
        temperaturas = new float[10]; //definición de la longitud
        float temperaturas2[];
        temperaturas2 = new float[12];
        String[] nombres = new String[5]; //declaración y definición
        //de longitud en línea.
        
        //asignación de valores a las variables de un arreglo
        temperaturas[0] = 25.32f;
        temperaturas[1] = 12.56f;
        temperaturas[2] = 23.12f;
        temperaturas[3] = 36.12f;
        
        //temperaturas[4] = "Jose"; error, la variable no es del mismo tipo
        
        nombres[0] = "Juan";
        nombres[1] = "Mariana";
        //nombres[5] = "Jorge"; //error, no existe el subíndice 5

        
        //leer el contenido de un subíndice:
        System.out.println(temperaturas[2]);
        System.out.println(nombres[1]);
        System.out.println(nombres[4]);
        //System.out.println(nombres[6]); //error, no existe esa posición
        
        //inicialización
        int[] numeros = {12, 59, 87, 129, 0};
             //posición   0   1   2    3  4  
        //en este caso, declaramos e inicializamos un vector de enteros
        //con 5 posiciones.
        
        //mostrar el contenido de un arreglo:
        System.out.println(numeros); // no muestra el contenido
        //muestra la posición de memoria del vector en formato
        //hexadecimal. Porque el nombre del vector es una referencia,
        //no es el contenido.
        
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
        contador++;
        System.out.println(numeros[contador]);
        contador++;
        System.out.println(numeros[contador]);
        contador++;
        System.out.println(numeros[contador]);
        contador++;
        System.out.println(numeros[contador]);
        
        //recorrido con for
        System.out.println("\nRecorrido con for");
        for(int i=0; i<5;i++){
            System.out.println(numeros[i]);
        }
        
        System.out.println("\nRecorrido con for, mostrando el índice");
        for(int i=0;i<5;i++){
            System.out.println("El contenido del vector en la posición "
                    + i + " es "+ numeros[i]);
        }
        
        //longitud de un vector
        System.out.println("\nLongitud del vector:");
        //el atributo length muestra la longitud del vector,
        //es decir, cuántos elementos tiene.
        System.out.println(numeros.length);
        
        System.out.println("\nRecorrido teniendo en cuenta la longitud");
        for (int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        /*
        Ojo, no poner menor e igual a la longitud porque da error        
        for (int i=0; i<=numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        */
        
        //copias de arreglos
        char[] origen = {'a', 'b', 'c', 'x', '@'};
        
        //creamos un arreglo de destino con la misma longitud que el origen
        char[] destino = new char[origen.length];
        
        //recorremos los arreglos
        System.out.println("Arreglo de origen:");
        for (int i=0; i<origen.length; i++) {
            System.out.print(origen[i]+" ");
        }
        
        System.out.println("\nArreglo de destino:");
        for (int i=0; i<destino.length; i++) {
            System.out.print(destino[i]+" ");
        }
        System.out.println("");
        //para copiar el contenido
        //asignando el valor por posición de a uno
//        destino[0] = origen[0];
//        destino[1] = origen[1];
//        destino[2] = origen[2];
//        destino[3] = origen[3];
//        destino[4] = origen[4];
//        
//        System.out.println("Arreglo de origen:");
//        for (int i=0; i<origen.length; i++) {
//            System.out.print(origen[i]+" ");
//        }
//        
//        System.out.println("\nArreglo de destino:");
//        for (int i=0; i<destino.length; i++) {
//            System.out.print(destino[i]+" ");
//        }
//        System.out.println("");
        
        
        //realizamos la copia por medio de un for
        for (int i=0; i<origen.length; i++) {
            destino[i] = origen[i];
        }
        
        System.out.println("Arreglo de origen:");
        for (int i=0; i<origen.length; i++) {
            System.out.print(origen[i]+" ");
        }
        System.out.println("");
        
        System.out.println("\nArreglo de destino:");
        for (int i=0; i<destino.length; i++) {
            System.out.print(destino[i]+" ");
        }
        System.out.println("");
        
        //copiar vectores utilizando System.arraycopy
        int[] pares = {2, 4, 6, 8, 10};
        int[] impares = {1, 3, 5, 7, 9};
        
        int[] pares2 = new int[pares.length];
        
        System.out.println("Contenido del vector pares2:");
        for (int i=0; i<pares.length; i++) {
            System.out.println(pares2[i]);
        }
        
        System.arraycopy(pares, 0, pares2, 0, pares.length);
        //el primer parámetro pide el arreglo de origen
        //el segundo parámetro pide desde qué posición del arreglo de origen
        //el tercer parámetro pide el arreglo de destino
        //el cuarto parámetro pide desde qué posición del arreglo de destino
        //el quinto parámetro indica la longitud del copiado.
        
        System.out.println("Contenido del vector pares2:");
        for (int i=0; i<pares.length; i++) {
            System.out.println(pares2[i]);
        }
        
        //ordenar un vector
        int[] vector = {4, 56, 73, 12, 38, 1, 60, 7};
        System.out.println("Contenido de \'vector\'");
        for (int i=0; i<vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        //el método sort() de la clase Arrays ordena el contenido de un vector
        System.out.println("Recorrido de \'vector\' ordenado");
        Arrays.sort(vector);
        for (int i=0; i<vector.length; i++) {
            System.out.println(vector[i]);
        }
        
        //recorrido foreach aparece a partir del JDK 5
        //es una simplificación de la estructura for
        /*
        for(tipo_de_dato elemento_objeto : colección){
            //sentencias que se ejecutan en cada iteración
        }
        */
        
        //ya no necesitamos preocupanos por el índice, ni el límite, ni el incremento
        
        System.out.println("Recorrido foreach");
        for(int v:vector) System.out.println(v);
        
        int pos=0;
        for(int v:vector){            
            System.out.println("Posición "+pos+" :"+v);
            pos++;
        }
        
        //obtener el promedio
        System.out.println("Cálculo del promedio");
        int[] datos = {12, 35, 59, 68, 12};
        float suma = 0;
        
//        for(int i=0; i<datos.length; i++){
//            suma += datos[i];
//        }
        //con foreach
        for(int d:datos) suma+=d;    
        
        System.out.println("El promedio de los números ingresados es: "
                +(suma/datos.length));
        
        //contamos la cantidad de números pares que tiene el arreglo
        int cantidadDePares =0;
        for(int d:datos) if(d%2==0) cantidadDePares++;
        
        //cálculo del mayor
        int mayor=datos[0];

        //con for
//        for (int i=0; i<datos.length; i++) {
//            if(datos[i] > mayor){
//                mayor = datos[i];
//            }
//        }
        
        //con foreach
        for(int d:datos) if(d>mayor) mayor=d;
        
        System.out.println("El mayor número del arreglo \'datos\' es: "+mayor);
        
        //cálculo del menor
        int menor = datos[0];
        
        //con foreach
        for(int d:datos) if(d<menor) menor=d;
        
        System.out.println("El menor número del arreglo \'datos\' es: "+menor);
        
        //El atributo MIN_VALUE muestra el menor número posible
        int mayor2 = Integer.MIN_VALUE ;
        System.out.println(mayor2);
        //El atributo MAX_VALUE muestra el mayor número posible
        int menor2 = Integer.MAX_VALUE;
        System.out.println(mayor2);
        System.out.println("**********************");
        
        /*
        Ejercicio:
        Crear un vector de enteros de 10 posiciones
        Pedirle al usuario que cargue 10 valores para ese vector
        Mostrar con foreach el listado de números que ingresó.
        Mostrar la suma de todos los elementos
        Mostrar el promedio
        Indicar cuántos números pares y cuántos impares hay
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
        
    }
}
