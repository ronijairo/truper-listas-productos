package com.tienda.ejercicio.tiendaejercicio.persistence.crud;

import com.tienda.ejercicio.tiendaejercicio.persistence.entity.ListaCompra;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StoreJpaRepository extends JpaRepository<ListaCompra, String> {

}
