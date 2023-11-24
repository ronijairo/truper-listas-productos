package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.persistence.entity.ListaCompraDetalle;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ListaCompraDetalleMapper {
    ListaCompraDetalle toEntity(ListaCompraDetalleDto listaCompraDetalleDto);

    ListaCompraDetalleDto toDto(ListaCompraDetalle listaCompraDetalle);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    ListaCompraDetalle partialUpdate(ListaCompraDetalleDto listaCompraDetalleDto, @MappingTarget ListaCompraDetalle listaCompraDetalle);
}