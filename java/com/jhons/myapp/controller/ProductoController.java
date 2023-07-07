package com.jhons.myapp.controller;

import com.jhons.myapp.entity.Pedido;
import com.jhons.myapp.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class ProductoController {

    @Autowired
    private PedidoService pedidoService;


    @GetMapping("/{id}")
    public Pedido obtenerPorId(Long id){
        return pedidoService.obtenerPorId(id);
    }

    @PostMapping
    public void guardarMesa(Pedido pedido){
        pedidoService.guardarPedido(pedido);
    }

    @PutMapping("/{id}")
    public void actualizarPedidos(@PathVariable Long id, @RequestBody Pedido pedido ){
        Pedido pedidoActual = pedidoService.obtenerPorId(id);

        if(pedidoActual != null){
            pedidoActual.setnPedido(pedido.getnPedido());
            pedidoActual.setEstadoPedido(pedido.getEstadoPedido());
            pedidoActual.setTotalPedido(pedido.getTotalPedido());
            pedidoActual.setFechaHora(pedido.getFechaHora());

           pedidoActual.actualizarPedidos(pedidoActual);
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarMesa(@PathVariable Long id){
        pedidoService.eliminarPedido(id);
    }

}
