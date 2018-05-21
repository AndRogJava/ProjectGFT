package com.gft.model;

public class UtenteBean {

	int eta;
 
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}

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

	 String nome="Progetto";
	  String cognome="GFT";
	  
	  System.out.println(nome + cognome);
	  
	  
	  }
	public UtenteBean(int eta) {
		this.eta=eta;

		 
		UtenteBean utente = new UtenteBean(eta);
		utente.setNome("Progetto");
		utente.setCognome("GFT");
		  System.out.println(utente.getNome()+ utente.getCognome());
		  
		  
		   

	}
	 
}
