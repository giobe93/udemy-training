package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874", 1000.50);
		BankAccount acc2 = new BankAccount("957255972", 2000.35);
		BankAccount acc3 = new BankAccount("982312123", 2500.99);
		
		acc1.setName("Gio");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest {
	
	//properties
	private static int iD = 1000 ;								// Internal ID , statico cioè fisso per la classe, però può cambiare (vedi sotto)
	private String accountNumber;								// iD + random 2-digit number + first 2 SSN
	private static final String routingNumber = "005400657";	// statico cioè fisso per la classe, e costante (final)
	private String name;
	private String SSN;
	private double balance;
	
	
	// constructors
	public BankAccount(String SSN, double initDeposit) {
		//System.out.println("New Account Created");
		balance = initDeposit;
		this.SSN = SSN;								// la variabile privata globale SSN è uguale alla variabile locale SSN definita come argomento di BankAccount(String SSN)
		iD++;										// iD incrementa di 1 per ogni nuovo oggetto (account)
		//System.out.println(iD);
		setAccountNumber();
		
	}	
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);				// la funzione Math.random genera un valore tra 0 e 1, per generare due digit allora moltiplico per 100
		//System.out.println(random);
		//System.out.println(SSN.substring(0, 2));
		accountNumber = iD + "" + random + SSN.substring(0, 2);		// SSN.substring(0,2) prende i primi due caratteri di SSN
		System.out.println("Your account number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}
	
	public void accrueInterest() {
		
	}

	@Override							// metodo preso da interfaccia IInterest
	public void accrue() {
		balance = balance * (1 + rate/100);		// rate viene preso da IInterest
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + "]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
	
}