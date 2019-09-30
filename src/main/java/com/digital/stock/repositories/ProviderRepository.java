package com.digital.stock.repositories;

import com.digital.stock.models.Provider;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "provider", path = "providers")
public interface ProviderRepository extends CrudRepository<Provider, Long> {

}