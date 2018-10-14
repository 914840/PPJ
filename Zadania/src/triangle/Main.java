package triangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.print("Wprowadz dowolną liczbę naturalną:");
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt() + 1;
		scanner.close();
		
		// tablica tablic tab[] = {tab[],tab[] tab[]...} - deklaracja
		int[][] tab2D = new int[n][];
				
				// Inicjalizacja
				for(int i=0; i<tab2D.length; i++) {
					tab2D[i] = new int[i+1];
					for(int j=0; j<tab2D[i].length; j++) {
						tab2D[i][j] = j;
					}
				}
				
				// Wyświetlanie wartości tabeli 
				for(int[] row : tab2D) {
					for(int x : row) {
						if(x == row.length-1) {
							System.out.print(x + " ");
						}
						else {
							System.out.print(x + ", ");
						}
					}
					System.out.println();
				}
		}
		
		
		/************** Metoda 2 ***************
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
		**/
	
}
