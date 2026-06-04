package org.springframework.samples.petclinic.NEWInstance;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.owner.PetType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class OwnerRepositoryController {

	private OwnerRepository ownerrepository;

	@GetMapping("/findPetTypes")
	public List<PetType> findPetTypes() {
		return ownerrepository.findPetTypes();
	}

	@GetMapping("/findById")
	public Owner findById(@RequestParam(name = "id") Integer id) {
		return ownerrepository.findById(id);
	}

	@GetMapping("/findByLastName")
	public Page<Owner> findByLastName(@RequestParam(name = "lastName") String lastName,
			@RequestParam(name = "pageable") Pageable pageable) {
		return ownerrepository.findByLastName(lastName, pageable);
	}

	@PostMapping("/save")
	public void save(Owner owner) {
		ownerrepository.save(owner);
	}

}