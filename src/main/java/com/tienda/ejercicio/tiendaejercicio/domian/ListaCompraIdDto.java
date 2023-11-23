package com.tienda.ejercicio.tiendaejercicio.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.tienda.ejercicio.tiendaejercicio.persistence.entity.ListaCompraId}
 */
@Value
@Setter
@Getter
public class ListaCompraIdDto implements Serializable {
    Integer idLista;
    Integer customerId;
}