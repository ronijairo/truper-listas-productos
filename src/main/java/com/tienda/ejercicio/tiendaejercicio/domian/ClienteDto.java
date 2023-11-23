package com.tienda.ejercicio.tiendaejercicio.domian;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.tienda.ejercicio.tiendaejercicio.persistence.entity.Cliente}
 */
@Value
@Setter
@Getter
public class ClienteDto implements Serializable {
    Integer id;
    String nombre;
    Boolean activo;
}