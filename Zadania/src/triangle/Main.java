package triangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Wprowadz dowolną liczbę naturalną:");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt() + 1;
		scanner.close();
		int[] tab = new int[n];

		for (int i = 0; i < tab.length; i++) { // n -1
			tab[i] = i;
			System.out.println(tab[i]);

			if (i == tab.length - 1) { // n - 1
				break;
			}

			for (int j = 0; j <= i; j++) {
				System.out.print(tab[j]);
			}
		}
	}
}
