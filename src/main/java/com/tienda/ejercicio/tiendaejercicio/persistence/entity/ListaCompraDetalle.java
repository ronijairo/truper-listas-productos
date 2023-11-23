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
@Table(name = "lista_compra_detalle")
public class ListaCompraDetalle {
    @EmbeddedId
    private ListaCompraDetalleId id;

    @MapsId("idCodigoProducto")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idCodigoProducto", nullable = false)
    private Producto idCodigoProducto;

    @MapsId("id")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "idLista", referencedColumnName = "idLista", nullable = false),
            @JoinColumn(name = "Lista_compra_customer_id", referencedColumnName = "customer_id", nullable = false)
    })
    private ListaCompra listaCompra;

    @Column(name = "codigo_producto", length = 45)
    private String codigoProducto;

    @Column(name = "cantidad")
    private Integer cantidad;

}