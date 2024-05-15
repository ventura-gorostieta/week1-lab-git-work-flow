import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculatorDemo {

      public long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long[] fibArray = new long[n + 1];
        fibArray[0] = 0;
        fibArray[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        return fibArray[n];
    }

    public static void main(String[] args) {
        FibonacciCalculatorDemo calculator = new FibonacciCalculatorDemo();

        int n = 10;
        System.out.println("Fibonacci de " + n + " es: " + calculator.fibonacci(n));
        System.out.println("Fibonacci de " + n + " es: " + calculator.fibonacci(n));

    }
}
