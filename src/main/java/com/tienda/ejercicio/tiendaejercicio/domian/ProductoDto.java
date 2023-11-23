package com.tienda.ejercicio.tiendaejercicio.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.tienda.ejercicio.tiendaejercicio.persistence.entity.Producto}
 */
@Value
@Setter
@Getter
public class ProductoDto implements Serializable {
    Integer id;
    String clave;
    String descripcion;
    Boolean activo;
}