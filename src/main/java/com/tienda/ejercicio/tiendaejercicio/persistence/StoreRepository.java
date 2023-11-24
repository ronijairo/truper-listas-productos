package com.tienda.ejercicio.tiendaejercicio.persistence;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StoreRepository implements StoreDomianRepository {

    @Autowired
    private StoreJpaRepository storeJpaRepository;

    @Autowired
    private ListaCompraMapper listaCompraMapper;


    @Override
    public List<ListaCompraDto> save(List<ListaCompraDto> buy) {
        return null;
    }

    @Override
    public List<ListaCompraDto> getListBuysByClient(int clientId) {
        return null;
    }

    @Override
    public List<ListaCompraDto> updateBuys(List<ListaCompraDto> buysLists) {
        return null;
    }

    @Override
    public boolean deleteBuysList(int buysListId) {
        return false;
    }
}
