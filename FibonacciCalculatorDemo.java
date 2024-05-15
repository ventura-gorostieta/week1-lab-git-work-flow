import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculatorDemo {

    private Map<Integer, Long> memoizationCache;

    public FibonacciCalculatorDemo() {
        this.memoizationCache = new HashMap<>();
        this.memoizationCache.put(0, 0L); // Fibonacci de 0 es 0
        this.memoizationCache.put(1, 1L); // Fibonacci de 1 es 1
    }

    public long fibonacci(int n) {
        return memoizationCache.computeIfAbsent(n, key -> fibonacci(key - 1) + fibonacci(key - 2));
    }

    public static void main(String[] args) {
        FibonacciCalculatorDemo calculator = new FibonacciCalculatorDemo();

        int n = 10;

        System.out.println("Fibonacci de " + n + " es: " + calculator.fibonacci(n));
    }
}
