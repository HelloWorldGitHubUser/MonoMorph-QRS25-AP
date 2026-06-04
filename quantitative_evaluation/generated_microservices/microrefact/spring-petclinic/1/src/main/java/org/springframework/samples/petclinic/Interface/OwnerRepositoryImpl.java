package org.springframework.samples.petclinic.Interface;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.DTO.Owner;
import org.springframework.samples.petclinic.DTO.PetType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.Interface.OwnerRepository;

public class OwnerRepositoryImpl implements OwnerRepository {

	@Autowired
	private RestTemplate restTemplate;

	String url = "http://0";

	@Override
	public Owner findById(Integer id) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/findById")).queryParam("id", id);
		Owner aux = restTemplate.getForObject(builder.toUriString(), Owner.class);

		return aux;
	}

	@Override
	public Page<Owner> findByLastName(String lastName, Pageable pageable) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/findByLastName"))
				.queryParam("lastName", lastName).queryParam("pageable", pageable);
		Page<Owner> aux = restTemplate.getForObject(builder.toUriString(), Page.class);

		return aux;
	}

	@Override
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