package com.jhons.myapp.service;




import com.jhons.myapp.entity.Pedido;

import java.util.List;

public interface PedidoInterface {

    //esta clase son metodos que devemos implementar en el service

    List<Pedido> obtenerPedido();
    Pedido obtenerPorId(Long id);

    void guardarPedido(Pedido pedido);

    void actualizarPedidos(Pedido pedido);

    void eliminarPedido(Long id);
}

