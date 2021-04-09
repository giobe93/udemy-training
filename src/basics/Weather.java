package basics;

public class Weather {
	
	public static void main (String[] args) {
		
		// Programma che da suggerimenti su come vestirsi sulla base del clima (temperatura e sole)
		
		int temperature = 65;
		String sunCondition = "Overcast";
		
		if (temperature > 80) {
			System.out.println("Si sta bene. Metti pantaloni corti e maglietta a mezze maniche");
		}
		else if ((temperature > 60) && (sunCondition == "Sunny")) {								//si devono verificare entrambe
			System.out.println("Fa un po' freddo. Meglio maglietta maniche lunghe e jeans");
			System.out.println("Metti cappello per il sole");
		}
		else if ((temperature > 60) || (sunCondition == "Overcast")) {							// la condizione || è OR 
			System.out.println("Fa freddo. Mettere vestiti caldi");
		}
		else {
			System.out.println("Giornata fredda. Porta maglione.");
		}
		
		System.out.println("Il programma si chiude");
	}

}
