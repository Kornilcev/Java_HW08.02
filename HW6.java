package lesson6;

public class HW6 {
    public static void main(String[] args) {
        System.out.println("7*5" + calc(7, 5, '*'));
        printDigits(21);
        fib(500);
        System.out.println(sumOfDigits(673));
        System.out.println("Миша: " + reverse("Миша"));
    }

    public static double calc(double a, double b, char c) {
        return switch (c) {
            case '*' -> a * b;
            case '/' -> a / b;
            case '+' -> a + b;
            case '-' -> a - b;
            default -> -1;
        };
    }

    public static void printDigits(int a) {
        for (int i = 1; i <= a; i++) {
            if (i % 5 == 0 || i % 7 == 0 || i % 13 == 0) {
                System.out.println("i: " + i);
            }

        }

    }

    public static void fib(int p) {
        int current = 2;
        int previous = 1;
        System.out.println("fib: " + previous);
        System.out.println("fib: " + current);
        while (current < p) {
            int newCurrent = current + previous;
            previous = current;
            current = newCurrent;
        }
    }

    public static int sumOfDigits(int i) {
        String s = "" + i;
        int sum = 0;
        for (int j = 0; j < s.length(); j++) {
            String digit = s.substring(j, j + 1);
            sum += Integer.parseInt(digit); // преобразует строку в число "33" -> 33
        }
        return sum;
    }
    public static String reverse(String s){
        String r = "";
        for(int i = s.length() - 1; i >= 0; i--){
            r += s.charAt(i);
        }
        return r;
    }
}


