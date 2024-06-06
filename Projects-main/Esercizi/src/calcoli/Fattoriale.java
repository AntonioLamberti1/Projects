package calcoli;

import java.util.Scanner;

public class Fattoriale {
	@SuppressWarnings("resource")
	public static void main (String[] args) {
		int base, tot = 1;;
		System.out.print("Inserire il numero da fattorizzare: ");
		Scanner input = new Scanner(System.in);
		base = input.nextInt();
		for (int x = base; x > 0  ;x-- ) {
			tot = tot * x;
		}
		System.out.print(tot);
	}
}
