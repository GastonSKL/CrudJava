package com.pryect.crud.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pryect.crud.InterfaceServices.IPersonaService;
import com.pryect.crud.Interfaces.IPersona;
import com.pryect.crud.Model.Persona;

@Service
public class PersonaService  implements IPersonaService{

    @Autowired
    private IPersona data;

    @Override
    public List<Persona> listar() {

        return (List<Persona>)data.findAll();    
    }

    @Override
    public Optional<Persona> listarId(int id) {

        return data.findById(id);
    }

    @Override
    public int save(Persona p) {
        int res = 0;
        Persona persona = data.save(p);
        if(!persona.equals(null)) res = 1;
        return res;
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }

}
