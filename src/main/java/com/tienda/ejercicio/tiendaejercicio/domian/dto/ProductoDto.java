package com.tienda.ejercicio.tiendaejercicio.domian.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto implements Serializable {
	
	    private static final long serialVersionUID = 1L;
		private Integer id;
	    private String clave;
	    private String descripcion;
	    private double precio;
	    private Boolean activo;
}