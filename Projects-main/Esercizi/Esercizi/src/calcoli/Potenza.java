package calcoli;

import java.util.Scanner;

public class Potenza {
	public static void main (String[] args) {
		System.out.print("Inserire il  valore: ");
		Scanner primoValore = new Scanner(System.in);
		int valore = primoValore.nextInt();
		System.out.print("Inserire quante volte moltiplicarlo per se stesso: ");
		Scanner secondoValore = new Scanner(System.in);
		int potenza = secondoValore.nextInt();
		long risultato = 1;
		for (int x = 0; x < potenza; x++) {
			risultato = risultato * valore; 
		}
		System.out.print(risultato);
	}
}
