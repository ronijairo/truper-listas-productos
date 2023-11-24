package com.tienda.ejercicio.tiendaejercicio.persistence.crud;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Producto, Integer> {
}
