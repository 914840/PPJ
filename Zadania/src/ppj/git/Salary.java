package ppj.git;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		System.out.println("***Program do obliczania pensji pracownika***");

		double payoff, hour;// wypłata, ilośc przepracownych godz.
		int hWage = 12;
		int hMax = 60;
		int hMin = 40;
		double bonus = 1.5; // bonus naliczany po 40 h pracy

		System.out.print("podaj ilość przepracowanych godzin: ");
		Scanner scanner = new Scanner(System.in);
		hour = scanner.nextDouble();
		scanner.close();

		// za mało godziny
		if (hour < hMin) {
			payoff = hWage * hour;
			System.out.println("Wynagrodzenie: " + payoff + " !!! ZA MAŁO GODZIN PRZEPRACOWAŁEŚ ");
		}

		// nadgodziny do 60h
		else if (hour > hMin && hour < hMax) {
			payoff = (hMin + ((hour - hMin) * bonus)) * hWage;
			System.out.println("Wynagrodzenie: " + payoff + " *** Extra kasa za nadgodziny ");
		}
		
		// nadgodziny ponad 60h 
		else if (hour > hMax) {
			payoff = (hMin + ((hMax - hMin) * bonus)) * hWage;
			System.out.println("Wynagrodzenie: " + payoff + " - przepracowałeś ponad 60h a to znaczy ze te godziny przejdą na kolejny miesiąc:  " + (hour-hMax));
		}
		
		else {
			payoff = hour * hWage;
			System.out.println("Wynagrodzenie: " + payoff);
		}
	}

}
