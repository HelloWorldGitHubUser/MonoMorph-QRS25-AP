package org.springframework.samples.petclinic.DTO;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;
import org.springframework.samples.petclinic.model.Person;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;

public class Vet extends Person {

	private Set<Specialty> specialties;

	private int vetId;

	private RestTemplate restTemplate = new RestTemplate();

	String url = "http://1";

	public List<Specialty> getSpecialties() {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getSpecialties"))
				.queryParam("vet_id", vetId);

		List<Specialty> aux = restTemplate.getForObject(builder.toUriString(), List.class);

		return aux;

	}

	public Set<Specialty> getSpecialtiesInternal() {

		if (this.specialties == null) {

			this.specialties = new HashSet<>();

		}

		return this.specialties;

	}

	public int getNrOfSpecialties() {

		return getSpecialtiesInternal().size();

	}

}
