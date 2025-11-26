package com.cpcapi.crudapi_10.repository;

import org.springframework.data.repository.CrudRepository;

import com.cpcapi.crudapi_10.model.Employee;

public interface Emprepo extends CrudRepository<Employee, Integer> {

}
