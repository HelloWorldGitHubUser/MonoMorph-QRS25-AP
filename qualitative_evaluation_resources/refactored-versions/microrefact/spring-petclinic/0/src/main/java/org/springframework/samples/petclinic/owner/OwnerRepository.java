package org.springframework.samples.petclinic.owner;
 import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
public interface OwnerRepository extends Repository<Owner, Integer>{


@Query("SELECT owner FROM Owner owner left join fetch owner.pets WHERE owner.id =:id")
@Transactional(readOnly = true)
public Owner findById(Integer id)
;

@Query("SELECT DISTINCT owner FROM Owner owner left join  owner.pets WHERE owner.lastName LIKE :lastName% ")
@Transactional(readOnly = true)
public Page<Owner> findByLastName(String lastName,Pageable pageable)
;

public void save(Owner owner)
;

@Query("SELECT owner FROM Owner owner")
@Transactional(readOnly = true)
public Page<Owner> findAll(Pageable pageable)
;

@Query("SELECT ptype FROM PetType ptype ORDER BY ptype.name")
@Transactional(readOnly = true)
public List<PetType> findPetTypes()
;

}