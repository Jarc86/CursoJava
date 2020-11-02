/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones;
import java.util.*;
/**
 *
 * @author juan
 */
public class ejercicio03 {
    
    public static void main(String[] args) {
        
        System.out.println("Introduce un número entero");
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        
        if (input%10 == 0)
            System.out.printf("%d es multiplo de 10\n", input);
        else
            System.out.printf("%d no es multiplo de 10\n", input);
    }
    
}
