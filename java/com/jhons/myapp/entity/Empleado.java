package com.jhons.myapp.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Empleado {
    //atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String cargo;
    private String salario;
    private String horarioTrabajo;
    private String historialPedidosAtendidos;

    //las conexiones de base de datos es
    @OneToMany(mappedBy = "empleado")
    List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    //metodos


    public Empleado() {
    }

    //con parametros


    public Empleado(Long id, String nombre, String cargo, String salario, String horarioTrabajo, String historialPedidosAtendidos) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.horarioTrabajo = horarioTrabajo;
        this.historialPedidosAtendidos = historialPedidosAtendidos;
    }

    //getters y setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getHistorialPedidosAtendidos() {
        return historialPedidosAtendidos;
    }

    public void setHistorialPedidosAtendidos(String historialPedidosAtendidos) {
        this.historialPedidosAtendidos = historialPedidosAtendidos;
    }
}
