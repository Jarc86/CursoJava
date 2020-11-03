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
public class ejercicio34 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String resultado = "Es primo";
        
        System.out.println("Introduce numero");
        int input = sc.nextInt();
        
        for (int i = 2; i < input; i++) {
            
            if (input%i == 0) {
                resultado = "No es primo";
                break;
            }
            
        }
        System.out.println(resultado);
    }
}
