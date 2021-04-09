package objectOrientedProgramming;

public class LoanAccount implements IRate {					// scrivendo "implements IRate" compare un errore perché i relativi metodi non sono ancora implementati in questa classe
															// dall'errore è possibile generare in automatico i metodi mancanti
	@Override
	public void setRate() {
		System.out.println("Rate");		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase rate");
	}
	
	public void setTerm(int terms) {
		System.out.println("Setting the term to: " + terms + " years.");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Ammortization schedule");
	}

}
