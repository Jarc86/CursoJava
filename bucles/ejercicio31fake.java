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
public class ejercicio31fake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce número");
        int n = sc.nextInt();
        
        for (int i = 0; i < n+1; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
