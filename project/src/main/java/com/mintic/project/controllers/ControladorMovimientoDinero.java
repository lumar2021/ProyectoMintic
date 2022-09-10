package com.mintic.project.controllers;


import com.mintic.project.models.Empresa;
import com.mintic.project.models.MovimientoDinero;
import com.mintic.project.services.ServicioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ControladorMovimientoDinero {

    @Autowired
    private ServicioMovimientoDinero servicioMovimientoDinero;

    @CrossOrigin
    @GetMapping("/empresas/{id}/movimientos")
    public String consultarMovimientos(@PathVariable int id) {
        return servicioMovimientoDinero.consultarTodosPorIdEmpresa(id);
    }

    @CrossOrigin
    @GetMapping("/empresas/{id}/movimientos/{id2}")
    public String consultarUnMov(@PathVariable int id,@PathVariable int id2){
        return servicioMovimientoDinero.consultarUno(id2);
    }

    @CrossOrigin
    @DeleteMapping("/empresas/{id}/movimientos/{id2}")
    public String eliminarUnMov(@PathVariable int id,@PathVariable int id2){
        servicioMovimientoDinero.eliminar(id2);
        return "Movimiento con id: "+id2+" borrado";
    }

    @CrossOrigin
    @PostMapping("/empresas/{id}/movimientos")
    public String crearUnMov(@PathVariable int id, @RequestBody MovimientoDinero movimientoDinero){
        servicioMovimientoDinero.crear(id, movimientoDinero);
        return "Movimiento creado";
    }

    @CrossOrigin
    @PatchMapping("/empresas/{id}/movimientos/{id2}")
    public String actualizarUnMov(@PathVariable int id, @PathVariable int id2, @RequestBody MovimientoDinero movimientoDinero){
        servicioMovimientoDinero.actualizar(id, id2, movimientoDinero);
        return "Movimiento actualizado";
    }

}
