
import java.util.Scanner;

public class Exercise3 {

    /*
     * Ejercicio 03 – Hallar A+B+C+100
     * Utilizando nuestra calculadora del Ejercicio 02, resolver la ecuación​
     * 
     * A+B+C+100 = ??​
     * 
     * A, B y C son operandos de la ecuación, representados sobre variables de tipo
     * entero​
     * 
     * Los valores de las variables A, B y C son fijados arbitrariamente por el
     * desarrollador
     */

    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            int valueA, valueB, valueC;

            System.out.println("Enter value for A ");
            valueA = input.nextInt();

            System.out.println("Enter value for B");
            valueB = input.nextInt();

            System.out.println("Enter value for C ");
            valueC = input.nextInt();

            System.out.println("A: " + valueA + " + B: " + valueB + " + C: " + valueC + " + 100 = "
                    + exercise3(valueA, valueB, valueC));

        }

    }

    public static int exercise3(int n1, int n2, int n3) {
        int result = Functions.addition(n1, n2) + Functions.addition(n3, 100);

        return result;

    }
}