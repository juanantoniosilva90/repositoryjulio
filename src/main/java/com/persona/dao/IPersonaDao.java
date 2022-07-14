package com.persona.dao;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.persona.modelo.Persona;

//DEFINE: LOS METODOS CRUD...

@Repository
public interface IPersonaDao extends CrudRepository<Persona,Serializable>{
	
	//save(), saveOrUpdate(), delete(), deleteById, deleteAll, findById(), findAll()...

}
