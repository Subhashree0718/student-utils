public class Calculator {

    // Addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public static int sub(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int mul(int a, int b) {
        return a * b;
    }

    // Division with error handling
    public static double div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return (double) a / b;
    }

    // Modulo operation
    public static int mod(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot modulo by zero!");
        }
        return a % b;
    }

    // Power function (a^b)
    public static double power(int a, int b) {
        return Math.pow(a, b);
    }

    // Optional: nice demo print for mentor
    public static void demo() {
        int x = 10, y = 3;
        System.out.println("Demo Calculator:");
        System.out.println(x + " + " + y + " = " + add(x, y));
        System.out.println(x + " - " + y + " = " + sub(x, y));
        System.out.println(x + " * " + y + " = " + mul(x, y));
        System.out.println(x + " / " + y + " = " + div(x, y));
        System.out.println(x + " % " + y + " = " + mod(x, y));
        System.out.println(x + " ^ " + y + " = " + power(x, y));
    }
}
