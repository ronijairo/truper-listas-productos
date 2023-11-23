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
public class ListaCompraId implements Serializable {
    private static final long serialVersionUID = 2379814575265018543L;
    @Column(name = "idLista", nullable = false)
    private Integer idLista;

    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ListaCompraId entity = (ListaCompraId) o;
        return Objects.equals(this.customerId, entity.customerId) &&
                Objects.equals(this.idLista, entity.idLista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, idLista);
    }

}