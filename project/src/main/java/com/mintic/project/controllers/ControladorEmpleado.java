package com.mintic.project.controllers;


import com.mintic.project.models.Empleado;
import com.mintic.project.models.Empresa;
import com.mintic.project.services.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class ControladorEmpleado {

    @Autowired
    private ServicioEmpleado servicioEmpleado;


    @GetMapping("/empleados")
    public String consultarEmpleados(Model model) {
        Empleado empleado = new Empleado();
        model.addAttribute("empleado", empleado);
        model.addAttribute("empleados", servicioEmpleado.consultarTodas());
        return "empleados";
    }

    @PostMapping("/empleados")
    public RedirectView crearEmpleado(@ModelAttribute("empleado") Empleado empleado){
        servicioEmpleado.crear(empleado);
        return new RedirectView("/empleados");
    }
}
