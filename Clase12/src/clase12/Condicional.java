

package clase12;

import java.util.Scanner;


public class Condicional {
    public static void main(String[] args) {
        //Condicionales
        
        //Estructura if
        System.out.println("**Estructura if**");
        
        int nro1 = 20;
        int nro2 = 10;
        
        /*
        estructura:
        if(){ -> en esta línea va la condición a evaluar, dentro de los paréntesis
            acá van las sentencias, dentro del cuerpo del if
        } esta llave indica el final de la estructura del if
        aquí continúa el resto del programa
        */
//        
//        if(nro1 > nro2){
//            System.out.println("El primer número es mayor que el segundo");
//        }
//        System.out.println("Fin de la estructura if");
//        
//        if(nro1 == nro2){
//            System.out.println("Ambos números son iguales");
//        }
//        
//        if (nro1 != nro2) {
//            System.out.println("Ambos números son distintos");
//        }
//        
        //boolean log1  = true;
        //aca no hace falta poner nada más, porque ya sabemos que log1 
        //es verdadero, por lo tanto la condicion será que se log1 es verdadero
        //if (log1 ){
           // System.out.println("Log1 es verdadero");
        //}
        
        //aca cambiaria la cuestion si le pongo que log1 = false, porque la estructira del if ejecuta 
        //una sentencia si la primera condicion es verdadera, pero yo le di un valor de falso a mi primera sentencia, 
        //por lo que hara caso omiso, ni siquiera mostrara 'error' o 'alerta'
        boolean log1 = false;
        
        if (log1) {
            System.out.println("Log1 es verdadero");
        }
        // --------------ojo, aca con el ! no digo que sea distinto, sino que estoy negando el valor de log1-----------------
        
        //if (!log1){
        //    System.out.println("Log1 es verdadero");
        //}
        
//        // tambien se puede escribir en linea si solo ejecutamos una sentencia
        
    if (nro1 > 10 ) System.out.println("El numero 1 es mayor a 10");
        
    if (nro1 == 20 && log1) System.out.println("el nro1 es igual a 20 y Log1 es verdadero");
        
    // ------------- Estructura if-else -------------------
    
    // en caso de que la condicion fuera falsa, se ejecuta el cuerpo del else 
        
        System.out.println(" ---------Estructura if-else -------- ");
        
        // nro2 += 100; 
        
        if(nro1 > nro2){
            System.out.println("El nro1 es mayor que el nro2");
        }else {
            System.out.println("El nro1 no es mayor que el nro2");
        }
        
        // tambien se puede escribir en linea si solo ejecutamos una sentencia
        
        if (10 > 50) System.out.println("El primer nmero es mayor al segundo");
        else System.out.println("El primer numero no es mayor que el segundo");
        
        /*
        --------------- Ejercicio if - else ----------
        
        dado un usuario = "pepito" y una contraseña "1234"
        informar:
        si ingreso bien ambos datos: "Bienvenido pepito!"
        de lo contrario: "ERROR - credenciales incorrectas"        
        
        ------------CONSEJO--------------
        pOR BUENA PRACTICA, NO USEMOS LA Ñ COMO NOMBRE DE UNA VARIABLE
        
        */
        
        Scanner teclado = new Scanner(System.in);
        
        String usuario = "pepito";
        String clave = "1234";
        
        System.out.println("Por favor, ingrese su usuario y presione enter:");
        String _Usuario = teclado.nextLine();
        
        if (usuario.equals("pepito")){
            
            System.out.println("Bienvenido pepito!");
            
        }else{ 
            System.out.println("Error! Credenciales incorrectas");
        }
        
        System.out.println("Ingrese su contraseña y presione enter:");
        
        String _Clave = teclado.nextLine();
        
        if (clave.equals("1234")){
            
            System.out.println("Bienvenido pepito!");
            
        }else{ 
            System.out.println("Error! Credenciales incorrectas");
        }
        
        /*
        Ahora, no era necesario que el usuario interactue, lo que se hizo en clase fue la sola estructura del if
        
        */
        
        System.out.println("**Estructura if-else if-else**");
        
        //Determinar cual es el mayor numero
        
        nro1 = 15;
        nro2 = 30;
        
        if (nro1 > nro2) {
            System.out.println("El nro 1 es mayor al nro 2");
        } else if (nro2 > nro1){
            System.out.println("El nro2 es mayor al nro1");
        } else {
            System.out.println("Ambos numeros son iguales");
        }
        
        // esto NO es un si anidado, esto es para cuando en lugar de dos opciones tenemos tres
        
        int edad = 60;
        
        String genero = "femenino";
        
        if(edad >= 65 && genero.equals("masculino")){
            System.out.println("Puede jubilarse");
        }else if (edad >= 60 && genero.equals("femenino")){
            System.out.println("Puede jubilarse");
        }else {
            System.out.println("No puede jubilarse");
        }
        
        
        
        
    }
}
