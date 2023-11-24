package com.tienda.ejercicio.tiendaejercicio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item_carrito")
public class ItemCarrito {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne
	    @JoinColumn(name = "carrito_id")
	    private Carrito carrito;

	    @ManyToOne
	    @JoinColumn(name = "producto_id")
	    private Producto producto;

	    private int cantidad;
	    private double precio;

}
