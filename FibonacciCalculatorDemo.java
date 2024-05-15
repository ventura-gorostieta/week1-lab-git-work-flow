import java.util.HashMap;
import java.util.Map;

public class FibonacciCalculatorDemo {

    private Map<Integer, Long> memoizationCache;

    public FibonacciCalculatorDemo() {
        this.memoizationCache = new HashMap<>();
        this.memoizationCache.put(0, 0L);
        this.memoizationCache.put(1, 1L);
    }

    public long fibonacci(int n) {

        return memoizationCache.computeIfAbsent(
                n, key -> fibonacci(key - 1)
                        + fibonacci(key - 2));
    }

    public static void main(String[] args) {
        FibonacciCalculatorDemo calculator = new FibonacciCalculatorDemo();

        int n = 7;

        System.out.println("La serie Fibonacci de " + n + " es: " + calculator.fibonacci(n));
        System.out.println("Mensaje  de cierre");

    }
}
