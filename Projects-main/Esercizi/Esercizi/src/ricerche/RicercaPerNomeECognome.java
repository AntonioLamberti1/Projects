package ricerche;

import java.util.Scanner;


public class RicercaPerNomeECognome {
	@SuppressWarnings("resource")
	public static void main (String[] args) {
		String[] vettore = {"pippo;baudo", "ciro;mare", "ro;ta"};
		System.out.print("Inserire il nome e cognome da cercare: (nome;cognome) ");
		Scanner primoValore = new Scanner(System.in);
		String nomeECognomeDaCercare = primoValore.nextLine();
		boolean trovato = false;
		for (int x=0; x < vettore.length; x++) {
			if (vettore[x].equals(nomeECognomeDaCercare)) {
				System.out.println("Il nome e cognome "+nomeECognomeDaCercare+" è presente nel vettore");
				trovato = true;
				break;
			}
		}
		if (!trovato) {
			System.out.println("Il nome e cognome "+nomeECognomeDaCercare+" non è presente nel vettore");
		}
	}
}
