package com.jhons.myapp.controller;

import com.jhons.myapp.entity.Mesa;
import com.jhons.myapp.service.MesaServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/mesa")
public class MesaController {

    @Autowired
    private MesaServie mesaServie;

    @GetMapping
    public List<Mesa> obtenerTodos(){
        return mesaServie.obtenerMesa();
    }

    @GetMapping("/{id}")
    public Mesa obtenerPorId(Long id){
        return mesaServie.obtenerPorId(id);
    }

    @PostMapping
    public void guardarMesa(Mesa mesa){
        mesaServie.guardarMesa(mesa);
    }

    @PutMapping("/{id}")
    public void actualizarMesa(@PathVariable Long id, @RequestBody Mesa mesa ){
        Mesa mesaActual = mesaServie.obtenerPorId(id);

        if(mesaActual != null){
            mesaActual.setNumeroMesa(mesa.getNumeroMesa());
            mesaActual.setCapacidadMesa(mesa.getCapacidadMesa());
            mesaActual.setEstadoMesa(mesa.getEstadoMesa());

            mesaServie.actualizarMesa(mesaActual);
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarMesa(@PathVariable Long id){
        mesaServie.eliminarMesa(id);
    }
}
