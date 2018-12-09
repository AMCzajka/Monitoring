package com.monitoring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zanieczyszczenia {

	@Id
	Integer idZanieczyszczenia;
	
	
	String nazwa;
	
	String dopuszczalnaWartosc;
	
	String jednostka;
	
	String czasRozpadu;

	public Integer getIdZanieczyszczenia() {
		return idZanieczyszczenia;
	}

	public void setIdZanieczyszczenia(Integer idZanieczyszczenia) {
		this.idZanieczyszczenia = idZanieczyszczenia;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getDopuszczalnaWartosc() {
		return dopuszczalnaWartosc;
	}

	public void setDopuszczalnaWartosc(String dopuszczalnaWartosc) {
		this.dopuszczalnaWartosc = dopuszczalnaWartosc;
	}

	public String getJednostka() {
		return jednostka;
	}

	public void setJednostka(String jednostka) {
		this.jednostka = jednostka;
	}

	public String getCzasRozpadu() {
		return czasRozpadu;
	}

	public void setCzasRozpadu(String czasRozpadu) {
		this.czasRozpadu = czasRozpadu;
	}
}
