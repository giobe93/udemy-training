package basics;

public class SalaryCalculator {

	public static void main (String[] args) {
		// creare variabile per definire la carriera
		
		// Declare the variable
		String career;
		System.out.println("Program is starting");
		
		// Define the variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $ " + rate +" per hour is $ " + salary + " per year");
		
		// calcolare salario annuale
		// rate * hoursPerWeek * weeksPerYear
		
	}
	
}
