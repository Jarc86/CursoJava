package bucles;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author juan
 */
public class ejercicio24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int input;
        int numeroSecreto = random.nextInt(11);
        
        System.out.println("Intenta acertar el número secreto (0 a 10): ");
        
        do {
            input = sc.nextInt();
            
            if (input > numeroSecreto) {
                System.out.println("El número secreto es menor que "+input);
            } else {
                System.out.println("El número secreto es mayor que "+input);
            }
            
        } while (input != numeroSecreto);           
        System.out.println("Muy bien, el número secreto era "+numeroSecreto);
    }
}
