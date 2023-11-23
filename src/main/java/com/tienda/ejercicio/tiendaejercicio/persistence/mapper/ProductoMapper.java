package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.domian.ProductoDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Producto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductoMapper {
    Producto toEntity(ProductoDto productoDto);

    ProductoDto toDto(Producto producto);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Producto partialUpdate(ProductoDto productoDto, @MappingTarget Producto producto);
}