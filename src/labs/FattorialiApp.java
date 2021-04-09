package labs;

public class FattorialiApp {

	public static void main(String[] args) {
		// Write a function that computes the factorial value
		// ft(0) = 1
		// ft(1) = 1! = 1
		// ft(2) = 2! = 2x1 = 2
		// ft(3) = 3! = 3x2x1 = 6
		// ft(4) = 4! = 4x3x2x1 = 24
		// ft(5) = 5! = 5x4x3x2x1 = 120
		System.out.println(ft(1));
		for (int n = 2; n < 11; n++) {
			System.out.println(ft(n));
		}
		System.out.println("******************");
		
		// print soluzione corretta
		for (int n = 1; n < 11; n++) {
			System.out.println(fact(n));
		}
	}
	
	// MIO
	public static int ft(int n) {
		if (n == 0) {
			return 1;
		}
		return (n * ft(n-1));
		
	}	
	
	// CORRETTO:
	public static int fact(int n) {
	    if (n == 0) {
	        return 1;
	    }
	    else if (n == 1) {			// se non metto questa condizione, n= 1 diventa (n-1)*n = (1-1)*1= 0*1= 0
	        return 1;
	    }
	    return fact(n-1) * n;
	}
}
