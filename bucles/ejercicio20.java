/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class ejercicio20 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero (0 para salir)");
        int input=sc.nextInt();
        
        while (input != 0) {
            
            if (input > 0) 
                System.out.print("El número "+input+" es positivo, ");
            else
                System.out.print("El número "+input+" es negativo, ");
            
            System.out.println("introduce otro numero (0 para salir)");
            input = sc.nextInt();          
        }
        System.out.println("¡Adios amigo!");
    }
}
