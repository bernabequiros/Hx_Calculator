import java.util.Scanner;

/* 
Ejercicio 02 – Desarrollar una Calculadora Básica

Debe incluír las siguientes funciones​:

        Suma de dos operandos​

        Resta de dos operandos​

        Multiplicación de dos operandos​

        División de dos operandos​

        Potencia de un operando​

        Raíz cuadrada de un operando​

Cada función debe poder ser ejecutada individualmente de las otras

*/
public class Calculator {
    public static void main(String[] args) throws Exception {
        int number1, number2;

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Choose an operator: + , - , * , / , P (power) or S (square)");

            char operator = input.next().charAt(0);

            switch (operator) {
                case '+':

                    System.out.println("Enter first number: ");
                    number1 = input.nextInt();

                    System.out.println("Enter second number: ");
                    number2 = input.nextInt();

                    System.out.println(number1 + " + " + number2 + " = " + Functions.addition(number1, number2));

                    break;

                case '-':

                    System.out.println("Enter first number: ");
                    number1 = input.nextInt();

                    System.out.println("Enter second number: ");
                    number2 = input.nextInt();

                    System.out.println(number1 + " - " + number2 + " = " + Functions.subtraction(number1, number2));

                    break;

                case '*':

                    System.out.println("Enter first number: ");
                    number1 = input.nextInt();

                    System.out.println("Enter second number: ");
                    number2 = input.nextInt();

                    System.out.println(number1 + " * " + number2 + " = " + Functions.multiplication(number1, number2));

                    break;

                case '/':

                    System.out.println("Enter first number: ");
                    number1 = input.nextInt();

                    System.out.println("Enter second number: ");
                    number2 = input.nextInt();

                    System.out.println(number1 + " / " + number2 + " = " + Functions.division(number1, number2));

                    break;

                case 'P':

                    System.out.println("Enter first number: ");
                    number1 = input.nextInt();

                    System.out.println("Enter second number: ");
                    number2 = input.nextInt();

                    System.out.println(number1 + " ^ " + number2 + " = " + Functions.power(number1, number2));

                    break;

                case 'S':

                    System.out.println("Enter first number: ");
                    number1 = input.nextInt();

                    System.out.println("Enter second number: ");
                    number2 = input.nextInt();

                    System.out.println("The square of " + number1 + " is  = " + Functions.square(number1));
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;

            }

            input.close();
        }
    }

}
