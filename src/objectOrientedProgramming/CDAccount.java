package objectOrientedProgramming;
																//ogni nuova classe in automatico ESTENDE la classe Object
public class CDAccount extends BankAccount  implements IRate {	// con "extends" si indica che la nuova classe CDAccount EREDITA le propriet� della BankAccount e ne � al di sotto (NON viceversa!)	

		String interestRate;
																// le CLASSI possono avere pi� INTERFACCE ma SOLO UNA ESTENSIONE
		void compount() {
			System.out.println("Compounding interest");
		}
}
