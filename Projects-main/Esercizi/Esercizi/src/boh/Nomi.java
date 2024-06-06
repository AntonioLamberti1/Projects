package boh;

import java.util.ArrayList;
import java.util.Scanner;

public class Nomi {
	public static void main(String[] args){
		String[] parola = {"a", "n", "n", "a"};
		palindroma(parola);	
	}
	
	public static boolean palindroma(String[] parola){
		int indice = 0;
		for (int x = parola.length-1; x >= parola.length/2; x--){
			if (!(parola[x].equals(parola[indice]))){
				return false;
			}
			indice+=1;
		}
		return true;
	}
}
