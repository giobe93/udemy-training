package labs;

public class MinMaxAverage {

	public static void main(String[] args) {
		// Write 3 functions that take an array as a parameter and return the minimum, average, and maximum values of that array
		
		// int[] pari = { 2,4,6,8,10,12,14,16,18,20};
		// int[] dispari = {1,3,5,7,9,11,13,15,17,19};
		// int[] primi = { 1,2,3,5,7,11,13,17,19};
		int[] numbers = {5, -2, 0, 234, -438, 63};
		
		System.out.println("Min: " + findMin(numbers));
		System.out.println("MAx: " + findMax(numbers));
		System.out.println("Average: " + findAvg(numbers));
	}
	
	/* ??
	public static int min(int primi)
			return primi.
	public static int max(int primi)
	public static int mean(int primi)
	*/
	
	// SOLUZIONI:
	
	public static int findMax(int[] arr) {				// come min
	    int max = arr[0];					
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	    }
	    return max;
	}

	
	public static int findMin(int[] arr) {
	    int min = arr[0];					// pongo che il minimo è l'array con valore 0 (il primo elemento)
	    for (int i = 0; i < arr.length; i++) {	// creo un loop che verifica tutti gli elementi dell'array, finché l'elemeno i non coincide con l'ultimo elemento (array.length)
	        if (arr[i] < min) {				// se l'array all'elemento i è minore di min (cioè primo elemento che ho posto sopra), allora min diventa il mio i
	            min = arr[i];
	        }
	    }
	    return min;							// ritorna il min stabilito alla fine del loop
	}

	
	public static int findAvg(int[] arr) {		
	    int sum = 0;							// pongo che la somma è l'array con valore 0 (il primo elemento)
	    for (int i = 0; i < arr.length; i++) {	// creo un loop che somma l'elemento i alla somma precedente (elemento 0), finché l'elemeno i non coincide con l'ultimo elemento (array.length)
	        sum = sum + arr[i];					
	    }
	    return sum / arr.length;				// ritorna la media, che è somma divisa per n° elementi
	}

}

