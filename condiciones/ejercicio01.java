/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscondiciones;
import java.util.*;
/**
 *
 * @author juan
 */
public class ejercicio01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        
        int valor = sc.nextInt();
        
        if (valor < 0){
            System.out.println("El valor introducido es negativo");
        } else {
            System.out.println("El valor introducido es positivo");
        }
        
    }
}
