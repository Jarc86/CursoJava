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
public class ejercicio18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce dos números enteros: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        
        if (num1 == num2) {
            System.out.println("Los números deben ser distintos.");
        } else {
            int contador=0;
            int primero = Math.min(num1, num2);
            int numeroVueltas = (Math.max(num1, num2) - Math.min(num1, num2))/7;
            
            System.out.print("Números obtenidos: ");
            for (int i = 0; i < numeroVueltas; i++) {
               
                contador = contador+7;
                System.out.print(primero+contador+" "); 
            }
        }
    }
}
