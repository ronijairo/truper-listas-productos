package com.tienda.ejercicio.tiendaejercicio.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.tienda.ejercicio.tiendaejercicio.persistence.entity.ListaCompraDetalleId}
 */
@Value
@Setter
@Getter
public class ListaCompraDetalleIdDto implements Serializable {
    Integer idCodigoProducto;
    Integer idLista;
    Integer listaCompraCustomerId;
}