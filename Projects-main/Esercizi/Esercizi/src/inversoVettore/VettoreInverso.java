package inversoVettore;

public class VettoreInverso {
	public static void main (String[] args) {
		int[] vettore = {1, 2, 3, 4, 5};
		int[] vettoreInverso = new int[vettore.length];
		int indice = 0;
		int x = 0;
		for (x = vettoreInverso.length-1; x >= 0; x--) {
			vettoreInverso[indice] = vettore[x];
			indice = indice + 1;
		}
		for (x = 0; x < vettoreInverso.length-1; x++) {
			System.out.print(vettoreInverso[x]+", ");
		}
		System.out.println(vettoreInverso[x]);
	}
}