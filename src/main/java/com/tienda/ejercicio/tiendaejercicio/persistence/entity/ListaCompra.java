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
@Table(name = "Lista_compra")
public class ListaCompra {

    @EmbeddedId
    private ListaCompraId id;

    @MapsId("customerId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Cliente customer;

    @Column(name = "nombre", length = 45)
    private String nombre;

    @Column(name = "fecha_registro", length = 45)
    private String fechaRegistro;

    @Column(name = "fecha_actualizacion", length = 45)
    private String fechaActualizacion;

    @Column(name = "activo")
    private Boolean activo;

}