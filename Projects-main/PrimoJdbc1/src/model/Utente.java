package model;

import java.sql.Date;

public class Utente {

	private int id;
	private String nome;
	private String cognome;
	private String cf;
	private Date dataNascita;
	private double stipendio;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public double getStipendio() {
		return stipendio;
	}
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public Utente() {}

	public Utente(String nome, String cognome, String cf, Date dataNascita, double stipendio, int id) {
		this.nome=nome;
		this.cognome=cognome;
		this.cf=cf;
		this.dataNascita=dataNascita;
		this.stipendio=stipendio;
		this.id = id; 
	}
	
	public Utente(String nome, String cognome, String cf, Date dataNascita, double stipendio) {
		this.nome=nome;
		this.cognome=cognome;
		this.cf=cf;
		this.dataNascita=dataNascita;
		this.stipendio=stipendio;
	}
	
	@Override
	public String toString() {
		return id+";"+nome+";"+cognome+";"+cf+";"+dataNascita+";"+stipendio+"\n";
	}


}
