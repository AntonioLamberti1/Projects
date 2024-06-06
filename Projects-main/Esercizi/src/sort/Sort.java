package sort;

public class Sort {
	public static void main (String[] args) {
		//Sort Crescente
		int[] vettore = {3, 5, 10, 6};
		for (int x = 0; x < vettore.length-1; x++) {
			int minVettore = x;
			for (int y = x + 1; y < vettore.length; y++) {
				if (vettore[y] < vettore[minVettore]) {
					minVettore = y;
				}
			}
			int temp = vettore[x];
			vettore[x] = vettore[minVettore];
			vettore[minVettore] = temp;
		}
		int indice = 0;
		for (indice = 0; indice < vettore.length-1; indice++) {
			System.out.print(vettore[indice]+", ");
		}
		System.out.println(vettore[indice]);
		
		
		//Sort Decrescente
		for (int x = 0; x < vettore.length-1; x++) {
			int maxVettore = x;
			for (int y = x+1; y < vettore.length; y++) {
				if (vettore[y] > vettore[maxVettore]) {
					maxVettore = y;
				}
			}
			int temp = vettore[x];
			vettore[x] = vettore[maxVettore];
			vettore[maxVettore] = temp;
		}
		for (indice = 0; indice < vettore.length-1; indice++) {
			System.out.print(vettore[indice]+", ");
		}
		System.out.println(vettore[indice]);
	}
	
	
}
