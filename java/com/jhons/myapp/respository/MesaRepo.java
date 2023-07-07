package com.jhons.myapp.respository;

import com.jhons.myapp.entity.Mesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepo extends JpaRepository<Mesa,Long> {
    //este espacio se usara en el sevice
}
