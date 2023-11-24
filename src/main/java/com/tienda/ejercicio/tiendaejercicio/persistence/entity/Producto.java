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
@Table(name = "Productos")
public class Producto {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "clave", length = 45)
    private String clave;

    @Column(name = "descripcion", length = 150)
    private String descripcion;
    
    @Column(name = "precio")
    private double precio;

    @Column(name = "activo")
    private Boolean activo;

}