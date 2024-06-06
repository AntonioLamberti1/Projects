package conversioneDaBinario;

public class BinarioAHexadecimale {
	public static void main (String[] args) {
		String binario = "11111011";
		String[] aBin = binario.split("");
		int indice = 1;
		int[] risultato = new int[aBin.length];
		String[] risultatoF = new String[aBin.length/4];
		int g = 0;
		for (int i = aBin.length-1; i >= 0; i-= 4) {	
			risultato[i] = risultato[i] + (Integer.parseInt(aBin[i]) * indice);
			indice = indice * 2;
			risultato[i-1] = risultato[i-1] + (Integer.parseInt(aBin[i-1]) * indice);
			indice = indice * 2;
			risultato[i-2] = risultato[i-2] + (Integer.parseInt(aBin[i-2]) * indice);
			indice = indice * 2;
			risultato[i-3] = risultato[i-3] + (Integer.parseInt(aBin[i-3]) * indice);
			indice = 1;
		}
		for (int i = aBin.length-1; i >= 0; i-= 4) {
			risultato[i] = risultato[i] + risultato[i-1] + risultato[i-2]+ risultato[i-3];
			risultatoF[g] = String.valueOf(risultato[i]);
			if (risultato[i] == 10) {
				risultatoF[g] = "A";
			}
			else if (risultato[i] == 11) {
				risultatoF[g] = "B";
			}
			else if (risultato[i] == 12) {
				risultatoF[g] = "C";
			}
			else if (risultato[i] == 13) {
				risultatoF[g] = "D";
			}
			else if (risultato[i] == 14) {
				risultatoF[g] = "E";
			}
			else if (risultato[i] == 15) {
				risultatoF[g] = "F";
			}
			g++;
		}
		for (int i = risultatoF.length-1; i >= 0; i--) {
			System.out.print(risultatoF[i]);
		}
	}
}
