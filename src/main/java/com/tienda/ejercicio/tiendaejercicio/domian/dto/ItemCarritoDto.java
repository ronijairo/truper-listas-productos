package com.tienda.ejercicio.tiendaejercicio.domian.dto;


import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Carrito;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Producto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ItemCarritoDto implements Serializable{

    private static final long serialVersionUID = 1L;
	private Long id;
    private Carrito carrito;
    private Producto producto;
    private int cantidad;
    private double precio;

}
