package objectOrientedProgramming;

public class BankAccount implements IRate {							// la classe BankAccount implementa IRate. In basso vanno indicati i metodi interfaccia
//public class BankAccount {			
	// definire le variabili
	String accountNumber;
	private static final String routingNumber = "012345";	
		// mettendo static e il valore, esso appartiene alla classe e non al particolare oggetto. 
		// aggiungendo final, diventa una costante
		// aggiungendo private, si può accedere alla variabile solo dall'interno della classe
	// Instance Variables
	
	//String name;
	private String name;
	//	String SSN;
	private String SSN;
	String accountType;
	double balance;						// double = decimali
	
	// Constructor definitions: metodi unici, se non indicati viene usato uno di default
		// 1) usati per definire, inizializzare proprietà di un oggetto
		// 2) vengono IMPLICITAMENTE chiamati durante l'istanziazione, ovvero appena viene creato l'oggetto
		// 3) hanno stesso nome della classe
		// 4) non hanno alcun tipo di ritorno
		BankAccount() {							// diventa il constructor di default
			System.out.println("CREATO NUOVO ACCOUNT");
	}
		
	//Overloading: chiamare lo stesso nome di metodo ma con argomento diverso, accedendo così a parti diverse del codice						// è un esempio di POLIMORFISMO! 
	BankAccount(String accountType) {
		System.out.println("NUOVO ACCOUNT: " + accountType);
	}				// diventa un constructor richiamabile con stesso nome e l'argomento indicato
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, Msg sono variabili LOCALI, 
		// cioè definite all'interno di blocchi, metodi, if statements, loop
		// esistono solo all'interno di quel blocco
		System.out.println("NUOVO ACCOUNT: " + accountType);
		System.out.println("DEPOSITO INIZIALE DI: $ " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: il deposito minimo deve essere di almeno $1000";
		} else {
			Msg = "Grazie per il deposito iniziale di : $ " + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters / Setters :
	
	// come permettere all'utente di definire nome senza dargli accesso alla variabile name (privata)? Usando una funzione
	// utente passerà un nome (stringa) 
	public void setName (String name) {					// public = accessibile da fuori. Void = non restituisce nulla
		this.name = "Mr. " + name;								// this.name fa riferimento alla variabile name che appartiene alla classe. = name fa riferimento al parametro passato nell'argomento
	}													// viene posto che la variabile locale name (che è dichiarata nell'argomento del metodo setName ed esiste solo in questo metodo) è uguale
														// alla variabile globale name (che esiste a livello di classe ed è indicata in alto con accesso privato)
	
	public String getName() {							// senza VOID, perché deve restituire il nome
		return name;									// name si riferisce qui alla variabile globale privata
	}
	
		// è possibile creare getters / setters in automatico da Source > Generate Getters and Setters
	
	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}
	
	
	// Interface methods:
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	

	// definire i metodi														
	public void deposit (double amount) {									// public = disponibile ovunque nel progetto					
		balance = balance + amount;
		showActivity("DEPOSIT");							// richiamando la showActivity qui (dentro la classe), è possibile poi mostrarla nella BankAccounApp chiamando deposit()
	}
	
	void withdraw (double amount) {											// default = disponibile solo nel pacchetto
		balance = balance + amount;
		showActivity("WITHDRAW");							// richiamando la showActivity qui (dentro la classe), è possibile poi mostrarla nella BankAccounApp chiamando withdraw()
	}
	
	private void showActivity(String activity) {								// private = disponibile solo nella classe, richiamabile solo dall'interno della classe
		System.out.println("Your recent trasaction: " + activity);				// tentando di richiamare showActivity dalla BankAccountApp, non si riesce (classe diversa)
		System.out.println("Your new balance is: $" + balance);
	}
	
	void checkBalance() {
		System.out.println(name + " dorme");
	}
	
	void getStatus() {
		System.out.println(name + " dorme");
	}
	
	@Override
	public String toString() {										//metodo default della classe object, può essere sovrascritto inserendolo qui con annotazione @Override
		return "[ NAME: " + name + ", ACCOUNT#" + accountNumber + ", ROUTING#" + routingNumber + ", BALANCE: $" + balance + "]";
	}									// la variabile routingNumber è indicata come privata, tuttavia richiamandola qui (da dentro la classe) viene poi mostrata nella BankAccountApp con toString()
		
	
}
