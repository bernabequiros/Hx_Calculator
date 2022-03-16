
import java.util.Scanner;

public class Exercise6 {

    /*
     * 
     * Ejercicio 06 – Generar “5, 10, 15, 20, 25, 30 … “
     * 
     * Los valores límite son fijados arbitrariamente por el desarrollador​
     * 
     * Mostrar en pantalla la secuencia numérica resultante​
     * 
     * Pista: Mientras pongamos un límite la PC probablemente no se cuelgue …
     */

    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            int limitNumber, count;
            count = 0;

            System.out.print("How many numbers would you like to print?: ");
            limitNumber = input.nextInt();

            for (int i = 0; i < limitNumber; i++) {

                count += 5;

                System.out.println(count);

            }
        }

    }

}
