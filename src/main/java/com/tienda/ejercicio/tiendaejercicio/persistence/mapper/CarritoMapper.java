package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.CarritoDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Carrito;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarritoMapper {
	CarritoMapper INSTANCE = Mappers.getMapper(CarritoMapper.class);
    Carrito toEntity(CarritoDto clienteDto);
    CarritoDto toDto(Carrito cliente);
}
