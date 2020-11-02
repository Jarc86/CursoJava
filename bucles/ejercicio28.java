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
public class ejercicio28 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sumatorio = 0, input, mayoresMil=0;
                
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Introduce sueldo "+(i+1));
            input = sc.nextInt();
            sumatorio += input;
            
            mayoresMil = (input > 1000)?(mayoresMil+1):mayoresMil;   
        }
        System.out.println("Suma de sueldos: "+sumatorio);
        System.out.println("Sueldos mayores de 1000€: "+mayoresMil);
    }
}
