package com.tienda.ejercicio.tiendaejercicio.persistence.mapper;

import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Cliente;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ClienteMapper {
    Cliente toEntity(ClienteDto clienteDto);

    ClienteDto toDto(Cliente cliente);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Cliente partialUpdate(ClienteDto clienteDto, @MappingTarget Cliente cliente);
}