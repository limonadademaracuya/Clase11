
package vClase_20;

import java.util.Scanner;

/**
 *
 * @author Aula 8 - Docente
 */
public class vClase_20 {

    public static void main(String[] args) {
        System.out.println("*** Funciones y Procedimientos ***");
        
        /*
        Las funciones y procedimientos son un bloque de c�digo que contienen
        una o m�s instrucciones, al cual podemos invocar para que sean 
        ejecutadas. Las funciones y los procedimientos nos van a ayudar a
        hacer nuestro c�digo m�s legible y evitar c�digo duplicado.
        */
        
        System.out.println("** Funciones **");
        /*
        Los m�todos de tipo funci�n siempre retornan un valor. 
        En su declaraci�n deben indicar qu� tipo de valor retornan.
        En su cuerpo debe contener la sentencia 'return' con el retorno
        del tipo de dato que se indic� en su cabecera.
        */
        
        int numero1 = retornarNumeroDiez(); //llamar o invocar al m�todo
        System.out.println(numero1);
        System.out.println(retornarNumeroDiez());
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un n�mero entero:");
        int primerNumero = teclado.nextInt();
        System.out.println("Por favor ingrese otro n�mero entero:");
        int segundoNumero = teclado.nextInt();
        
        System.out.println("La suma de los dos n�meros enteros ingresados es de: ");
        System.out.println(sumarDosEnteros(primerNumero, segundoNumero));
        
        System.out.println(esPar(13));
        
        
        System.out.println("**Procedimientos**");
        
        /*los metodos del tipo procedimiento no tienen un retorno, 
        en su declaraci�n debe tener la palabra void, para indicar que no tiene retorno        
        */
        
        saludar();
        
        saludarConNombre("Sol");
        
        String usuario = "pepito";
        saludarConNombre(usuario);
        
        // vClase_20.esPar(numero1)
                
                
                // psvm + tab
                
    calcularAreaRectangulo(18, 23.56f);
    calcularAreaRectangulo(25.4f, 23.56f);
    
    float baseRectangulo = 12.25f;
    float alturaRectangulo = 32.47f;
    calcularAreaRectangulo(baseRectangulo,alturaRectangulo); 
            
    //sumarParImpar
    
    
    
                
    } // final del m�todo main
    
    //ejemplos de funciones
    public static int retornarNumeroDiez(){
        return 10; // el return debe retornar el mismo tipo de dato
        //declarado en la firma del m�todo
    }
    
    /* este m�todo nos pide dos par�metros
    los par�metros son los valores de entrada
    se escriben indicando primero el tipo de dato y luego su nombre
    el nombre se utiliza para hacer una referencia, no hace falta que se llamen igual 
    al momento de usar el m�todo    
    */
    
    
    
    public static int sumarDosEnteros(int num1, int num2){
        return num1 + num2;
    }
    
    
    /**
     * Este m�todo devuelve/ avisa si el n�mero que le indico es par
     * @param numero
     * @return booleano
     */
    
    public static boolean esPar(int numero){
//        if(numero%2 == 0) { // la l�gica de esto es correcta,
//            return true; //  excepto que el if siempre me devuelve un booleano, 
//        }else{           // y en este caso, mi funci�n tambi�n, por lo que una de las dos est� de m�s
//            return false; // por lo que es m�s que suficiente colocarle la condici�n en el return
//        }
        return numero%2 == 0;
        
    }
    
    // procedimientos
    
    public static void saludar(){
        System.out.println("Hola Mundo!!");
    }
    
    public static void saludarConNombre(String nombre){
        System.out.println("Hola "+nombre+" !!");
    }
    
    public static void calcularAreaRectangulo(float base, float altura){
        float area = base * altura;
        System.out.println("El area del rect�ngulo es " + area);
    
    }
    
    public static void sumarParImpar(int numero1, int numero2, String nombre){
        saludarConNombre(nombre);
        if(esPar(sumarDosEnteros(numero1, numero2))){
            System.out.println("La suma es par!!");
        }else{
            System.out.println("La suma es impar");
        }
    }
    
    
    
} // final de la clase
