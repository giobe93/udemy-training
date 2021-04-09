package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Il numero di Fibonacci è la somma dei due precedenti numeri Fibonacci
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(0) + fib(1) = 0 + 1 = 1
		// fib(3) = fib(1) + fib(2) = 1 + 1 = 2
		// fib(4) = fib(2) + fib(3) = 1 + 2 = 3
		// fib(5) = fib(3) + fib(4) = 2 + 3 = 5
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		for (int n = 3; n < 21; n++) {
			System.out.println(fib(n));
		}

	}
	
	public static int fib(int n) {
		if (n== 0) {
			return 0;						// se n=0 ritorna 0 e si ferma
		}
		else if (n == 1) {
			return 1;						// se n=1 ritorna 1 e si ferma
		}
		return (fib(n-1) + fib(n-2));		// in tutti gli altri casi, ritorna il risultato dell'espressione
		
	}

}
