package com.tienda.ejercicio.tiendaejercicio.persistence.crud;

import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientJpaRepository extends JpaRepository<Cliente,Integer> {
}
