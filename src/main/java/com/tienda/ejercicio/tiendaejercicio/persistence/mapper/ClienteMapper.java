package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.ClienteDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper( componentModel = "spring")
public interface ClienteMapper {
	ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);
    Cliente toEntity(ClienteDto clienteDto);
    ClienteDto toDto(Cliente cliente);

  
}