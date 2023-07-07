package com.jhons.myapp.service;

import com.jhons.myapp.entity.Pedido;
import com.jhons.myapp.respository.PedidoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements PedidoInterface{

    @Autowired
    private PedidoRepo pedidoRepo;

    @Override
    public List<Pedido> obtenerPedido() {
        return this.pedidoRepo.findAll();
    }

    @Override
    public Pedido obtenerPorId(Long id) {
        return this.pedidoRepo.findById(id).orElse(null);
    }

    @Override
    public void guardarPedido(Pedido pedido) {
        this.pedidoRepo.save(pedido);
    }

    @Override
    public void actualizarPedidos(Pedido pedido) {
        this.pedidoRepo.save(pedido);
    }

    @Override
    public void eliminarPedido(Long id) {
        this.pedidoRepo.deleteById(id);
    }
}
