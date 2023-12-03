package com.pryect.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pryect.crud.InterfaceServices.IPersonaService;
import com.pryect.crud.Model.Persona;

@Controller
@RequestMapping
public class PersonaController {
    
    @Autowired
    private IPersonaService service;

    @GetMapping("/listar") 
    public String listar(Model m)
    {
        List<Persona> personas = service.listar();
        m.addAttribute("personas", personas);
        return "index";
    }


}
