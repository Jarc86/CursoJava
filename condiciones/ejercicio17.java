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
public class ejercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1,num2,num3;
        
        System.out.println("Introduce 3 números enteros:");
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();
        
        if (num1 == num2 && num1 == num3){
            System.out.println("Los tres números son iguales");
        } else {
            if (num1>num2 && num1>num3){
                System.out.println(num1+" Es el mayor.");
            }else{
                if (num2>num1 && num2>num3){
                    System.out.println(num2+" Es el mayor.");
                }else{
                    System.out.println(num3+" Es el mayor.");
                }       
            }
        }
    }
}
