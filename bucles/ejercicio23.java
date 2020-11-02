/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class ejercicio23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int input;
        int numeroSecreto = random.nextInt(11);
        
        do {
            System.out.println("Intenta acertar el número secreto (0 a 10): ");
            input = sc.nextInt();
        } while (input != numeroSecreto);           
        System.out.println("Muy bien, el número secreto era "+numeroSecreto);
    }
}
