/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;
import java.util.*;
/**
 *
 * @author juan
 */
public class ejercicio27 {
     public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         String input;
         int contador=1,sumatorio=0,numero;
         boolean salir = false;
         
         System.out.println("Introduce los numeros a sumar (introduce *fin* para salir):");    
         while (!salir) {   
            //E contador sólo se usa para que el usuario sepa cuantos números ha metido hasta ahora
            System.out.println("Introduce el número "+contador+"º: ");
            contador++;
            input = sc.nextLine().toLowerCase();
            //Si la cadena introducida no es "fin", la convierto a entero y los voy sumando
            //(solo funciona suponiendo que la cadena será o bien "fin" o un número entero)
            if (!input.equals("fin")) {
                numero = Integer.parseInt(input);
                sumatorio += numero;
            }
            //Si la cadena es fin, salir pasa a ser "true" y sale del bucle
            salir = (input.equals("fin"));
         }
         System.out.println("La suma es: "+sumatorio);
    }
}
