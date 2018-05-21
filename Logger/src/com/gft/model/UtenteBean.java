package com.gft.model;

public class UtenteBean {
	 String nome ;
	  String cognome;

	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected String getCognome() {
		return cognome;
	}
	protected void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public static void main(String[] args) {
		 
		UtenteBean utente = new UtenteBean();
		utente.setNome("Progetto");
		utente.setCognome("GFT");
		  System.out.println(utente.getNome()+ utente.getCognome());
		  
		  
		   
	}
	 
}
