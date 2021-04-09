package objectOrientedProgramming;

public class BankAccountApp {

	public static void main(String[] args) {
		// Crea un nuovo bank account (istanziare un oggetto)
		
		BankAccount acc1 = new BankAccount();							// legato al constructor BankAccount()
		acc1.accountNumber = "7465";									// indicando nome oggetto + . vengono mostrate le proprietà (in blu) disponibili per quell'oggetto. 
		//acc1.name = "Roger Hue";										// In verde i metodi. Sulla dx c'è la classe di appartenenza. 
		acc1.balance = 10000;											//La dicitura "Object" (es toString()) testimonia che alcuni attributi vengono EREDITATI dalla classe Object
		
		System.out.println(acc1.toString());							// esempio di POLIMORFISMO attraverso l'overriding 														
		
		// INCAPSULAZIONE: public API methods
		// (dopo aver reso la variabile name privata in BankAccount attraverso un metodo)
		// utente passa parametro al metodo setName, senza sapere cosa fa il metodo. Con altro metodo getName può ottenere ciò che ha creato
		acc1.setName("Roger Hue");
		System.out.println(acc1.getName());
		acc1.setSSN("847345292347");
		System.out.println("SSN: " + acc1.getSSN());
		// così facendo, le variabili vengono nascoste nella classe e vi si può accedere pubblicamente solo attraverso i metodi 
		
		
		// richiamare metodi implementati via interface:
		acc1.setRate();
		acc1.increaseRate();
		
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		System.out.println("\n");
		
		
		// esempio di POLIMORFISMO attraverso l'overloading nel constructor:
		
		BankAccount acc2 = new BankAccount("Checking Account");			// legato al constructor BankAccount(String accountType)
		acc2.accountNumber = "8370";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);	// legato al constructor BankAccount(String accountType, double initDeposit)
		acc3.accountNumber = "5534";
		
		
		
		System.out.println("\n");
		
		/*
		
		System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		System.out.println(acc3.routingNumber);
		
		// Demo per EREDITARIETA'
		CDAccount cd1 = new CDAccount();							
		cd1.balance = 3000;												// con cd1 + . vedo le proprietà della classe CDAccount + BankAccount + Object
		cd1.name = "Juan"; 												// vengono ereditati anche i Constructor (solo di default, non quelli con overloading)
		cd1.accountType = "CD Account";
		cd1.interestRate = "4.5";
		System.out.println(cd1.toString());
		cd1.compount();
		
		*/
		
		
		
		
		
	}

}
