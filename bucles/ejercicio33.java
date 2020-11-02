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
public class ejercicio33 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int base,exp,potencia=1;
        System.out.println("Introduce base: ");
        base =sc.nextInt();
        System.out.println("Introduce exponente: ");
        exp = sc.nextInt();
        
        for (int i = 0; i < exp; i++) {
            
            potencia = potencia*base;
        }
        System.out.println(potencia);
    }
}
