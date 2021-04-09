package labs;

public class Sum1toN {

	public static void main(String[] args) {
		// Write a function that takes a value n returns the sum of numbers 1 to n
		// funz(0) = NO
		// funz(1) = n = 1
		// funz(2) = n + 1 = 2 + 1 = 3
		// funz(3) = n + 2 + 1 = 3 + 2 + 1 = 6
		// funz(4) = n + 3 + 2 + 1 = 4+3+2+1 = 10
		// funz(5) = funz(4) + n = 10+5= 15
		System.out.println(funz(1));
		for (int n = 2; n < 11; n++) {
			System.out.println(funz(n));
		
		}
		System.out.println("********************");
		
		// richiamo funzione corretta
		for (int n = 1; n < 11; n++) {
			System.out.println(sum(n));
		}
	}
	
	
	public static int funz(int n) {
		if (n == 0) {
			return n;
		}
		return (funz(n-1) + n);
		
	}	
	
	
	
	// CORRETTO
	public static int sum(int n) {
	    int sum = 0;
	    for (int i = 1; i <= n; i++) {
	    	System.out.println(sum + " + " + i);
	        sum = sum + i;
	        System.out.println(" = " + sum);
	    }
	    return sum;
	}
	
	
}
