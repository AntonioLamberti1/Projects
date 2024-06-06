package conversioneDaBinario;

public class BinarioADecimale {
	public static void main (String[] args) {
		String binario = "10011011";
		String[] aBin = binario.split("");
		int indice = 1;
		int risultato = 0;
		for (int i = aBin.length-1; i >= 0; i--) {	
			risultato = risultato + (Integer.parseInt(aBin[i]) * indice);
			indice = indice * 2;
		}
		System.out.println(risultato);
	}
}
