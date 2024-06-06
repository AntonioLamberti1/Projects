package palindromo;

public class ParolaPalindroma {
	public static void main(String[] args) {
		String[] vettore = {"a","n","t","n","a" };
		int indice = 0;
		boolean risposta = true;
		int meta = (vettore.length-1)/2;
		for (int x = vettore.length-1; x > meta; x--) {
			if (!vettore[x].equals(vettore[indice])) {
				System.out.println("La parola non � palindroma");
				risposta = false;
				break;
			}
			indice++;
		}
		if(risposta) {
		System.out.println("La parola � palindroma");
		}
	}
}