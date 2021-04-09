package objectOrientedProgramming;
											
	// INTERFACCIA: simile al concetto di ereditariet�, ma pi� simile ad un "contratto"
		// permettono di creare lo SCHEMA di ci� che � necessario
		// l'implementazione viene lasciata allo user (nella classe)
		// � possibile avere pi� classi che implementano l'interfaccia
		// � utile perch� aiuta a strutturare il programma: chi implementa questa interfaccia, ha sempre gli stessi metodi a disposizione (riutilizzabile!)

public interface IRate {
	
	public void setRate();
	public void increaseRate();
	
}

		
