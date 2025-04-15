# spring-petclinic
## customers
### Potential Test inter-service method interactions
- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.Visit::setDate(java.time.LocalDate)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.Visit::setDescription(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVets() -> org.springframework.samples.petclinic.vet.Vet::getSpecialties()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVets() -> org.springframework.samples.petclinic.vet.Vet::getNrOfSpecialties()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVets() -> org.springframework.samples.petclinic.vet.VetRepository::findAll()

- org.springframework.samples.petclinic.vet.VetControllerTests::helen() -> org.springframework.samples.petclinic.vet.Vet::addSpecialty(org.springframework.samples.petclinic.vet.Specialty)

- org.springframework.samples.petclinic.vet.VetControllerTests::setup() -> org.springframework.samples.petclinic.vet.VetRepository::findAll()

- org.springframework.samples.petclinic.vet.VetControllerTests::setup() -> org.springframework.samples.petclinic.vet.VetRepository::findAll(org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.PetClinicIntegrationTests::testFindAll() -> org.springframework.samples.petclinic.vet.VetRepository::findAll()


## visits
### Expected inter-service method interactions
- org.springframework.samples.petclinic.owner.VisitController::processNewVisitForm(org.springframework.samples.petclinic.owner.Owner,int,org.springframework.samples.petclinic.owner.Visit,org.springframework.validation.BindingResult) -> org.springframework.samples.petclinic.owner.Owner::addVisit(java.lang.Integer,org.springframework.samples.petclinic.owner.Visit)

- org.springframework.samples.petclinic.owner.VisitController::processNewVisitForm(org.springframework.samples.petclinic.owner.Owner,int,org.springframework.samples.petclinic.owner.Visit,org.springframework.validation.BindingResult) -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.owner.VisitController::loadPetWithVisit(int,int,java.util.Map) -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.Integer)

- org.springframework.samples.petclinic.owner.VisitController::loadPetWithVisit(int,int,java.util.Map) -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.owner.VisitController::loadPetWithVisit(int,int,java.util.Map) -> org.springframework.samples.petclinic.owner.Pet::addVisit(org.springframework.samples.petclinic.owner.Visit)

- org.springframework.samples.petclinic.owner.PetTypeFormatter::parse(java.lang.String,java.util.Locale) -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

### Potential Test inter-service method interactions
- org.springframework.samples.petclinic.owner.OwnerControllerTests$1::matches(java.lang.Object) -> org.springframework.samples.petclinic.owner.Pet::getVisits()

- org.springframework.samples.petclinic.owner.OwnerControllerTests::testProcessFindFormSuccess() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::testProcessFindFormNoOwnersFound() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Owner::addPet(org.springframework.samples.petclinic.owner.Pet)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Owner::setAddress(java.lang.String)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Owner::setCity(java.lang.String)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Owner::setTelephone(java.lang.String)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Pet::setBirthDate(java.time.LocalDate)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Pet::setType(org.springframework.samples.petclinic.owner.PetType)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.String)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findAll(org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.Pet::getVisits()

- org.springframework.samples.petclinic.owner.OwnerControllerTests::testProcessFindFormByLastName() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.PetControllerTests::setup() -> org.springframework.samples.petclinic.owner.Owner::addPet(org.springframework.samples.petclinic.owner.Pet)

- org.springframework.samples.petclinic.owner.PetControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.owner.PetControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.owner.PetTypeFormatterTests$1::org.springframework.samples.petclinic.owner.PetTypeFormatterTests$1() -> org.springframework.samples.petclinic.owner.PetType::org.springframework.samples.petclinic.owner.PetType()

- org.springframework.samples.petclinic.owner.PetTypeFormatterTests$2::org.springframework.samples.petclinic.owner.PetTypeFormatterTests$2() -> org.springframework.samples.petclinic.owner.PetType::org.springframework.samples.petclinic.owner.PetType()

- org.springframework.samples.petclinic.owner.PetTypeFormatterTests::shouldParse() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.owner.PetTypeFormatterTests::shouldThrowParseException() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.owner.VisitControllerTests::init() -> org.springframework.samples.petclinic.owner.Owner::addPet(org.springframework.samples.petclinic.owner.Pet)

- org.springframework.samples.petclinic.owner.VisitControllerTests::init() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.Owner::addVisit(java.lang.Integer,org.springframework.samples.petclinic.owner.Visit)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.Pet::getVisits()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVets() -> org.springframework.samples.petclinic.vet.Vet::getSpecialties()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVets() -> org.springframework.samples.petclinic.vet.Vet::getNrOfSpecialties()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVets() -> org.springframework.samples.petclinic.vet.VetRepository::findAll()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.Owner::setAddress(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.Owner::setCity(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.Owner::setTelephone(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindAllPetTypes() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindOwnersByLastName() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdatePetName() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdatePetName() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdatePetName() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindSingleOwnerWithPet() -> org.springframework.samples.petclinic.owner.Owner::getPets()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindSingleOwnerWithPet() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindSingleOwnerWithPet() -> org.springframework.samples.petclinic.owner.Pet::getType()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdateOwner() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdateOwner() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVisitsByPetId() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVisitsByPetId() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVisitsByPetId() -> org.springframework.samples.petclinic.owner.Pet::getVisits()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Owner::addPet(org.springframework.samples.petclinic.owner.Pet)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Owner::getPets()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Pet::setBirthDate(java.time.LocalDate)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Pet::setType(org.springframework.samples.petclinic.owner.PetType)

- org.springframework.samples.petclinic.vet.VetControllerTests::helen() -> org.springframework.samples.petclinic.vet.Vet::addSpecialty(org.springframework.samples.petclinic.vet.Specialty)

- org.springframework.samples.petclinic.vet.VetControllerTests::setup() -> org.springframework.samples.petclinic.vet.VetRepository::findAll()

- org.springframework.samples.petclinic.vet.VetControllerTests::setup() -> org.springframework.samples.petclinic.vet.VetRepository::findAll(org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.PetClinicIntegrationTests::testFindAll() -> org.springframework.samples.petclinic.vet.VetRepository::findAll()


## vets
### Expected inter-service method interactions
- org.springframework.samples.petclinic.owner.PetTypeFormatter::parse(java.lang.String,java.util.Locale) -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

### Potential Test inter-service method interactions
- org.springframework.samples.petclinic.owner.OwnerControllerTests$1::matches(java.lang.Object) -> org.springframework.samples.petclinic.owner.Pet::getVisits()

- org.springframework.samples.petclinic.owner.OwnerControllerTests::testProcessFindFormSuccess() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::testProcessFindFormNoOwnersFound() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Owner::addPet(org.springframework.samples.petclinic.owner.Pet)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Owner::setAddress(java.lang.String)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Owner::setCity(java.lang.String)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Owner::setTelephone(java.lang.String)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Pet::setBirthDate(java.time.LocalDate)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::george() -> org.springframework.samples.petclinic.owner.Pet::setType(org.springframework.samples.petclinic.owner.PetType)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.String)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findAll(org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.Pet::getVisits()

- org.springframework.samples.petclinic.owner.OwnerControllerTests::setup() -> org.springframework.samples.petclinic.owner.Visit::setDate(java.time.LocalDate)

- org.springframework.samples.petclinic.owner.OwnerControllerTests::testProcessFindFormByLastName() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.owner.PetControllerTests::setup() -> org.springframework.samples.petclinic.owner.Owner::addPet(org.springframework.samples.petclinic.owner.Pet)

- org.springframework.samples.petclinic.owner.PetControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.owner.PetControllerTests::setup() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.owner.PetTypeFormatterTests$1::org.springframework.samples.petclinic.owner.PetTypeFormatterTests$1() -> org.springframework.samples.petclinic.owner.PetType::org.springframework.samples.petclinic.owner.PetType()

- org.springframework.samples.petclinic.owner.PetTypeFormatterTests$2::org.springframework.samples.petclinic.owner.PetTypeFormatterTests$2() -> org.springframework.samples.petclinic.owner.PetType::org.springframework.samples.petclinic.owner.PetType()

- org.springframework.samples.petclinic.owner.PetTypeFormatterTests::shouldParse() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.owner.PetTypeFormatterTests::shouldThrowParseException() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.owner.VisitControllerTests::init() -> org.springframework.samples.petclinic.owner.Owner::addPet(org.springframework.samples.petclinic.owner.Pet)

- org.springframework.samples.petclinic.owner.VisitControllerTests::init() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.Owner::addVisit(java.lang.Integer,org.springframework.samples.petclinic.owner.Visit)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.Pet::getVisits()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldAddNewVisitForPet() -> org.springframework.samples.petclinic.owner.Visit::setDescription(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.Owner::setAddress(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.Owner::setCity(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.Owner::setTelephone(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertOwner() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindAllPetTypes() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindOwnersByLastName() -> org.springframework.samples.petclinic.owner.OwnerRepository::findByLastName(java.lang.String,org.springframework.data.domain.Pageable)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdatePetName() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdatePetName() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdatePetName() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindSingleOwnerWithPet() -> org.springframework.samples.petclinic.owner.Owner::getPets()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindSingleOwnerWithPet() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindSingleOwnerWithPet() -> org.springframework.samples.petclinic.owner.Pet::getType()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdateOwner() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldUpdateOwner() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVisitsByPetId() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVisitsByPetId() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldFindVisitsByPetId() -> org.springframework.samples.petclinic.owner.Pet::getVisits()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Owner::addPet(org.springframework.samples.petclinic.owner.Pet)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Owner::getPet(java.lang.String)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Owner::getPets()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.OwnerRepository::findById(java.lang.Integer)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.OwnerRepository::findPetTypes()

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.OwnerRepository::save(org.springframework.samples.petclinic.owner.Owner)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Pet::setBirthDate(java.time.LocalDate)

- org.springframework.samples.petclinic.service.ClinicServiceTests::shouldInsertPetIntoDatabaseAndGenerateId() -> org.springframework.samples.petclinic.owner.Pet::setType(org.springframework.samples.petclinic.owner.PetType)

