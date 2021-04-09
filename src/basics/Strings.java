package basics;

public class Strings {

	public static void main(String[] args) {
		
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains("Ring")) {										// .contains controlla il contenuto
			System.out.println("Il libro contiene la parola " + wordChoice);
		}
		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {					// .equalsIgnoreCase verifica uguaglianza ignorando maiuscole/minuscole
			System.out.println("Il browser è chrome");
		}
		
		String firstName = "Gio";
		String lastName = "Berto";
		String SSN = "12345678";
		
		
		System.out.println("Ci sono " + SSN.length() + " numeri nel codice SSN" );		// .lenght conta caratteri
		
		// Print iniziali più ultime 4 cifre del SSN
		System.out.print(firstName.substring(0, 1));	// estrae la sotto-string G. Con System.out.print (senza ln finale) mantiene tutto su stessa riga
		System.out.print(lastName.substring(0, 1));	
		System.out.print(SSN.substring(4, 8));	
				
		System.out.println("\n" + firstName.substring(0, 1) + lastName.substring(0, 1) + SSN.substring(4, 8));	// alternativa alle righe separate sopra
		
		

	}

}
