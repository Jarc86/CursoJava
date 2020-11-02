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
public class ejercicio16 {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        
        System.out.println("Número   Cuadrado    Cubo");
        for (int i = num; i < num+5; i++) {
            
            System.out.println(i+"         "+(Math.pow(i, 2))+"        "+(Math.pow(i, 3)));
            
        }
    }
}
