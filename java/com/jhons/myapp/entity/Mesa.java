package com.jhons.myapp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mesa {

    //atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroMesa;
    private String capacidadMesa;
    private String estadoMesa;

    //metod de union d ebase de datos en tablas en postgre
    @OneToMany(mappedBy = "mesa")
    List<Pedido> pedidos;

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    //metodos

    public Mesa() {
    }
    //con parametros


    public Mesa(Long id, String numeroMesa, String capacidadMesa, String estadoMesa) {
        this.id = id;
        this.numeroMesa = numeroMesa;
        this.capacidadMesa = capacidadMesa;
        this.estadoMesa = estadoMesa;
    }

    //getters y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getCapacidadMesa() {
        return capacidadMesa;
    }

    public void setCapacidadMesa(String capacidadMesa) {
        this.capacidadMesa = capacidadMesa;
    }

    public String getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(String estadoMesa) {
        this.estadoMesa = estadoMesa;
    }
}
