package org.springframework.samples.petclinic.owner;
 import java.util.Collection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.Valid;
@Controller
@RequestMapping("/owners/{ownerId}")
public class PetController {

 private  String VIEWS_PETS_CREATE_OR_UPDATE_FORM;

 private  OwnerRepository owners;

public PetController(OwnerRepository owners) {
    this.owners = owners;
}
@ModelAttribute("pet")
public Pet findPet(int ownerId,Integer petId){
    return petId == null ? new Pet() : this.owners.findById(ownerId).getPet(petId);
}


@InitBinder("owner")
public void initOwnerBinder(WebDataBinder dataBinder){
    dataBinder.setDisallowedFields("id");
}


@GetMapping("/pets/new")
public String initCreationForm(Owner owner,ModelMap model){
    Pet pet = new Pet();
    owner.addPet(pet);
    model.put("pet", pet);
    return VIEWS_PETS_CREATE_OR_UPDATE_FORM;
}


@InitBinder("pet")
public void initPetBinder(WebDataBinder dataBinder){
    dataBinder.setValidator(new PetValidator());
}


@GetMapping("/pets/{petId}/edit")
public String initUpdateForm(Owner owner,int petId,ModelMap model){
    Pet pet = owner.getPet(petId);
    model.put("pet", pet);
    return VIEWS_PETS_CREATE_OR_UPDATE_FORM;
}


@ModelAttribute("types")
public Collection<PetType> populatePetTypes(){
    return this.owners.findPetTypes();
}


@ModelAttribute("owner")
public Owner findOwner(int ownerId){
    return this.owners.findById(ownerId);
}


@PostMapping("/pets/{petId}/edit")
public String processUpdateForm(Pet pet,BindingResult result,Owner owner,ModelMap model){
    if (result.hasErrors()) {
        model.put("pet", pet);
        return VIEWS_PETS_CREATE_OR_UPDATE_FORM;
    }
    owner.addPet(pet);
    this.owners.save(owner);
    return "redirect:/owners/{ownerId}";
}


@PostMapping("/pets/new")
public String processCreationForm(Owner owner,Pet pet,BindingResult result,ModelMap model){
    if (StringUtils.hasLength(pet.getName()) && pet.isNew() && owner.getPet(pet.getName(), true) != null) {
        result.rejectValue("name", "duplicate", "already exists");
    }
    owner.addPet(pet);
    if (result.hasErrors()) {
        model.put("pet", pet);
        return VIEWS_PETS_CREATE_OR_UPDATE_FORM;
    }
    this.owners.save(owner);
    return "redirect:/owners/{ownerId}";
}


}