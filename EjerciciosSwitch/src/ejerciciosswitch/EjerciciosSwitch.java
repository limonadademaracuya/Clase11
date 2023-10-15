/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosswitch;

 import java.util.Scanner;

/**
 *
 * @author snowf
 */
public class EjerciciosSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
    Crear un programa que simule la petición de
    una opción según el siguiente menú y muestre
    en pantalla que ha ingresado a la opción
    seleccionada con las opciones siguientes:
        
    ¡Gracias por contactarte con nosotros!
    ¿En qué podemos ayudarte?
    A) Documentación
    B) Cotización
    C) Asistencia
    D) Siniestros
    E) Información de Pagos
    F) Otras Consultas
    G) Anulación
    Escribe la letra de la opción seleccionada.
    
    Debe mostrarse:
    Has elegido Documentación (o la opción que haya elegido)
    */
        Scanner teclado = new Scanner(System.in);
        
        
            System.out.println("¡Gracias por contactarte con nosotros!\n" + "¿En qué podemos ayudarte?");
            System.out.println("Opción 1: Documentación\n" + "Opción 2: Cotización\n" + "Opción 3: Asistencia\n" + 
                    "Opción 4: Siniestros\n" + "Opción 5: Información de pagos\n" + "Opción 6: Otras consultas\n" + 
                    "Opción 7: Anulación");
            System.out.println("Por favor, escribe el número de la opción elegida y luego presiona enter.");
            
            int opciones = teclado.nextInt();
            switch(opciones) {
                case 1: System.out.println("Has seleccionado: Documentación"); break;
                case 2: System.out.println("Has seleccionado: Cotización"); break;
                case 3: System.out.println("Has seleccionado: Asistencia"); break;
                case 4: System.out.println("Has seleccionado: Siniestros"); break;
                case 5: System.out.println("Has seleccionado: Información de pagos"); break;
                case 6: System.out.println("Has seleccionado: Otras consultas"); break;
                case 7: System.out.println("Has seleccionado: Anulación"); break;
                default: System.out.println("El número ingresado no es una opción valida");
            
            }
            
/*
    Solicitar al usuario que ingrese dos números.
    Luego ofrecerle un menú con las siguientes opciones:
    1-suma 2-resta 3-multiplicación 4-división
    Finalmente, mostrar el resultado de la operación
    aritmética elegida.
    */
        System.out.println("Por favor, ingrese dos números para operarlos aritméticamente. ");
    System.out.println("Ingrese un número, presione enter, luego ingrese un segundo número y presione enter nuevamente.");
    double nro1 = teclado.nextDouble();
    double nro2 = teclado.nextDouble();
    
        System.out.println("¿Qué operación aritmética precisa hacer con los números ingresados?");
        System.out.println("Opción 1: Suma\n" + "Opción 2: Resta\n" + "Opción 3: Multiplicación\n" + "Opción 4: División\n");
        System.out.println("Ingrese el número de la opción que corresponda y presione enter.");
        
        opciones = teclado.nextInt();
        
        switch(opciones){
            case 1: System.out.println("Al sumar los dos números ingresados el resultado es: " + nro1 + nro2); break;
            case 2: System.out.println("Al restar los dos números ingresados el resultado es: ");
                System.out.println(nro1 - nro2); break;
            case 3: System.out.println("Al multiplicar los dos números ingresados el resultado es: " + nro1 * nro2); break;
            case 4: System.out.println("Al dividir los dos números ingresados el resultado es: " + nro1 / nro2); break;
            default: System.out.println("El número ingresado no es una opción valida");
            
        
            }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
