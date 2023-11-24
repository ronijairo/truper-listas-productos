package com.tienda.ejercicio.tiendaejercicio.persistence.crud;

import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {

}
