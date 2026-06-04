package org.springframework.samples.petclinic.Interface;

import org.springframework.samples.petclinic.DTO.Owner;
import org.springframework.samples.petclinic.DTO.PetType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OwnerRepositoryImpl implements OwnerRepository {

	@Autowired
	private RestTemplate restTemplate;

	String url = "http://0";

	public Owner findById(Integer id) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/findById")).queryParam("id", id);
		Owner aux = restTemplate.getForObject(builder.toUriString(), Owner.class);

		return aux;
	}

	public void save(Owner owner) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/save"));
		restTemplate.postForObject(builder.toUriString(), owner, Void.class);
	}

	public List<PetType> findPetTypes() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/findPetTypes"));
		List<PetType> aux = restTemplate.getForObject(builder.toUriString(), List.class);

		return aux;
	}

}