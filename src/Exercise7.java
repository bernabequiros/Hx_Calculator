
import java.util.Scanner;

public class Exercise7 {

    /*
     * Ejercicio 07 – Siendo n=7, generar “6, 5, 4, 3, 2, 1, 0, -1, -2, …”
     * 
     * Los valores límite son fijados arbitrariamente por el desarrollador​
     * 
     * Mostrar en pantalla la secuencia numérica resultante​
     * 
     * Pista: Esta vez, usar While es trampa. Hay que usar otra estructura iterativa
     * …
     * 
     */

    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            int limitNumber, count;
            count = 7;

            System.out.print("How many numbers would you like to print?: ");
            limitNumber = input.nextInt();

            for (int i = 0; i < limitNumber; i++) {

                count -= 1;

                System.out.println(count);

            }
        }

    }

}
