package com.tienda.ejercicio.tiendaejercicio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Productos")
public class Producto {
    @Id
    @Column(name = "idProducto", nullable = false)
    private Integer id;

    @Column(name = "clave", length = 45)
    private String clave;

    @Column(name = "descripcion", length = 150)
    private String descripcion;

    @Column(name = "activo")
    private Boolean activo;

}