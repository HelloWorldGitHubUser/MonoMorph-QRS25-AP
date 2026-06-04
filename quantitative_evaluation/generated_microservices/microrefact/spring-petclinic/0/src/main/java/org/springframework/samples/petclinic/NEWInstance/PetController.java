package org.springframework.samples.petclinic.NEWInstance;

import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.PetType;
import org.springframework.samples.petclinic.owner.Visit;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@CrossOrigin
public class PetController {

	private Pet pet;

	@PutMapping("/addVisit")
	public void addVisit(@RequestParam(name = "visit") Visit visit) {
		pet.addVisit(visit);
	}

	@PutMapping("/setBirthDate")
	public void setBirthDate(@RequestParam(name = "birthDate") LocalDate birthDate) {
		pet.setBirthDate(birthDate);
	}

	@PutMapping("/setType")
	public void setType(@RequestParam(name = "type") PetType type) {
		pet.setType(type);
	}

}
