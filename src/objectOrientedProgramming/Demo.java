package objectOrientedProgramming;

class Person {				// creata successivamente, da usare come template per creare persone sotto
	
	String name;
	String email;
	String phone;
	
	void walk () {
		System.out.println(name + " cammina");
	}
	
	void eat () {
		System.out.println(name + " mangia");
	}
	
	void sleep() {
		System.out.println(name + " dorme");
	}
	
}


public class Demo {

	public static void main(String[] args) {
		// Istanziare un oggetto : creare variabile (person1) che punta ad una classe (Person()), definita sopra. 
		Person person1 = new Person();		//Utilizzando NEW, Java alloca spazio per la variabile.
		
		// Definire proprietà
		person1.name = "Gio";
		person1.email = "giorgia@mail.com";
		person1.phone =  "123456789";
		
		// Astrazione : estrarre solo le informazioni necessarie dall'oggetto
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Tim";
		person2.sleep();
		
		/*
		// persona
		
		
		// attributi, variabili, aggettivi, descrittori
		String name = "Gio";
		String email = "giorgia@mail.com";
		String phone = "123456789";
		
		// azioni, attività, comportamenti
		//System.out.println(name + " cammina");
		walking(name);
		System.out.println(name + " mangia");
		
		// e per un'altra persona?
		
		// attributi, variabili, aggettivi, descrittori
		String name2 = "Tim";
		String email2 = "tim@mail.com";
		String phone2 = "8753479834";
		
		// azioni, attività, comportamenti
		//System.out.println(name2 + " cammina");
		walking(name2);
		System.out.println(name2 + " mangia");
		
		// come collegare attributi e proprietà insieme? creo la classe PERSON
		
	}
	
	// aggiungendo funzioni si riduce la quantità di codice
	
	static void walking(String name) {
		System.out.println(name + " cammina");
		
			*/
	}

}


