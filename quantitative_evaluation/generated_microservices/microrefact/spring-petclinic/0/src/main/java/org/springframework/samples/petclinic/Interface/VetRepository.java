package org.springframework.samples.petclinic.Interface;

import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.DTO.Vet;

import java.util.Collection;

public interface VetRepository {

	Collection<Vet> findAll() throws DataAccessException;

}
