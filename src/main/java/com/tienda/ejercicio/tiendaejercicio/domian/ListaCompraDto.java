package com.tienda.ejercicio.tiendaejercicio.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.tienda.ejercicio.tiendaejercicio.persistence.entity.ListaCompra}
 */
@Value
@Setter
@Getter
public class ListaCompraDto implements Serializable {
    ListaCompraIdDto id;
    String nombre;
    String fechaRegistro;
    String fechaActualizacion;
    Boolean activo;
}