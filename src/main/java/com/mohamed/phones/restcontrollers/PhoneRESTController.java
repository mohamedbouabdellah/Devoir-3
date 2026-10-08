package com.mohamed.phones.restcontrollers;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohamed.phones.entities.Phone;
import com.mohamed.phones.service.PhoneService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api")
@CrossOrigin
@AllArgsConstructor
public class PhoneRESTController {
	
	
	//@Autowired
	private final PhoneService phoneService ;
	
	@GetMapping()
	public List<Phone> getAllPhones() {
	return phoneService.getAllPhones();
	}
	
	//@RequestMapping(value="/{id}",method = RequestMethod.GET)
	@GetMapping("/{id}")
	public Phone getPhoneById(@PathVariable("id") Long id) {
		return phoneService.getPhone(id);
	 }
	
	//@RequestMapping(method = RequestMethod.POST)
	@PostMapping()
	public Phone createPhone(@RequestBody Phone phone) {
		return phoneService.savePhone(phone);
	}
	
	
	//@RequestMapping(method = RequestMethod.PUT)
	@PutMapping()
	public Phone updatePhone(@RequestBody Phone phone) {
		return phoneService.updatePhone(phone);
	}
	
	
	//@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	 @DeleteMapping("/{id}")
	public void deletePhone(@PathVariable("id") Long id)
	{
		 phoneService.deletePhoneById(id);
	}
	 
	//@RequestMapping(value="/phonescat/{idCat}",method = RequestMethod.GET)
	 @GetMapping("/phonescat/{idCat}")
	public List<Phone> getPhonesByCatId(@PathVariable("idCat") Long idCat) {
	return phoneService.findByCategorieIdCat(idCat);
	}

	 
	 
	 
	 
	 


}
