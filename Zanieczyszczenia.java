package com.rafbur.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Zanieczyszczenia {

	@Id
	Integer idZanieczyszczenia;
	
	
	String nazwa;
	
	Float dopuszczalnaWartosc;
	
	String jednostkaDop;
	
	//Float czasRozpadu;
	
	//String jednostkaRozp;

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

	public Float getDopuszczalnaWartosc() {
		return dopuszczalnaWartosc;
	}

	public void setDopuszczalnaWartosc(Float dopuszczalnaWartosc) {
		this.dopuszczalnaWartosc = dopuszczalnaWartosc;
	}

	public String getJednostkaDop() {
		return jednostkaDop;
	}

	public void setJednostkaDop(String jednostkaDop) {
		this.jednostkaDop = jednostkaDop;
	}

	/*public Float getCzasRozpadu() {
		return czasRozpadu;
	}

	public void setCzasRozpadu(Float czasRozpadu) {
		this.czasRozpadu = czasRozpadu;
	}
	public String getJednostkaRozp() {
		return jednostkaRozp;
	}

	public void setJednostkaRozp(String jednostkaRozp) {
		this.jednostkaRozp = jednostkaRozp;
	}*/

}
