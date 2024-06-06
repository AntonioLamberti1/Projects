package breakpoint;

public class Breakpoint {
	public static void main (String[] args) {
		int[] vettore = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int breakpoint = 4;
		int inizio = breakpoint;
		int fine = vettore.length-1;
		int breakpoint1 = fine - inizio;
		int x = 0;
		for (x = breakpoint1; x < vettore.length-1; x++) {
			System.out.print(vettore[x]+", ");
		}
		System.out.print(vettore[x]);
	}
}