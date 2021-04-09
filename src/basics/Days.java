package basics;

public class Days {
	
	public static void main (String[] args) {
		// Esecuzione di diversi blocchi di codice in base ad una condizione
		
		String dayOfWeek = "Tuesday";
		
		switch (dayOfWeek) {
			case "Monday" : 
				System.out.println("Oggi è lunedì");
			break;
			case "Tuesday" : 
				System.out.println("Oggi è martedì");
			break;
			case "Wednesday" : 
				System.out.println("Oggi è mercoledì");
			break;
			case "Thursday" : 
				System.out.println("Oggi è giovedì");
			break;
			case "Friday" : 
				System.out.println("Oggi è venerdì");
			break;
		}
		
		
		// se una condizione è vera (martedì), il resto del blocco viene eseguito! per evitarlo, metto BREAK
		
		
	}

}
