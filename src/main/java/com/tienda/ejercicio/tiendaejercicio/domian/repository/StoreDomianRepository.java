package com.tienda.ejercicio.tiendaejercicio.domian.repository;

import java.util.List;

public interface StoreDomianRepository {

    List<ListaCompraDto> save(List<ListaCompraDto> buy);
    List<ListaCompraDto> getListBuysByClient(int clientId);
    List<ListaCompraDto> updateBuys(List<ListaCompraDto> buysLists);
    boolean deleteBuysList(int buysListId);


}
