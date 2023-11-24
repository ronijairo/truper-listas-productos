package com.tienda.ejercicio.tiendaejercicio.domian.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ClienteDto implements Serializable {
    private static final long serialVersionUID = -3125787119339526823L;
	Integer id;
    String nombre;
    Boolean activo;
}