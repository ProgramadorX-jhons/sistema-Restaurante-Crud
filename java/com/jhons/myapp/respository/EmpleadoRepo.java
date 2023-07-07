package com.jhons.myapp.respository;

import com.jhons.myapp.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado,Long> {
    //este espacio se usara en el srvice
}
