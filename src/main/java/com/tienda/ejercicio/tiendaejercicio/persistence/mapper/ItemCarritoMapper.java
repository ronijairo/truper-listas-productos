package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.ItemCarritoDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.ItemCarrito;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ItemCarritoMapper {
	
	ItemCarritoMapper INSTANCE = Mappers.getMapper(ItemCarritoMapper.class);
    ItemCarrito toEntity(ItemCarritoDto clienteDto);
    ItemCarritoDto toDto(ItemCarrito cliente);

}
