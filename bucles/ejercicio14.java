/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ejercicio14 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num=0;
        
        for (int i = 1; i < 16; i++) {
            
            System.out.println("Introduce "+i+"º número: ");
            num = sc.nextInt()+num;
        }
        System.out.println("La suma total es: "+num);
    }
}
