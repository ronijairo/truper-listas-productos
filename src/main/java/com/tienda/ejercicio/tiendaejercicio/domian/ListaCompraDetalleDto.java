package com.tienda.ejercicio.tiendaejercicio.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.tienda.ejercicio.tiendaejercicio.persistence.entity.ListaCompraDetalle}
 */
@Value
@Setter
@Getter
public class ListaCompraDetalleDto implements Serializable {
    ListaCompraDetalleIdDto id;
    String codigoProducto;
    Integer cantidad;
}