package com.pryect.crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping("/new")
    public String agregar(Model m)
    {
        m.addAttribute("persona", new Persona());
        return "form"; 
    }

    @PostMapping("/save")
    public String save(@Validated Persona p, Model m)
    {
        service.save(p);
        return "redirect:/listar";
    }

}
