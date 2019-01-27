package com.rafbur.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafbur.entity.Role;
import com.rafbur.entity.Uzytkownicy;
import com.rafbur.entity.Zanieczyszczenia;
import com.rafbur.repository.RoleRepository;
import com.rafbur.repository.UzytkownicyRepository;
import com.rafbur.repository.ZanieczyszczeniaRepository;

@Service
public class InitDbService {

	@Autowired
	private ZanieczyszczeniaRepository zanieczyszczeniaRepository;
	
	@Autowired
	private UzytkownicyRepository uzytkownicyRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@PostConstruct
	public void init() {
		Zanieczyszczenia pierwiastek1 = new Zanieczyszczenia();
		pierwiastek1.setNazwa("Rtec");
		pierwiastek1.setDopuszczalnaWartosc(new Float(0.01));
		pierwiastek1.setJednostkaDop("mgHg/l");
		zanieczyszczeniaRepository.save(pierwiastek1);
		
		Zanieczyszczenia pierwiastek2 = new Zanieczyszczenia();
		pierwiastek2.setNazwa("Kadm");
		pierwiastek2.setDopuszczalnaWartosc(new Float(0.05));
		pierwiastek2.setJednostkaDop("mgCd/l");
		zanieczyszczeniaRepository.save(pierwiastek2);
		
		Zanieczyszczenia pierwiastek3 = new Zanieczyszczenia();
		pierwiastek3.setNazwa("Olow");
		pierwiastek3.setDopuszczalnaWartosc(new Float(0.20));
		pierwiastek3.setJednostkaDop("mgPb/l");
		zanieczyszczeniaRepository.save(pierwiastek3);
		
		Zanieczyszczenia pierwiastek4 = new Zanieczyszczenia();
		pierwiastek4.setNazwa("Nikiel");
		pierwiastek4.setDopuszczalnaWartosc(new Float(0.15));
		pierwiastek4.setJednostkaDop("mgNi/l");
		zanieczyszczeniaRepository.save(pierwiastek4);

		Zanieczyszczenia pierwiastek5 = new Zanieczyszczenia();
		pierwiastek5.setNazwa("Miedz");
		pierwiastek5.setDopuszczalnaWartosc(new Float(0.15));
		pierwiastek5.setJednostkaDop("mgCu/l");
		zanieczyszczeniaRepository.save(pierwiastek5);

		Zanieczyszczenia pierwiastek6 = new Zanieczyszczenia();
		pierwiastek6.setNazwa("Cynk");
		pierwiastek6.setDopuszczalnaWartosc(new Float(2.0));
		pierwiastek6.setJednostkaDop("mgZn/l");
		zanieczyszczeniaRepository.save(pierwiastek6);
		
		Zanieczyszczenia pierwiastek7 = new Zanieczyszczenia();
		pierwiastek7.setNazwa("Chrom");
		pierwiastek7.setDopuszczalnaWartosc(new Float(0.1));
		pierwiastek7.setJednostkaDop("mgCr+6/l");
		zanieczyszczeniaRepository.save(pierwiastek7);
		
		Role rola1 = new Role();
		rola1.setTypRoli("uzytkownik");
		roleRepository.save(rola1);
		
		Role rola2 = new Role();
		rola2.setTypRoli("administrator");
		roleRepository.save(rola2);
		
		Uzytkownicy uzytkownik1 = new Uzytkownicy();
		uzytkownik1.setImie("Anna");
		uzytkownik1.setNazwisko("Czajka");
		uzytkownik1.setLogin("AC");
		uzytkownik1.setHaslo("ac");
		List<Role> listaRoli = new ArrayList<Role>();
		listaRoli.add(rola2);
		uzytkownik1.setRole(listaRoli);
		uzytkownicyRepository.save(uzytkownik1);
		
		Uzytkownicy uzytkownik2 = new Uzytkownicy();
		uzytkownik2.setImie("Bartlomiej");
		uzytkownik2.setNazwisko("Lewandowski");
		uzytkownik2.setLogin("BL");
		uzytkownik2.setHaslo("bl");
		uzytkownik2.setRole(listaRoli);
		uzytkownicyRepository.save(uzytkownik2);
		
		Uzytkownicy uzytkownik3 = new Uzytkownicy();
		uzytkownik3.setImie("Artur");
		uzytkownik3.setNazwisko("Palka");
		uzytkownik3.setLogin("AP");
		uzytkownik3.setHaslo("ap");
		uzytkownik3.setRole(listaRoli);
		uzytkownicyRepository.save(uzytkownik3);
		
	}
	
}
