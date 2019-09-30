package com.digital.stock.repositories;

import com.digital.stock.models.Stock;

import org.springframework.data.repository.CrudRepository;

@RepositoryRestResource(collectionResourceRel = "stock", path = "stocks")
public interface StockRepository extends CrudRepository<Stock, Long> {

}