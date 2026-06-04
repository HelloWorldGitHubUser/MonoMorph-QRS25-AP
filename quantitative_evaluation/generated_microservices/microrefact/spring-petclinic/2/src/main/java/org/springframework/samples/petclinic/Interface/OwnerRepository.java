package org.springframework.samples.petclinic.Interface;

import org.springframework.samples.petclinic.DTO.Owner;
import org.springframework.samples.petclinic.DTO.PetType;

import java.util.List;

public interface OwnerRepository {

	public Owner findById(Integer id);

	public void save(Owner owner);

	public List<PetType> findPetTypes();

}