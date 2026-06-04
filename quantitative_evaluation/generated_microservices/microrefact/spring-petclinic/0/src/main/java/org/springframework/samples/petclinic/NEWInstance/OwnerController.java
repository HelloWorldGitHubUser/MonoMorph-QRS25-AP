package org.springframework.samples.petclinic.NEWInstance;

import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.Visit;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class OwnerController {

	private Owner owner;

	@PutMapping("/setAddress")
	public void setAddress(@RequestParam(name = "address") String address) {
		owner.setAddress(address);
	}

	@PutMapping("/setCity")
	public void setCity(@RequestParam(name = "city") String city) {
		owner.setCity(city);
	}

	@PutMapping("/setTelephone")
	public void setTelephone(@RequestParam(name = "telephone") String telephone) {
		owner.setTelephone(telephone);
	}

	@PutMapping("/addPet")
	public void addPet(@RequestParam(name = "pet") Pet pet) {
		owner.addPet(pet);
	}

	@GetMapping("/getPet")
	public Pet getSpecialties(@RequestParam(name = "name") String name,
			@RequestParam(name = "ignoreNew") boolean ignoreNew) {
		return owner.getPet(name, ignoreNew);
	}

	@PutMapping("/addVisit")
	public void addVisit(@RequestParam(name = "petId") Integer petId, @RequestParam(name = "visit") Visit visit) {
		Assert.notNull(petId, "Pet identifier must not be null!");

		Assert.notNull(visit, "Visit must not be null!");

		Pet pet = owner.getPet(petId);

		Assert.notNull(pet, "Invalid Pet identifier!");

		pet.addVisit(visit);
	}

}
