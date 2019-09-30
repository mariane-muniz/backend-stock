package com.digital.stock.repositories;

import com.digital.stock.models.Stock;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stock", path = "stocks")
public interface StockRepository extends CrudRepository<Stock, Long> {

}