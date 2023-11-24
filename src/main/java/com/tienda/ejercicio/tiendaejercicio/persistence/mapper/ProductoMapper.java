package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.ProductoDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
	
	ProductoMapper INSTANCE = Mappers.getMapper(ProductoMapper.class);
    Producto toEntity(ProductoDto productoDto);
    ProductoDto toDto(Producto producto);


}