# spring-petclinic
## customers
### Potential Test inter-service class interactions
- org.springframework.samples.petclinic.owner.OwnerControllerTests -> org.springframework.samples.petclinic.owner.Visit
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.owner.Visit
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.vet.Vet
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.vet.VetRepository
- org.springframework.samples.petclinic.vet.VetControllerTests -> org.springframework.samples.petclinic.vet.Vet
- org.springframework.samples.petclinic.vet.VetControllerTests -> org.springframework.samples.petclinic.vet.VetRepository
- org.springframework.samples.petclinic.PetClinicIntegrationTests -> org.springframework.samples.petclinic.vet.VetRepository

## visits
### Expected inter-service class interactions
- org.springframework.samples.petclinic.owner.VisitController -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.owner.VisitController -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.owner.VisitController -> org.springframework.samples.petclinic.owner.Pet
- org.springframework.samples.petclinic.owner.PetTypeFormatter -> org.springframework.samples.petclinic.owner.OwnerRepository
### Potential Test inter-service class interactions
- org.springframework.samples.petclinic.owner.OwnerControllerTests$1 -> org.springframework.samples.petclinic.owner.Pet
- org.springframework.samples.petclinic.owner.OwnerControllerTests -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.owner.OwnerControllerTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.owner.OwnerControllerTests -> org.springframework.samples.petclinic.owner.Pet
- org.springframework.samples.petclinic.owner.PetControllerTests -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.owner.PetControllerTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.owner.PetTypeFormatterTests$1 -> org.springframework.samples.petclinic.owner.PetType
- org.springframework.samples.petclinic.owner.PetTypeFormatterTests$2 -> org.springframework.samples.petclinic.owner.PetType
- org.springframework.samples.petclinic.owner.PetTypeFormatterTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.owner.VisitControllerTests -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.owner.VisitControllerTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.owner.Pet
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.vet.Vet
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.vet.VetRepository
- org.springframework.samples.petclinic.vet.VetControllerTests -> org.springframework.samples.petclinic.vet.Vet
- org.springframework.samples.petclinic.vet.VetControllerTests -> org.springframework.samples.petclinic.vet.VetRepository
- org.springframework.samples.petclinic.PetClinicIntegrationTests -> org.springframework.samples.petclinic.vet.VetRepository

## vets
### Expected inter-service class interactions
- org.springframework.samples.petclinic.owner.PetTypeFormatter -> org.springframework.samples.petclinic.owner.OwnerRepository
### Potential Test inter-service class interactions
- org.springframework.samples.petclinic.owner.OwnerControllerTests$1 -> org.springframework.samples.petclinic.owner.Pet
- org.springframework.samples.petclinic.owner.OwnerControllerTests -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.owner.OwnerControllerTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.owner.OwnerControllerTests -> org.springframework.samples.petclinic.owner.Pet
- org.springframework.samples.petclinic.owner.OwnerControllerTests -> org.springframework.samples.petclinic.owner.Visit
- org.springframework.samples.petclinic.owner.PetControllerTests -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.owner.PetControllerTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.owner.PetTypeFormatterTests$1 -> org.springframework.samples.petclinic.owner.PetType
- org.springframework.samples.petclinic.owner.PetTypeFormatterTests$2 -> org.springframework.samples.petclinic.owner.PetType
- org.springframework.samples.petclinic.owner.PetTypeFormatterTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.owner.VisitControllerTests -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.owner.VisitControllerTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.owner.Owner
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.owner.OwnerRepository
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.owner.Pet
- org.springframework.samples.petclinic.service.ClinicServiceTests -> org.springframework.samples.petclinic.owner.Visit
