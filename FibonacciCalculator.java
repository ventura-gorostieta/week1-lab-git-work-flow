import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculator {

    private Map<Integer, Long> memoizationCache;

    public FibonacciCalculator() {
        this.memoizationCache = new HashMap<>();
        this.memoizationCache.put(0, 0L); // Fibonacci de 0 es 0
        this.memoizationCache.put(1, 1L); // Fibonacci de 1 es 1
    }

    public long fibonacci(int n) {
        return memoizationCache.computeIfAbsent(n, key -> fibonacci(key - 1) + fibonacci(key - 2));
    }

    public static void main(String[] args) {
        FibonacciCalculator calculator = new FibonacciCalculator();

        int n = 10;

        System.out.println("Fibonacci de " + n + " es: " + calculator.fibonacci(n));
    }
}
