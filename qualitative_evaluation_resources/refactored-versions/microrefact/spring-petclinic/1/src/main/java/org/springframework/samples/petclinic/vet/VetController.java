package org.springframework.samples.petclinic.vet;
 import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class VetController {

 private  VetRepository vetRepository;

public VetController(VetRepository clinicService) {
    this.vetRepository = clinicService;
}
@GetMapping({ "/vets" })
@ResponseBody
public Vets showResourcesVetList(){
    // Here we are returning an object of type 'Vets' rather than a collection of Vet
    // objects so it is simpler for JSon/Object mapping
    Vets vets = new Vets();
    vets.getVetList().addAll(this.vetRepository.findAll());
    return vets;
}


public Page<Vet> findPaginated(int page){
    int pageSize = 5;
    Pageable pageable = PageRequest.of(page - 1, pageSize);
    return vetRepository.findAll(pageable);
}


@GetMapping("/vets.html")
public String showVetList(int page,Model model){
    // Here we are returning an object of type 'Vets' rather than a collection of Vet
    // objects so it is simpler for Object-Xml mapping
    Vets vets = new Vets();
    Page<Vet> paginated = findPaginated(page);
    vets.getVetList().addAll(paginated.toList());
    return addPaginationModel(page, paginated, model);
}


public String addPaginationModel(int page,Page<Vet> paginated,Model model){
    List<Vet> listVets = paginated.getContent();
    model.addAttribute("currentPage", page);
    model.addAttribute("totalPages", paginated.getTotalPages());
    model.addAttribute("totalItems", paginated.getTotalElements());
    model.addAttribute("listVets", listVets);
    return "vets/vetList";
}


}