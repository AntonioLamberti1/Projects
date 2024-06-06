package eserciziBubbleSort;

public class BubbleSortCrescente {
	public static void main(String[] args) {
		int[] vettore = {10, 5, 8, 2};
		for (int x = vettore.length; x > 0; x--) {
			for (int y = 0; y < vettore.length-1; y++) {
				if (vettore[y] > vettore[y+1]) {
					int temp = vettore[y];
					vettore[y] = vettore[y+1];
					vettore[y+1] = temp;
				}
			}
		}
		int indice = 0;
		for (indice = 0; indice < vettore.length-1; indice++) {
			System.out.print(vettore[indice]+", ");
		}
		System.out.print(vettore[indice]+"\n");
		
		for(int x = vettore.length; x > 0; x--) {
			for (int y = 0; y < vettore.length-1; y++) {
				if (vettore[y] < vettore[y+1]) {
					int temp = vettore[y];
					vettore[y] = vettore[y+1];
					vettore[y+1] = temp;
				}
			}
		}
		for (indice = 0; indice < vettore.length-1; indice++) {
			System.out.print(vettore[indice]+", ");
		}
		System.out.print(vettore[indice]);
	}
	
}
