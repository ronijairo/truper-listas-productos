package com.tienda.ejercicio.tiendaejercicio.web.controller;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.CarritoDto;
import com.tienda.ejercicio.tiendaejercicio.domian.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrito")
public class CarController {
    @Autowired
    private StoreService storeService;


    @GetMapping
    public ResponseEntity<List<CarritoDto>> obtenerTodosLosProductos() {
        List<CarritoDto> carritos = storeService.obtenerTodosLosCarritos();
        return new ResponseEntity<>(carritos, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<CarritoDto> obtenerProductoPorId(@PathVariable Long id) {
        CarritoDto carrito = storeService.obtenerCarritoPorId(id);
        return new ResponseEntity<>(carrito, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<CarritoDto> crearProducto(@RequestBody CarritoDto carritoDTO) {
        CarritoDto nuevoCarrito = storeService.crearCarrito(carritoDTO);
        return new ResponseEntity<>(nuevoCarrito, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<CarritoDto> actualizarProducto(@PathVariable Long id, @RequestBody CarritoDto carritoDto) {
        CarritoDto carritoActualizado = storeService.actualizarCarrito(id, carritoDto);
        return new ResponseEntity<>(carritoActualizado, HttpStatus.OK);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        storeService.eliminarCarrito(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
