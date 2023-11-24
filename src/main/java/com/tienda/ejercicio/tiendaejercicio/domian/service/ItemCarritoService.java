package com.tienda.ejercicio.tiendaejercicio.domian.service;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.ItemCarritoDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.crud.ItemCarritoRepository;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.ItemCarrito;
import com.tienda.ejercicio.tiendaejercicio.persistence.mapper.ItemCarritoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ItemCarritoService {
	
	   
	    private final ItemCarritoRepository itemCarritoRepository;

	    
	    private final ItemCarritoMapper itemCarritoMapper;

	    public List<ItemCarritoDto> obtenerTodosLosItemsCarrito() {
	        List<ItemCarrito> itemsCarrito = itemCarritoRepository.findAll();
	        return itemsCarrito.stream()
	                      .map(itemCarritoMapper::toDto)
	                      .collect(Collectors.toList());
	    }

	    public ItemCarritoDto obtenerItemCarritoPorId(Long id) {
	        ItemCarrito itemCarrito = itemCarritoRepository.findById(id)
	                .orElseThrow(() -> new NoSuchElementException("Item de carrito no encontrado"));
	        return itemCarritoMapper.toDto(itemCarrito);
	    }

	    public ItemCarritoDto crearItemCarrito(ItemCarritoDto ItemCarritoDto) {
	        ItemCarrito itemCarrito = itemCarritoMapper.toEntity(ItemCarritoDto);
	        ItemCarrito itemCarritoGuardado = itemCarritoRepository.save(itemCarrito);
	        return itemCarritoMapper.toDto(itemCarritoGuardado);
	    }

	    public ItemCarritoDto actualizarItemCarrito(Long id, ItemCarritoDto ItemCarritoDto) {
	        ItemCarrito itemCarritoExistente = itemCarritoRepository.findById(id)
	                .orElseThrow(() -> new NoSuchElementException("Item de carrito no encontrado"));


	        ItemCarrito itemCarritoActualizado = itemCarritoRepository.save(itemCarritoExistente);
	        return itemCarritoMapper.toDto(itemCarritoActualizado);
	    }

	    public void eliminarItemCarrito(Long id) {
	        itemCarritoRepository.deleteById(id);
	    }

}
