package com.tienda.ejercicio.tiendaejercicio.web.controller;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.ClienteDto;
import com.tienda.ejercicio.tiendaejercicio.domian.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClienteService clienteService;


    @GetMapping
    public ResponseEntity<List<ClienteDto>> obtenerTodosLosClientes() {
        List<ClienteDto> clientes = clienteService.obtenerTodosLosClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> obtenerClientePorId(@PathVariable Long id) {
        ClienteDto cliente = clienteService.obtenerClientePorId(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<ClienteDto> crearCliente(@RequestBody ClienteDto ClienteDto) {
        ClienteDto nuevoCliente = clienteService.crearCliente(ClienteDto);
        return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ClienteDto> actualizarCliente(@PathVariable Long id, @RequestBody ClienteDto ClienteDto) {
        ClienteDto clienteActualizado = clienteService.actualizarCliente(id, ClienteDto);
        return new ResponseEntity<>(clienteActualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable Long id) {
        clienteService.eliminarCliente(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
