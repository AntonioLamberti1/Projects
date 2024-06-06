package ricerche;

import java.util.Scanner;

public class RicercaPerId {
	public static void main (String[] args) {
		int[] vettore = {1, 2, 3, 4, 5, 6};
		System.out.print("Inserire il valore da cercare: ");
		boolean trovato = false;
		Scanner primoValore = new Scanner(System.in);
		int valore = primoValore.nextInt();
		for (int x = 0; x < vettore.length; x++) {
			if (vettore[x] == valore) {
				System.out.print("Il valore "+valore+" è presente");
				trovato = true;
				break;
			}
		}
		if (!trovato) {
			System.out.print("Il valore "+valore+" è presente");
		}
	}
}
