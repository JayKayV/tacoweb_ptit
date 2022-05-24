package com.taco.demo;

import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, String> {

}
