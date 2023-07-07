package com.jhons.myapp.respository;

import com.jhons.myapp.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepo extends JpaRepository<Pedido,Long> {
    //esta clase sera intanciado por el servicio
}
