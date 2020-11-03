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
public class ejercicio38 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero de 3 cifras");
        int input = sc.nextInt();
      
        for (int i = 0; i < 3; i++) {
            
            System.out.print(input%10+" ");
            input=input/10;
            
        }
    }
    
}
