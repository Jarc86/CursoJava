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
public class ejercicio16 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Número 1");
        int num1=sc.nextInt();
        System.out.println("Número 2");
        int num2=sc.nextInt();
        
        if (num1==num2){
            System.out.println("Ambos números son iguales");
        }else{
            if(num1>num2){
                System.out.println(num1+" es mayor que "+num2);
            }else{
                System.out.println(num2+" es mayor que "+num1);
            }
           
        }
        
        
        
    }
    
}
