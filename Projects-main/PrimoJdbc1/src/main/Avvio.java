package main;

import java.sql.Date;
import java.util.Scanner;

import dao.DaoService;
import model.Utente;

public class Avvio {

	public static void main(String[] args) {
		int scelta = 0;
		while (scelta != 6) {
			DaoService dao = new DaoService();
			System.out.print("-----    Menu    -----\n"
					+"1) Inserimento\n"
					+"2) Modifica\n"
					+"3) Cancella\n"
					+"4) Trova\n"
					+"5) Visualizza\n"
					+"6) Esci\n"
					+"Inserisci un numero da 1 a 6: ");
			/*System.out.print("1) Inserimento\n");
			System.out.print("2) Modifica\n");
			System.out.print("3) Cancella\n");
			System.out.print("4) Trova\n");
			System.out.print("5) Visualizza\n");
			System.out.print("6) Esci\n");
			System.out.println("Inserisci un numero da 1 a 6: ");*/
			Scanner numero = new Scanner(System.in);
			scelta = numero.nextInt();
			switch (scelta) {
			case 1:
				System.out.println("-----  Inserimento  -----");
				System.out.println("Inserisci nome: ");
				Scanner nomeInserito = new Scanner(System.in);
				String nome = nomeInserito.nextLine();
				System.out.println("Inserisci cognome: ");
				Scanner cognomeInserito = new Scanner(System.in);
				String cognome = cognomeInserito.nextLine();
				System.out.println("Inserisci cf: ");
				Scanner cfInserito = new Scanner(System.in);
				String cf = cfInserito.nextLine();
				System.out.println("Inserisci data di Nascita (1999-03-23): ");
				Scanner dataInserita = new Scanner(System.in);
				String data = dataInserita.nextLine();
				System.out.println("Inserisci stipendio: ");
				Scanner stipendioInserito = new Scanner(System.in);
				int stipendio = stipendioInserito.nextInt();
				Utente u = new Utente(nome, cognome, cf, Date.valueOf(data), stipendio);
				dao.insert(u);
				System.out.println(u);
				System.out.println("Inserimento eseguito con successo\n");
				break;
			case 2:
				System.out.println("-----  Modifica  -----");
				System.out.println("Inserire l'id da modificare: ");
				Scanner numero2 = new Scanner(System.in);
				int id1 = numero2.nextInt();
				Utente u1 = new Utente("Gino","Bianchi","RosBian",Date.valueOf("1999-03-23"),2000.12,id1);
				System.out.println(dao.read(id1));
				System.out.println("Vuoi modificare? (si/no)? ");
				Scanner ris1 = new Scanner(System.in);
				String risposta1 = ris1.nextLine();
				if (risposta1.equals("si")) {
				dao.update(u1);
				System.out.println("Modifica eseguita con successo\n");
				}
				else {
					System.out.println("Modifica annullata\n");
				}
				break;
			case 3:
				System.out.println("-----  Cancella  -----");
				System.out.println("Inserire l'id da cancellare: ");
				Scanner numero1 = new Scanner(System.in);
				int idDaCancellare = numero1.nextInt();
				System.out.println(dao.read(idDaCancellare));
				System.out.println("Vuoi cancellare? (si/no): ");
				Scanner ris3 = new Scanner(System.in);
				String risposta = ris3.nextLine();
				if (risposta.equals("si")) {
					dao.delete(idDaCancellare);
					System.out.println("Cancellazione eseguita con successo\n");
				}
				else {
					System.out.println("Cancellazione annullata\n");
				}
				break;
			case 4:
				System.out.println("-----  Trova  -----");
				System.out.println("Inserire l'id da trovare: ");
				Scanner numero3 = new Scanner(System.in);
				int idDaCercare = numero3.nextInt();
				System.out.println(dao.read(idDaCercare)+"\n");
				break;
			case 5:
				System.out.println("-----  Visualizzazione  -----");
				System.out.println(dao.read());
				break;
			case 6:
				System.out.println("Fine programma \n");
				break;
	//		Utente u = new Utente("Rossi","Bianchi","RosBian",Date.valueOf("1999-03-23"),2000.12,2);
	//		dao.update(u);
	//		dao.update(u);
			}
		}
	}

}
