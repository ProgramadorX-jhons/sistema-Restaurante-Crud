package com.jhons.myapp.service;

import com.jhons.myapp.entity.Cliente;
import com.jhons.myapp.respository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClienteService implements ClienteInterface {

    @Autowired
    private ClienteRepo clienteRepo;

    @Override
    public List<Cliente> obtenerClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente obtenerPorId(Long id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepo.save(cliente);
    }

    @Override
    public void actualizarCliente(Cliente cliente) {
        clienteRepo.save(cliente);

    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepo.deleteById(id);

    }
}
