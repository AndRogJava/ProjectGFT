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
 
	public static void main(String[] args) {
	  String nome="Progetto";
	  String cognome="GFT";
	  String ind;
	  
	  UtenteBean b = new UtenteBean();
	  b.setIndirizzo("via"); 
	  
	  System.out.println(nome + " " + cognome + " " + b.getIndirizzo() + " ");

	}
}

