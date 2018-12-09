package com.monitoring.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Uzytkownicy implements Serializable{
	

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Integer idUzytkownika;	
	
	private String login;	
	
	private String imie;	
	
	private String nazwisko;	
	
	private String haslo;
	
	@ManyToMany
	@JoinTable
	private List<Role> role;
		
	
	public List<Role> getRole() {
		return role;
	}

	public void setRole(List<Role> role) {
		this.role = role;
	}

	public Integer getIdUzytkownika() {
		return idUzytkownika;
	}

	public void setIdUzytkownika(Integer idUzytkownika) {
		this.idUzytkownika = idUzytkownika;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}



	public String getHaslo() {
		return haslo;
	}

	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}

}
