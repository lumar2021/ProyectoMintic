package com.mintic.project.controllers;

import com.mintic.project.models.Empresa;
import com.mintic.project.services.ServicioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ControladorEmpresas {

    @Autowired
    private ServicioEmpresa servicioEmpresa;


    @GetMapping("/empresas")
    public String consultarEmpresas(Model model){
        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        model.addAttribute("empresas", servicioEmpresa.consultarTodas());
        return "empresas";
    }

    @PostMapping("/empresas")
    public RedirectView crearEmpresa(@ModelAttribute("empresa") Empresa empresa){
        servicioEmpresa.crear(empresa);
        return new RedirectView("/empresas");
    }
}
