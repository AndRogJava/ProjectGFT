package com.gft.model;

public class UtenteBean {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	
	public UtenteBean() {
		
	}
	
	public void setIndirizzo(String indirizzo) {
    	this.indirizzo = indirizzo;
    }
	
	public String getIndirizzo() {
    	return indirizzo;
    }

	int eta;

 
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}

	 
	  String email;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	  String ind;
	  
	  UtenteBean b = new UtenteBean();
	  b.setIndirizzo("ciao"); 

	  

	  System.out.println(nome + " " + cognome + " " + b.getIndirizzo());
	  
	  }
	public UtenteBean(int eta) {
		this.eta=eta;

		 
		UtenteBean utente = new UtenteBean(eta);
		utente.setNome("Progetto");
		utente.setCognome("GFT");
		  System.out.println(utente.getNome()+ utente.getCognome());
		  
		  
		   

	}
	@Override
	public String toString() {
		return "UtenteBean [eta=" + eta + ", nome=" + nome + ", cognome=" + cognome + "]";

	}
}

