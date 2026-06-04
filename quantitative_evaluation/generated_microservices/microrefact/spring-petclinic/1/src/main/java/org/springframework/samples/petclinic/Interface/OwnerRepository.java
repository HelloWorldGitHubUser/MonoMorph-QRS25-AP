package org.springframework.samples.petclinic.Interface;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.DTO.Owner;
import org.springframework.samples.petclinic.DTO.PetType;

import java.util.List;

public interface OwnerRepository {

	public Owner findById(Integer id);

	public Page<Owner> findByLastName(String lastName, Pageable pageable);

	public void save(Owner owner);

	public List<PetType> findPetTypes();

}