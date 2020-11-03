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
public class ejercicio36 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=0;
        
        System.out.println("Introduce numero 1");
        num1 = sc.nextInt();
        
        System.out.println("Introduce numero 2");
        num2 = sc.nextInt();
        
        for (int i = 0; i < num1; i++) {
            
            if (i%num2 != 0) {
                    System.out.println(i);
            }
         
        }
    }
}
