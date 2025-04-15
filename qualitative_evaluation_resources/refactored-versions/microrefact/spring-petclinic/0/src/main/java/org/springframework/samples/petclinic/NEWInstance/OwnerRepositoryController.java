package org.springframework.samples.petclinic.NEWInstance;
 import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin
public class OwnerRepositoryController {

 private OwnerRepository ownerrepository;


@GetMapping
("/findPetTypes")
public List<PetType> findPetTypes(){
  return ownerrepository.findPetTypes();
}


}