package basics;

public class Cities {

	public static void main(String[] args) {								
		// declare and define an array, è un contenitore di elementi
		String[] cities = { "New York", "San Francisco", "Miami", "Dallas"};		// IMPLICITO
		// parentesi quadre per array []. Definizione implicita della dimensione
		//per accedere alla variabile e ai suoi valori, usare indice tra parentesi quadre. Un array inizia sempre con 0, primo elemento.
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		System.out.println("STOOOOOOOOOOOOOOOOOOOOOOOOP");		
		
		// declare array
		String[] countries;
		
		// define array
		countries = new String[2];
		countries [0] = "USA";						
		countries [1] = "Canada";
		System.out.println(countries[0]);
		System.out.println(countries[1]);
	
		System.out.println("STOOOOOOOOOOOOOOOOOOOOOOOOP");


		//declare and define the array (only size)
		String[] states = new String [5];											// ESPLICITO
		// qui la dimensione viene definita in modo esplicito, poi vengono definiti i vari elementi ed infine il print
		states [0] = "California";						
		states [1] = "Ohio";
		states [2] = "New Jersey";
		states [3] = "Texas";
		states [4] = "Utah";
		/*
		System.out.println(states[0]);
		System.out.println(states[1]);
		System.out.println(states[2]);
		System.out.println(states[3]);
		System.out.println(states[4]);
		*/
		// per fare l'operazione delle righe sopra in una sola volta, definire variabile ed inserirla in un loop, aggiungendo 1 ogni volta
		int i = 0;						
		
		do {											// il DO loop crea il loop e DOPO testa le condizioni
			System.out.println(states[i]);
			i = i + 1;
		} while (i < 5);				// esegue loop finché i arriva a 4
		
		System.out.println("************************");
		
		// il WHILE loop prima testa le condizioni, POI crea il loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {			// loop finché variabile è diversa da falso, cioè quando è vera
			String state = states[n];
			System.out.println(state);		// prima fa print di tutti gli stati (variabile state = variabile states, che è un array
			if (state == "Texas") {			// poi, se trova Texas come valore della variabile state, dice STATO TROVATO!
				System.out.println("STATO TROVATO!");
				stateFound = true;
			}
			n++;			// è la stessa cosa di n = n + 1
		
		}
		System.out.println("************************");	
			
		/*
		while (n <= 4) {					// n minore o uguale 4 è come i minore di 5
			System.out.println(states[n]);
		}
		*/
		
		System.out.println("\nPrinting con FOR loop:");	
		// FOR loop : struttura migliore, unisce tutte le caratteristiche degli altri loop in una riga
		//for (def. variabile; condizione; iterazione)
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}
}