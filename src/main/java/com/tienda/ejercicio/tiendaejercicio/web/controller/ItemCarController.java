package com.tienda.ejercicio.tiendaejercicio.web.controller;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.ItemCarritoDto;
import com.tienda.ejercicio.tiendaejercicio.domian.service.ItemCarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemCarController {


    @Autowired
    private ItemCarritoService itemCarritoService;


    @GetMapping("obtenerListaCompras")
    public ResponseEntity<List<ItemCarritoDto>> obtenerTodosLosItemsCarrito() {
        List<ItemCarritoDto> itemsCarrito = itemCarritoService.obtenerTodosLosItemsCarrito();
        return new ResponseEntity<>(itemsCarrito, HttpStatus.OK);
    }


    @GetMapping("obtenerListaCompraId/{id}")
    public ResponseEntity<ItemCarritoDto> obtenerItemCarritoPorId(@PathVariable Long id) {
        ItemCarritoDto itemCarrito = itemCarritoService.obtenerItemCarritoPorId(id);
        return new ResponseEntity<>(itemCarrito, HttpStatus.OK);
    }


    @PostMapping("guardarListaCompra")
    public ResponseEntity<ItemCarritoDto> crearItemCarrito(@RequestBody ItemCarritoDto ItemCarritoDto) {
        ItemCarritoDto nuevoItemCarrito = itemCarritoService.crearItemCarrito(ItemCarritoDto);
        return new ResponseEntity<>(nuevoItemCarrito, HttpStatus.CREATED);
    }


    @PutMapping("actualizarListaCompra/{id}")
    public ResponseEntity<ItemCarritoDto> actualizarItemCarrito(@PathVariable Long id, @RequestBody ItemCarritoDto ItemCarritoDto) {
        ItemCarritoDto itemCarritoActualizado = itemCarritoService.actualizarItemCarrito(id, ItemCarritoDto);
        return new ResponseEntity<>(itemCarritoActualizado, HttpStatus.OK);
    }


    @DeleteMapping("eliminarListaCompra/{id}")
    public ResponseEntity<Void> eliminarItemCarrito(@PathVariable Long id) {
        itemCarritoService.eliminarItemCarrito(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
