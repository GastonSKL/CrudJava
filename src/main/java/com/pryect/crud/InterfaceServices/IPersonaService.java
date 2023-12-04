package com.pryect.crud.InterfaceServices;

import java.util.List;
import java.util.Optional;

import com.pryect.crud.Model.Persona;

public interface IPersonaService {
    public List<Persona> listar();
    public Optional<Persona> listarId(int id);
    public int save (Persona p);
    public void Delete (int id);
}
