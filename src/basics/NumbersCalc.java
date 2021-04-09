package basics;

public class NumbersCalc {
	
	public static void main (String[] args) {				// void significa che esegue ma non ritorna nulla
		System.out.println("Il programma parte");
		printName();						// se printName NON è inserita qui ma rimane solo dichiarata in basso, non viene eseguita
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		System.out.println("Il prodotto dei numeri " + numA + " e " + numB + " è " + product);	
		// le due precedenti righe possono essere sostituite da quella sotto, l'esito è lo stesso. 
		// Sopra chiama la variabile product, sotto chiama la funzione 
		System.out.println("Il prodotto dei numeri " + numA + " e " + numB + " è " + multiplyNumbers(numA, numB));	
		// fa print della funzione, che per sua natura restituisce un risultato numerico
		
	}
	
	static void printName() {								
		// void significa che esegue ma non ritorna nulla. Nessun parametro
		System.out.println("Mi chiamo Giorgia");
	}
	
	
	static void addNumbers(int numberA, int numberB) {		
		// void significa che esegue ma non ritorna nulla. Definiti anche i parametri di input
		//somma 2 numeri
		int sum = numberA + numberB;
		System.out.println("La somma dei numeri " + numberA + " e " + numberB + " è " + sum);
	}

	
	
	static int multiplyNumbers(int valueA, int valueB) {		// in questo caso NON c'è VOID, quindi esegue e ritorna qualcosa
		// tra parentesi definisco quali parametri può ricevere in input questa funzione, due int
		// moltiplica 2 numeri
		int product = valueA * valueB;
		return product;
		
	}
	
	
	
	
}
