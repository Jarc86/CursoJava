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
public class ejercicio30 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double altura=0,mediaEdad=0,mediaAltura=0;
        short edad=0,mayores=0,altos=0;
  
        for (int i = 1; i < 6; i++) {
            System.out.println("Edad "+i+" :");
            edad=sc.nextShort();
            System.out.println("Altura "+i+" :");
            altura = sc.nextDouble();
            
            //Se van sumando las edades y alturas pa hallar luego las medias
            mediaEdad += edad;
            mediaAltura += altura;
            
            //Suma 1 al numero de mayores cada vez que introducimos alguien con mas de 18 años
            mayores = (edad>18)?++mayores:mayores;
            //Suma 1 al numero de mayores cada vez que introducimos alguien con mas de 18 años
            altos = (altura > 1.75)?++altos:altos;

        }   
        System.out.println("Media de edad: "+(mediaEdad/5));
        System.out.println("Media de altura: "+(mediaAltura/5));
        System.out.println("Mayores de 18: "+mayores);
        System.out.println("Más altos de 1.75cm: "+altos);
    }
}
