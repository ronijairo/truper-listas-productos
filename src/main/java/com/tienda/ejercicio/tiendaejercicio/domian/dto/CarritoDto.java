package com.tienda.ejercicio.tiendaejercicio.domian.dto;

import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CarritoDto implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private Cliente cliente;
    private String fechaRegistro;
    private String fechaActualizacion;
    private Boolean activo;

}
