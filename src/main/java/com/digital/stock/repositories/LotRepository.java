package com.digital.stock.repositories;


import com.digital.stock.models.Lot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "lot", path = "lots")
public interface LotRepository extends CrudRepository<Lot, Long> {

}