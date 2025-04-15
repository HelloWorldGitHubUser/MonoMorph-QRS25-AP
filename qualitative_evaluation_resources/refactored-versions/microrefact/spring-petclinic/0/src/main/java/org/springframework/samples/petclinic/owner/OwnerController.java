package org.springframework.samples.petclinic.owner;
 import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import jakarta.validation.Valid;
@Controller
public class OwnerController {

 private  String VIEWS_OWNER_CREATE_OR_UPDATE_FORM;

 private  OwnerRepository owners;

public OwnerController(OwnerRepository clinicService) {
    this.owners = clinicService;
}
@GetMapping("/owners/new")
public String initCreationForm(Map<String,Object> model){
    Owner owner = new Owner();
    model.put("owner", owner);
    return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
}


@GetMapping("/owners/{ownerId}/edit")
public String initUpdateOwnerForm(int ownerId,Model model){
    Owner owner = this.owners.findById(ownerId);
    model.addAttribute(owner);
    return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
}


public String addPaginationModel(int page,Model model,Page<Owner> paginated){
    model.addAttribute("listOwners", paginated);
    List<Owner> listOwners = paginated.getContent();
    model.addAttribute("currentPage", page);
    model.addAttribute("totalPages", paginated.getTotalPages());
    model.addAttribute("totalItems", paginated.getTotalElements());
    model.addAttribute("listOwners", listOwners);
    return "owners/ownersList";
}


@GetMapping("/owners/find")
public String initFindForm(){
    return "owners/findOwners";
}


@ModelAttribute("owner")
public Owner findOwner(Integer ownerId){
    return ownerId == null ? new Owner() : this.owners.findById(ownerId);
}


public Page<Owner> findPaginatedForOwnersLastName(int page,String lastname){
    int pageSize = 5;
    Pageable pageable = PageRequest.of(page - 1, pageSize);
    return owners.findByLastName(lastname, pageable);
}


@PostMapping("/owners/{ownerId}/edit")
public String processUpdateOwnerForm(Owner owner,BindingResult result,int ownerId){
    if (result.hasErrors()) {
        return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
    }
    owner.setId(ownerId);
    this.owners.save(owner);
    return "redirect:/owners/{ownerId}";
}


@GetMapping("/owners/{ownerId}")
public ModelAndView showOwner(int ownerId){
    ModelAndView mav = new ModelAndView("owners/ownerDetails");
    Owner owner = this.owners.findById(ownerId);
    mav.addObject(owner);
    return mav;
}


@InitBinder
public void setAllowedFields(WebDataBinder dataBinder){
    dataBinder.setDisallowedFields("id");
}


@PostMapping("/owners/new")
public String processCreationForm(Owner owner,BindingResult result){
    if (result.hasErrors()) {
        return VIEWS_OWNER_CREATE_OR_UPDATE_FORM;
    }
    this.owners.save(owner);
    return "redirect:/owners/" + owner.getId();
}


@GetMapping("/owners")
public String processFindForm(int page,Owner owner,BindingResult result,Model model){
    // allow parameterless GET request for /owners to return all records
    if (owner.getLastName() == null) {
        // empty string signifies broadest possible search
        owner.setLastName("");
    }
    // find owners by last name
    Page<Owner> ownersResults = findPaginatedForOwnersLastName(page, owner.getLastName());
    if (ownersResults.isEmpty()) {
        // no owners found
        result.rejectValue("lastName", "notFound", "not found");
        return "owners/findOwners";
    }
    if (ownersResults.getTotalElements() == 1) {
        // 1 owner found
        owner = ownersResults.iterator().next();
        return "redirect:/owners/" + owner.getId();
    }
    // multiple owners found
    return addPaginationModel(page, model, ownersResults);
}


}