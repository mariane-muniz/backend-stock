package com.digital.stock.repositories;

import com.digital.stock.models.Warehouse;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "waregouse", path = "warehouses")
public interface WarehouseRepository extends CrudRepository<Warehouse, Long> {
    
}