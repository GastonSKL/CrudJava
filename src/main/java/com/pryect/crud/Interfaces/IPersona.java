package com.pryect.crud.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pryect.crud.Model.Persona;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
    
}
