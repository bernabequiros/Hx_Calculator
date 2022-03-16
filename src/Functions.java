public class Functions {
    public static void main(String[] args) throws Exception {

    }

    public static int addition(int n1, int n2) {
        int result = n1 + n2;

        return result;

    }

    public static int subtraction(int n1, int n2) {
        int result = n1 - n2;

        return result;

    }

    public static int multiplication(int n1, int n2) {
        int result = n1 * n2;

        return result;
    }

    public static int division(int n1, int n2) {
        int result = n1 / n2;

        return result;
    }

    public static double power(int n1, int n2) {
        double result = Math.pow(n1, n2);

        return result;
    }

    public static double square(int n1) {
        double result = Math.sqrt(n1);

        return result;

    }

    public static int exercise3(int n1, int n2, int n3) {
        int result = addition(n1, n2) + addition(n3, 100);

        return result;

    }

    public static int exercise4(int n1, int n2) {
        int result = multiplication(subtraction(n1, n2), addition(n1, n2));

        return result;

    }
}
