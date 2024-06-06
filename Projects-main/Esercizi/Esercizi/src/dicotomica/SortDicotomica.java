package dicotomica;

public class SortDicotomica {
	public static void main (String[] args) {
		int[] vettore = {1, 4, 6, 10, 14, 18, 20};
		int meta = vettore.length / 2;
		int valore = 12;
		while (meta < vettore.length || meta < 0) {
			if (vettore[meta] < valore) {
				meta = meta + (meta/2);
			}
			else if (vettore[meta] > valore){
				meta = meta - (meta/2); /* Non riesce a diminuire 1 in 0 */
				if (meta == 1 && vettore[meta] != valore) {
					meta = meta - 1;
				}
				else if (meta == 0) {
					System.out.println("Il valore "+valore+" non si trova all'interno del vettore");
					break;
				}
			}
			else if (vettore[meta] == valore) {
				System.out.println("Il valore "+valore+" si trova all'interno del vettore");
				break;
			}
			else {
				System.out.println("Il valore "+valore+" non si trova all'interno del vettore");
				break;
			}
		}
	}
}

