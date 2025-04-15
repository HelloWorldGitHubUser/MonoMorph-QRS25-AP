package org.springframework.samples.petclinic.Interface;
 import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.Interface.OwnerRepository;
public class OwnerRepositoryImpl implements OwnerRepository{

@Autowired
 private RestTemplate restTemplate;

  String url = "http://0";


public List<PetType> findPetTypes(){
  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(url.concat("/findPetTypes"))
;  List<PetType> aux = restTemplate.getForObject(builder.toUriString(), List<PetType>.class);

 return aux;
}


}