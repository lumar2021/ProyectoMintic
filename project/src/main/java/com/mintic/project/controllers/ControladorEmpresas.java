package com.mintic.project.controllers;

import com.mintic.project.services.ServicioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControladorEmpresas {

    @Autowired
    private ServicioEmpresa servicioEmpresa;


    @GetMapping("/empresas")
    public String consultarEmpresas(Model model){
        model.addAttribute("empresas", servicioEmpresa.consultarTodas());
        return "empresas";
    }
/*
    @CrossOrigin
    @GetMapping("/empresas/{id}")
    public String consultarUnaEmpresa(@PathVariable int id){
        return servicioEmpresa.consultarUna(id);
    }

    @CrossOrigin
    @DeleteMapping("/empresas/{id}")
    public String eliminarUnaEmpresa(@PathVariable int id){
        servicioEmpresa.eliminar(id);
        return "Empresa con id: "+id+" borrada";
    }

    @CrossOrigin
    @PostMapping("/empresas")
    public String crearEmpresas(@RequestBody Empresa empresa){
        servicioEmpresa.crear(empresa);
        return "Empresa creada";
    }

    @CrossOrigin
    @PatchMapping("/empresas/{id}")
    public String actualizarUnaEmpresa(@PathVariable int id, @RequestBody Empresa empresa){
        servicioEmpresa.actualizar(id, empresa);
        return "Empresa actualizada";
    }

 */
}
