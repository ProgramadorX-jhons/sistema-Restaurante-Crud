package com.jhons.myapp.service;

import com.jhons.myapp.entity.Empleado;
import com.jhons.myapp.respository.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService implements  EmpleadoInterface{

    //llamaremos a repositorio
    @Autowired
    private EmpleadoRepo empleadoRepo;
    @Override
    public List<Empleado> obtenerEmpleado() {
        //este  listara los clientes la funcionavilidad
        return this.empleadoRepo.findAll();
    }

    @Override
    public Empleado obtenerPorId(Long id) {
        return empleadoRepo.findById(id).orElse(null);
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        this.empleadoRepo.save(empleado);
    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {
        this.empleadoRepo.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Long id) {
        this.empleadoRepo.deleteById(id);

    }
}
