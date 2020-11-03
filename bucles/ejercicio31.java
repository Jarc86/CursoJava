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
public class ejercicio31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int fibo1=0, fibo2=1,fibo3;
        
        System.out.println("Introduce numero: ");
        int n = sc.nextInt();
        
        System.out.print(fibo1);
        System.out.print(" "+fibo2);
        for (int i = 0; i < n-2; i++) {

            fibo3 = fibo1+fibo2;
            fibo1 = fibo2;
            fibo2= fibo3;
            System.out.print(" "+fibo3);   
        }
    } 
}
