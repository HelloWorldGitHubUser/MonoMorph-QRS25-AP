package org.springframework.samples.petclinic.NEWInstance;

import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin
public class VetRepositoryController {

	private VetRepository vetRepository;

	@GetMapping("/findAll")
	public Collection<Vet> findAll() {
		return vetRepository.findAll();
	}

}
