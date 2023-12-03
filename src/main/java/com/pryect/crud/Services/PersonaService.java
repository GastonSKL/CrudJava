package com.pryect.crud.Services;

import java.util.List;
import java.util.Optional;

import com.pryect.crud.InterfaceServices.IPersonaService;
import com.pryect.crud.Interfaces.IPersona;
import com.pryect.crud.Model.Persona;

public class PersonaService  implements IPersonaService{

    private IPersona data;

    @Override
    public List<Persona> listar() {

        return (List<Persona>)data.findAll();    
    }

    @Override
    public Optional<Persona> listarId(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public int Save(Persona p) {
        throw new UnsupportedOperationException("Unimplemented method 'Save'");
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'Delete'");
    }

}
