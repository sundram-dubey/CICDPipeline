package com.hcl.web;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customers, Integer>{

}
