package com.tienda.ejercicio.tiendaejercicio.persistence.crud;

import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Producto, Long> {
}
