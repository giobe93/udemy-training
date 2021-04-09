package objectOrientedProgramming;

public class AccountApp {

	public static void main(String[] args) {
		/*
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setAmmortSchedule();
		la.setTerm(20);
		*/
		
		// POLIMORFISMO perch� il metodo chiamato cambia in base a dove si punta 					(classe LoanAccount() in questo caso)
		IRate account1 = new LoanAccount();											// crea l'account1 basato sulle propriet� definite nell'interfaccia IRate, puntando a LoanAccount()
		account1.setRate();															// con account1. vedo solo i metodi di IRate
																					// lanciando l'esecuzione di setRate, lo richiama per� dal LoanAccount() >> l'output "Rate" lo conferma
						
		
		
	}

}
