package com.tienda.ejercicio.tiendaejercicio.domian.repository;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.ProductoDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.crud.ProductJpaRepository;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Producto;
import com.tienda.ejercicio.tiendaejercicio.persistence.mapper.ProductoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final ProductJpaRepository productoRepository;
	
	private final ProductoMapper productoMapper;

	

	public List<ProductoDto> obtenerTodosLosProductos() {
        List<Producto> productos = productoRepository.findAll();
        return productos.stream()
                       .map(productoMapper::toDto)
                       .collect(Collectors.toList());
    }

    public ProductoDto obtenerProductoPorId(Long id) {
        Producto producto = productoRepository.findById(id)
                                             .orElseThrow(() -> new NoSuchElementException("Producto no encontrado"));
        return productoMapper.toDto(producto);
    }

    public ProductoDto crearProducto(ProductoDto productoDTO) {
        Producto producto = productoMapper.toEntity(productoDTO);
        Producto productoGuardado = productoRepository.save(producto);
        return productoMapper.toDto(productoGuardado);
    }

	public ProductoDto actualizarProducto(Long id, ProductoDto productoDTO) {
		Producto productoExistente = productoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Producto no encontrado"));

       
        productoExistente.setDescripcion(productoDTO.getDescripcion());


        Producto productoActualizado = productoRepository.save(productoExistente);
        return productoMapper.toDto(productoActualizado);
	}

	public void eliminarProducto(Long id) {
		 productoRepository.deleteById(id);
		
	}
}
