package labs;

/*
Create a Student Database with the following attributes:
- New Student constructor that takes name and SSN in the arguments
- Automatically create an email ID based on the name
- Set a private static ID
- Generate a user ID that is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
- Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
- Use encapsulation to set variables (phone, city, state)
*/

public class StudentDatabase {

	public static void main(String[] args) {
		Student st1 = new Student("Jack", "9745846925");
		System.out.println(st1.toString());
		st1.showCourses();
		st1.enroll("Psico");
		st1.pay(1000, "Psico");
		st1.pay(1600, "Psico");
		st1.checkBalance();

	}

}


class Student {
	
	//properties
	private static int iD = 1000 ;								// Internal ID , statico cioè fisso per la classe, però può cambiare (vedi sotto)
	private String name;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private String userID;							// mettendo userID e emailID come variabili private che poi vengono generate da metodi privati chiamati automaticamente dal constructor,
	private String emailID;							// cioè setUserID e setEmailID, esse sono poi richiamabili anche dal metodo toString	
	String [] corsi = {"Psico", "Medicina", "Economia", "Ingegneria", "Comunicazione"};
	private static final double tax = 1500;			// tassa iscrizione
	private double balance;
	
	
	// constructors
	public Student(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		setUserID();
		setEmailID();
	}
	
	// metodi: 
	private void setUserID() {
		int random = getRandom(1000,9000);		
		//System.out.println(random);
		//System.out.println(SSN.substring(6, 10));
		iD++;															// userID = iD + numero random 4 cifre tra 1000 e 9000 + ultime 4 del SSN
		userID = iD + "" + random + SSN.substring(6, 10);		// + "" + serve per evitare che iD venga sommato al random essendo entrambi di tipo int
		System.out.println(userID);
	}
	
	private int getRandom(int min, int max) {								// funzione Math.random limitata a un range di numeri
		int random = (int) ((Math.random() * (max - min)) + min);
		return random;
	}
	
	private void setEmailID() {
		emailID = name.toLowerCase() + iD + "@student.mail.com";			// .toLowerCase mette minuscolo
		System.out.println(emailID);
	}
	
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void enroll(String corsi) {
		System.out.println("Per iscrizione a " + corsi + " pagare: $ " + tax);
	}
	
	public void showCourses() {
		for (int i = 0; i < 4; i++) {
			System.out.println(corsi[i]);
		}
	}
	
	public void pay(double payment, String corsi) {
		if (payment >= 1500) {
			System.out.println("Effettuato pagamento: $ " + payment + " per iscrizione al corso: " + corsi);
			System.out.println("Complimenti, ti sei iscritto al corso: " + corsi);
			balance = (payment - tax);
			System.out.println("Credito: $" + balance);
		}
		else {
			System.out.println("Pagamento di $ " + payment + " errato. Immettere cifra corretta: $ " + tax);
		}
	}
	
	public void checkBalance() {
		System.out.println("Credito: $" + balance);
	}

	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[ID utente: " + userID + "]\n" + "[Email: " + emailID + "]";
	}
	
}
