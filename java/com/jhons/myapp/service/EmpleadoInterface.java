package com.jhons.myapp.service;

import com.jhons.myapp.entity.Empleado;

import java.util.List;

public interface EmpleadoInterface {

    //este  metodos devemos implentar en la clase service
    List<Empleado> obtenerEmpleado();
    Empleado obtenerPorId(Long id);

    void guardarEmpleado(Empleado empleado);

    void actualizarEmpleado(Empleado empleado);

    void eliminarEmpleado(Long id);
}

