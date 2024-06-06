package ottenereEstratto;

import java.util.Scanner;

public class OttenereEstratto {
	public static void main(String[] args) {
		int[] vettore = {1, 2, 3, 4, 5};
		System.out.print("Inserire il valore iniziale: ");
		Scanner primoValore = new Scanner(System.in);
		int inizio = primoValore.nextInt();
		System.out.print("Inserire il valore finale: ");
		Scanner secondoValore = new Scanner(System.in);
		int fine = secondoValore.nextInt();
		int x = 0;
		if (inizio < fine) {
			for (x = inizio; inizio < fine; inizio++) {
				System.out.print(vettore[inizio]+", ");
			}
			System.out.println(vettore[inizio]);
		}
		else if (inizio > fine) {
			System.out.print("Errore: Inizio è più grande di Fine");
		}
	}
}
