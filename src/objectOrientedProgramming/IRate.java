package objectOrientedProgramming;
											
	// INTERFACCIA: simile al concetto di ereditarietà, ma più simile ad un "contratto"
		// permettono di creare lo SCHEMA di ciò che è necessario
		// l'implementazione viene lasciata allo user (nella classe)
		// è possibile avere più classi che implementano l'interfaccia
		// è utile perché aiuta a strutturare il programma: chi implementa questa interfaccia, ha sempre gli stessi metodi a disposizione (riutilizzabile!)

public interface IRate {
	
	public void setRate();
	public void increaseRate();
	
}

		
