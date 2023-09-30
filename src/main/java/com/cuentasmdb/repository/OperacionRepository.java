package com.cuentasmdb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cuentasmdb.entity.Operacion;

@Repository
public interface OperacionRepository extends MongoRepository<Operacion,String> {

}
