package bucles;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class ejercicio15ConArrays {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      
        //Declaro un array donde voy a almacenar luego los números que son multiplos de 3
        int [] multiplos = new int[5];
        int num = 0; //Variable a la que se le asignará luego un valor leído por teclado
        
        //La variable siguiente "contador" la uso en el bucle para guardar en orden los multiplos de
        //3 ya que si uso "i" para grabar los valores en el array, me va a guardar "0" en las 
        //posiciones donde el valor introducido no ha sido multiplo de 3
        int contador = 0;
        
        //Bucle for donde pide 5 numeros y guarda los multiplos de 3 en el array
        System.out.println("Introduce 5 números (pulsa intro despues de cada uno de ellos): ");
        for (int i = 0; i < 5; i++) {   
            num = sc.nextInt();
            if (num%3 == 0){
                multiplos[contador] = num;
                contador++;
            }
        }
        //Bucle que muestra los valores almacenados en el array "multiplos"
        System.out.print("Los multiplos de 3 introducidos son --> ");
        for (int i = 0; i < contador; i++) {
            System.out.print(multiplos[i]+" "); 
        }
    }
}
