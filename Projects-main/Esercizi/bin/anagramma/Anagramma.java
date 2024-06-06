package anagramma;
import java.util.Arrays;

public class Anagramma {
	public static void main (String[] args) {
		String parola = "marea";
		String[] vettore1 = parola.split("");
		String parola2 = "amare";
		String[] vettore2 = parola2.split("");
		int trovaLettera = 0;
		/*Arrays.sort(vettore1);
		Arrays.sort(vettore2);
		System.out.println(vettore1[1]+vettore2[1]);
		if (vettore1.length == vettore2.length) {
			for (int x = 0; x < vettore1.length; x++) {
				if (!vettore1[x].equals(vettore2[x])) {
					System.out.println("La parola "+parola+" non è anagramma della parola "+parola2);
					trovaLettera --;
					break;
				}
				else{
					trovaLettera ++;
				}
			}
		}
		else {
			System.out.println("La parola "+parola+" non è anagramma alla parola "+parola2);
		}
		if (trovaLettera == vettore1.length) {
			System.out.println("La parola "+parola+" è anagramma alla parola "+parola2);	
		}*/
		
		for (int x = vettore1.length; x > 0; x--) {
			for (int y = 0; y < vettore1.length-1; y++) {
				if (vettore1[y].compareTo(vettore1[y+1]) > 0) {
					String temp = vettore1[y+1];
					vettore1[y+1] = vettore1[y];
					vettore1[y] = temp;
				}
			}
		}
		
		for (int x = vettore2.length; x > 0; x--) {
			for (int y = 0; y < vettore2.length-1; y++) {
				if (vettore2[y].compareTo(vettore2[y+1]) > 0) {
					String temp = vettore2[y+1];
					vettore2[y+1] = vettore2[y];
					vettore2[y] = temp;
				}
			}
		}
		if (vettore1.length == vettore2.length) {
			for (int x = 0; x < vettore1.length; x++) {
				if (!vettore1[x].equals(vettore2[x])) {
					System.out.println("La parola "+parola+" non è anagramma alla parola "+parola2);
					trovaLettera --;
					break;
				}
				else{
					trovaLettera ++;
				}
			}
		}
		else {
			System.out.println("La parola "+parola+" non è anagramma alla parola "+parola2);
		}
		if(trovaLettera == vettore1.length) {
		System.out.println("La parola "+parola+" è anagramma alla parola "+parola2);
		}
	}
}
