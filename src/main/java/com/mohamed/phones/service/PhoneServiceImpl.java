package com.mohamed.phones.service;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohamed.phones.entities.Categorie;
import com.mohamed.phones.entities.Phone;
import com.mohamed.phones.repos.PhoneRepository;


@Service

public class PhoneServiceImpl implements PhoneService  {
	
	
	//@Autowired
	private final PhoneRepository phoneRepository ;
	
	

	public PhoneServiceImpl(PhoneRepository phoneRepository) {
		super();
		this.phoneRepository = phoneRepository;
	}

	@Override
	public Phone savePhone(Phone p) {
		return phoneRepository.save(p);
	}

	@Override
	public Phone updatePhone(Phone p) {
		return phoneRepository.save(p);

	}

	@Override
	public void deletePhone(Phone p) {
		phoneRepository.delete(p);

		
	}

	@Override
	public void deletePhoneById(Long id) {
		phoneRepository.deleteById(id);
		
	}

	@Override
	public Phone getPhone(Long id) {
		return phoneRepository.findById(id).get();
	}

	@Override
	public List<Phone> getAllPhones() {
		return phoneRepository.findAll();

	}

	@Override
	public List<Phone> findByNomPhone(String nom) {
		return phoneRepository.findByNomPhone(nom);
	}

	@Override
	public List<Phone> findByNomPhoneContains(String nom) {
		return phoneRepository.findByNomPhoneContains(nom);
	}

	@Override
	public List<Phone> findByNomPrix(String nom, Double prix) {
		return phoneRepository.findByNomPrix(nom, prix);
	}

	@Override
	public List<Phone> findByCategorie(Categorie categorie) {
		return phoneRepository.findByCategorie(categorie);
	}

	@Override
	public List<Phone> findByCategorieIdCat(Long id) {
		return phoneRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Phone> findByOrderByNomPhoneAsc() {
		return phoneRepository.findByOrderByNomPhoneAsc();
	}

	@Override
	public List<Phone> trierPhonesNomsPrix() {
		return phoneRepository.trierPhonesNomsPrix();
	}

}
