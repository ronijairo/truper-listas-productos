package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.domian.ListaCompraDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.ListaCompra;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ListaCompraMapper {
    ListaCompra toEntity(ListaCompraDto listaCompraDto);

    ListaCompraDto toDto(ListaCompra listaCompra);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ListaCompra partialUpdate(ListaCompraDto listaCompraDto, @MappingTarget ListaCompra listaCompra);
}