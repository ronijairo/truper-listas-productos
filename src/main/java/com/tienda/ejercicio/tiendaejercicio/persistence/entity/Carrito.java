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
@Table(name = "compras")
public class Carrito {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    @Column(name = "fecha_registro", length = 45)
    private String fechaRegistro;

    @Column(name = "fecha_actualizacion", length = 45)
    private String fechaActualizacion;

    @Column(name = "activo")
    private Boolean activo;

}