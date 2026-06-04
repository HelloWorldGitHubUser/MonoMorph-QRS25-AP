package org.springframework.samples.petclinic.Interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.samples.petclinic.DTO.Vet;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collection;
import java.util.List;

public class VetRepositoryImpl implements VetRepository {

	@Autowired
	private RestTemplate restTemplate;

	String url = "http://1";

	@Override
	public Collection<Vet> findAll() throws DataAccessException {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/findAll"));
		List<Vet> aux = restTemplate.getForObject(builder.toUriString(), List.class);

		return aux;
	}

}
