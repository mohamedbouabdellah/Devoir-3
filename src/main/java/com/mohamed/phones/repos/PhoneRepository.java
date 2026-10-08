package com.mohamed.phones.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mohamed.phones.entities.Categorie;
import com.mohamed.phones.entities.Phone;


@RepositoryRestResource(path = "rest")
public interface PhoneRepository extends JpaRepository<Phone, Long> {
	
	List<Phone> findByNomPhone(String nom);
	List<Phone> findByNomPhoneContains(String nom);
	@Query("select p from Phone p where p.nomPhone like %?1 and p.prixPhone > ?2")
	List<Phone> findByNomPrix (String nom, Double prix);
	
	@Query("select p from Phone p where p.categorie = ?1")
	List<Phone> findByCategorie (Categorie categorie);
	
	List<Phone> findByCategorieIdCat(Long id);
	
	List<Phone> findByOrderByNomPhoneAsc();
	
	@Query("select p from Phone p order by p.nomPhone ASC, p.prixPhone DESC")
	List<Phone> trierPhonesNomsPrix ();




}
