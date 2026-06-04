package org.springframework.samples.petclinic.NEWInstance;

import org.springframework.samples.petclinic.vet.Specialty;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.VetRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class VetController {

	private VetRepository vetRepository;

	@GetMapping("/getSpecialties")
	public List<Specialty> getSpecialties(@RequestParam(name = "vet_id") int vetId) {
		Optional<Vet> vet = vetRepository.findAll().stream().filter(v -> v.getId() == vetId).findFirst();
		return vet.isPresent() ? vet.get().getSpecialties() : new ArrayList<>();
	}

}
