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
public class ejercicio29 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int negativo = 0;
        System.out.println("Introduce 10 numeros");
        
        for (int i = 0; i < 10; i++) {
        
            negativo = (sc.nextInt() < 0)? ++negativo:negativo;  
        }
        System.out.println("Números negativos introducidos: "+negativo);
    }
}
