package com.jhons.myapp.controller;


import com.jhons.myapp.entity.Empleado;
import com.jhons.myapp.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> obtenerTodos(){
        return empleadoService.obtenerEmpleado();
    }

    @GetMapping("/{id}")
    public Empleado obtenerPorId(Long id){
        return empleadoService.obtenerPorId(id);
    }

    @PostMapping
    public void guardarCliente(Empleado empleado){
        empleadoService.guardarEmpleado(empleado);
    }

    @PutMapping("/{id}")
    public void actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado empleado){
        Empleado empleadoActual = empleadoService.obtenerPorId(id);

        if(empleadoActual != null){
            empleadoActual.setNombre(empleado.getNombre());
            empleadoActual.setCargo(empleado.getCargo());
            empleadoActual.setSalario(empleado.getSalario());
            empleadoActual.setHorarioTrabajo(empleado.getHorarioTrabajo());
            empleadoService.actualizarEmpleado(empleadoActual);
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarEmpleado(@PathVariable Long id){
        empleadoService.eliminarEmpleado(id);
    }



}
