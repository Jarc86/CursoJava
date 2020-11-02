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
public class ejercicio22 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        
        System.out.println("Introduce un número (introduce uno negativo para salir): ");
        int input = sc.nextInt();
     
        while (input > 0) {
            
        contador++;    
        
        System.out.println("Introduce otro número (introduce uno negativo para salir): ");
        input = sc.nextInt();
        }
        System.out.println("Ha introducido "+contador+" números");
    }
}
