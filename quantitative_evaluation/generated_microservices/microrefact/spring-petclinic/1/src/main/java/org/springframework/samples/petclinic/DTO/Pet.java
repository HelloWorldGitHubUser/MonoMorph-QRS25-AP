package org.springframework.samples.petclinic.DTO;

import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.samples.petclinic.owner.Visit;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;

public class Pet extends NamedEntity {

	private LocalDate birthDate;

	private PetType type;

	private Set<Visit> visits;

	private RestTemplate restTemplate = new RestTemplate();

	String url = "http://0";

	public PetType getType() {

		return this.type;

	}

	public void addVisit(Visit visit) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/addVisit")).queryParam("visit",
				visit);

		restTemplate.put(builder.toUriString(), null);

		getVisits().add(visit);

	}

	public void setBirthDate(LocalDate birthDate) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setBirthDate"))
				.queryParam("birthDate", birthDate);

		restTemplate.put(builder.toUriString(), null);

		this.birthDate = birthDate;

	}

	public void setType(PetType type) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setType")).queryParam("type",
				type);

		restTemplate.put(builder.toUriString(), null);

		this.type = type;

	}

	public Collection<Visit> getVisits() {

		return this.visits;

	}

}
