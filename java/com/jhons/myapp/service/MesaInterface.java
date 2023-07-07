package com.jhons.myapp.service;


import com.jhons.myapp.entity.Mesa;

import java.util.List;

public interface MesaInterface {

    //esta clase devemos implementar los metodoso en el sercice

    List<Mesa> obtenerMesa();
    Mesa obtenerPorId(Long id);

    void guardarMesa(Mesa mesa);

    void actualizarMesa(Mesa mesa);

    void eliminarMesa(Long id);
}

