package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.persistence.entity.ListaCompra;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ListaCompraMapper {
    ListaCompra toEntity(ListaCompraDto listaCompraDto);

    ListaCompraDto toDto(ListaCompra listaCompra);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ListaCompra partialUpdate(ListaCompraDto listaCompraDto, @MappingTarget ListaCompra listaCompra);
}