package dicotomica;

public class SortDicotomica1 {
	public static void main(String[] args) {
		int[] vettore = {1, 2, 4, 6, 8, 10};
		int left = 0;
		int right = vettore.length - 1;
		int valore = 8;
		boolean trovato = false;
		while (left <= right) {
			int mid = left + (right-left) / 2;
			if (vettore[mid] < valore) {
				left = mid + 1;
			}
			else if (vettore[mid] == valore) {
				System.out.println("Il valore "+valore+" si trova all'interno del vettore");
				trovato = true;
				break;
			}
			else {
				right = mid - 1;
			}
		}
		if (!trovato) {
		System.out.print("Il valore "+valore+" non si trova all'interno del vettore");
		}
	}
}
