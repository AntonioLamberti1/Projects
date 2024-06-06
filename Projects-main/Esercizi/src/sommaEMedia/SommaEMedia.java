package sommaEMedia;

public class SommaEMedia {
	public static void main (String[] args) {
	int[] vettore = {1, 2, 3, 4, 5};
	int indice = 0;
	int somma = 0;
	for (int x = 0; x < vettore.length; x++) {
		indice = indice + 1;
		somma = somma + vettore[x];
		}
	float media = somma / indice;
	System.out.print("La somma è: "+somma+" mentre la media è: "+media);
	}
}