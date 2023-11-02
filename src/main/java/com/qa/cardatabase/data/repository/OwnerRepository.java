package com.qa.cardatabase.data.repository;

import com.qa.cardatabase.data.entity.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long>{

}
