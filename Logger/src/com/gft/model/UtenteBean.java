package com.gft.model;

public class UtenteBean {
	int eta;
 
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	public static void main(String[] args) {
	 String nome="Progetto";
	  String cognome="GFT";
	  
	  System.out.println(nome + cognome);
	  
	  
	  }
	public UtenteBean(int eta) {
		this.eta=eta;
	}
	 
}
