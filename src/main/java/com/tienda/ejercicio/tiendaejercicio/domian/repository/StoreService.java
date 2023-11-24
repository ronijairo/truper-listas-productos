package com.tienda.ejercicio.tiendaejercicio.domian.repository;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.CarritoDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.crud.CarritoRepository;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Carrito;
import com.tienda.ejercicio.tiendaejercicio.persistence.mapper.CarritoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
public class StoreService {
	@Autowired
    private CarritoRepository carritoRepository;

    public List<CarritoDto> obtenerTodosLosCarritos() {
        List<Carrito> carritos = carritoRepository.findAll();
        return carritos.stream()
                       .map(CarritoMapper.INSTANCE::toDto)
                       .collect(Collectors.toList());
    }

    public CarritoDto obtenerCarritoPorId(Long id) {
        Carrito carrito = carritoRepository.findById(id)
                                           .orElseThrow(() -> new NoSuchElementException("Carrito no encontrado"));
        return CarritoMapper.INSTANCE.toDto(carrito);
    }

    public CarritoDto crearCarrito(CarritoDto carritoDTO) {
        Carrito carrito = CarritoMapper.INSTANCE.toEntity(carritoDTO);
        Carrito carritoGuardado = carritoRepository.save(carrito);
        return CarritoMapper.INSTANCE.toDto(carritoGuardado);
    }

    public CarritoDto actualizarCarrito(Long id, CarritoDto carritoDTO) {
        Carrito carritoExistente = carritoRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Carrito no encontrado"));

        carritoExistente.setFechaActualizacion(carritoDTO.getFechaActualizacion());

        Carrito carritoActualizado = carritoRepository.save(carritoExistente);
        return CarritoMapper.INSTANCE.toDto(carritoActualizado);
    }

    public void eliminarCarrito(Long id) {
        carritoRepository.deleteById(id);
    }

}
