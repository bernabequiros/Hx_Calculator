
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise5 {

    /*
     * 
     * Ejercicio 05 – Dados seis números, determinar el menor de ellos:
     * 
     * 
     * Los valores de los seis números son fijados arbitrariamente por el
     * desarrollador​
     * 
     * Mostrar en pantalla el resultado de la comparación​
     * 
     * Pista: Tal vez funcione usar varias veces estructuras condicionales…
     * 
     * 
     */

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber, sixthNumber;

        int lowest;
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        System.out.print("First value: ");
        firstNumber = input.nextInt();

        System.out.print("Second value: ");
        secondNumber = input.nextInt();

        System.out.print("Third value: ");
        thirdNumber = input.nextInt();

        System.out.print("Fourth value: ");
        fourthNumber = input.nextInt();

        System.out.print("Fifth value: ");
        fifthNumber = input.nextInt();

        System.out.print("Sixth value: ");
        sixthNumber = input.nextInt();
        input.close();

        listOfNumbers.add(firstNumber);
        listOfNumbers.add(secondNumber);
        listOfNumbers.add(thirdNumber);
        listOfNumbers.add(fourthNumber);
        listOfNumbers.add(fifthNumber);
        listOfNumbers.add(sixthNumber);

        System.out.println(listOfNumbers);

        lowest = listOfNumbers.get(0);
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (lowest >= listOfNumbers.get(i)

            )
                lowest = listOfNumbers.get(i);

        }

        System.out.println("The lowest number is: " + lowest);
    }

}
