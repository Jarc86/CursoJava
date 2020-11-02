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
public class ejercicio17 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        int sumatorio = 0;
        
        if (num < 0) {
            System.out.println("El numero introducido debe ser positivo.");
        } else {
            
            for (int i = 0; i < 100; i++) {
                
                sumatorio = sumatorio + (++num);
            }
            System.out.println("Suma = "+sumatorio);
        }
    }
}
