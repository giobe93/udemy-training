package basics;

public class Days {
	
	public static void main (String[] args) {
		// Esecuzione di diversi blocchi di codice in base ad una condizione
		
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
			case "Monday" : 
				System.out.println("Oggi � luned�");
			break;
			case "Tuesday" : 
				System.out.println("Oggi � marted�");
			break;
			case "Wednesday" : 
				System.out.println("Oggi � mercoled�");
			break;
			case "Thursday" : 
				System.out.println("Oggi � gioved�");
			break;
			case "Friday" : 
				System.out.println("Oggi � venerd�");
			break;
		}
		
		
		// se una condizione � vera (marted�), il resto del blocco viene eseguito! per evitarlo, metto BREAK
		
		
	}

}
