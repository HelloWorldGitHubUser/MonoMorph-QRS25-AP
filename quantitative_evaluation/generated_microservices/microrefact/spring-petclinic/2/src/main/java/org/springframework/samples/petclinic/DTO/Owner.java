package org.springframework.samples.petclinic.DTO;

import org.springframework.samples.petclinic.model.Person;
import org.springframework.samples.petclinic.owner.Visit;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

public class Owner extends Person {

	private String address;

	private String city;

	private String telephone;

	private List<Pet> pets;

	private RestTemplate restTemplate = new RestTemplate();

	String url = "http://0";

	public Pet getPet(String name) {
		return getPet(name, false);
	}

	public Pet getPet(Integer id) {
		for (Pet pet : getPets()) {
			if (!pet.isNew()) {
				Integer compId = pet.getId();
				if (compId.equals(id)) {
					return pet;
				}
			}
		}
		return null;
	}

	public Pet getPet(String name, boolean ignoreNew) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/getPet"))
				.queryParam("name", name).queryParam("ignoreNew", ignoreNew);

		Pet aux = restTemplate.getForObject(builder.toUriString(), Pet.class);

		return aux;

	}

	public void setAddress(String address) {

		this.address = address;

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setAddress"))
				.queryParam("address", address);

		restTemplate.put(builder.toUriString(), null);
	}

	public void setCity(String city) {

		this.city = city;

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setCity")).queryParam("city",
				city);

		restTemplate.put(builder.toUriString(), null);
	}

	public Owner addVisit(Integer petId, Visit visit) {
		Assert.notNull(petId, "Pet identifier must not be null!");

		Assert.notNull(visit, "Visit must not be null!");

		Pet pet = getPet(petId);

		Assert.notNull(pet, "Invalid Pet identifier!");

		pet.addVisit(visit);

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/addVisit"))
				.queryParam("petId", petId).queryParam("visit", visit);

		restTemplate.put(builder.toUriString(), null);

		return this;

	}

	public void addPet(Pet pet) {

		if (pet.isNew()) {

			getPets().add(pet);

			UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/addPet")).queryParam("pet",
					pet);

			restTemplate.put(builder.toUriString(), null);

		}

	}

	public void setTelephone(String telephone) {

		this.telephone = telephone;

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/setTelephone"))
				.queryParam("telephone", telephone);

		restTemplate.put(builder.toUriString(), null);

	}

	public List<Pet> getPets() {

		return this.pets;

	}

}
