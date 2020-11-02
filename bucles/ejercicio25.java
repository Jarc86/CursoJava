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
public class ejercicio25 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int maximo=0,input;
        System.out.println("Introduce 10 números");
        
        for (int i = 1; i < 11; i++) {
            
            System.out.println("Numero "+i+"º: ");
            input = sc.nextInt();
            
            maximo = (input > maximo)? input:maximo;            
        }
        System.out.println(maximo+" fue el valor máximo introducido");
    }
}
