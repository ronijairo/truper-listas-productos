package com.tienda.ejercicio.tiendaejercicio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ListaCompraDetalleId implements Serializable {
    private static final long serialVersionUID = 3375647136893656807L;
    @Column(name = "idCodigoProducto", nullable = false)
    private Integer idCodigoProducto;

    @Column(name = "idLista", nullable = false)
    private Integer idLista;

    @Column(name = "Lista_compra_customer_id", nullable = false)
    private Integer listaCompraCustomerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ListaCompraDetalleId entity = (ListaCompraDetalleId) o;
        return Objects.equals(this.idCodigoProducto, entity.idCodigoProducto) &&
                Objects.equals(this.listaCompraCustomerId, entity.listaCompraCustomerId) &&
                Objects.equals(this.idLista, entity.idLista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCodigoProducto, listaCompraCustomerId, idLista);
    }

}