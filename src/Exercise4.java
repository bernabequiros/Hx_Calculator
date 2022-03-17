
import java.util.Scanner;

public class Exercise4 {

    /*
     * Ejercicio 04 – Hallar (a-b)(a+b)
     * Utilizando nuestra calculadora del Ejercicio 02, resolver la ecuación​
     * 
     * (a-b)(a+b) = ??​
     * 
     * A y B son operandos de la ecuación, representados sobre variables de tipo
     * entero​
     * 
     * Los valores de las variables A y B son fijados arbitrariamente por el
     * desarrollador
     */

    public static void main(String[] args) throws Exception {

        try (Scanner input = new Scanner(System.in)) {
            int number1, number2;

            System.out.println("Enter first number: ");
            number1 = input.nextInt();

            System.out.println("Enter second number: ");
            number2 = input.nextInt();

            System.out.println("(" + number1 + "-" + number2 + ") x (" + number1 + "+" + number2 + ") = "
                    + exercise4(number1, number2));

        }

    }


    public static int exercise4(int n1, int n2) {
        int result = Functions.multiplication(Functions.subtraction(n1, n2), Functions.addition(n1, n2));

        return result;

    }

}