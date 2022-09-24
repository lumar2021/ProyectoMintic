package com.mintic.project.controllers;


import com.mintic.project.models.Empresa;
import com.mintic.project.models.MovimientoDinero;
import com.mintic.project.services.ServicioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class ControladorMovimientoDinero {

    @Autowired
    private ServicioMovimientoDinero servicioMovimientoDinero;
    @GetMapping("/movimientos")
    public String consultarMovimientos(Model model){
        MovimientoDinero movimiento= new MovimientoDinero();
        model.addAttribute("movimiento", movimiento);
        model.addAttribute("movimientos", servicioMovimientoDinero.consultarTodas());
        return "movimientos";
    }

    @PostMapping("/movimientos")
    public RedirectView crearEmpresa(@ModelAttribute("movimiento") MovimientoDinero movimiento){
        servicioMovimientoDinero.crear(movimiento);
        return new RedirectView("/movimientos");
    }

}
