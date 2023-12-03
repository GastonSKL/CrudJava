package com.pryect.crud.Interfaces;

import org.springframework.data.repository.CrudRepository;

import com.pryect.crud.Model.Persona;

public interface IPersona extends CrudRepository<Persona, Integer>{
    
}
