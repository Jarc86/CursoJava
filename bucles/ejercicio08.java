/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author usuario
 */
public class ejercicio08 {
    public static void main(String[] args) {
        int multiplo = 0;
        int contador = 1;
        
        while (multiplo < 100) {
            
            multiplo = contador*5;
            System.out.println(multiplo);    
            contador++;
        }
    }
}
