package com.tienda.ejercicio.tiendaejercicio.domian.service;

import com.tienda.ejercicio.tiendaejercicio.domian.dto.ClienteDto;
import com.tienda.ejercicio.tiendaejercicio.persistence.crud.ClientJpaRepository;
import com.tienda.ejercicio.tiendaejercicio.persistence.entity.Cliente;
import com.tienda.ejercicio.tiendaejercicio.persistence.mapper.ClienteMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ClienteService {
	
	 private final ClientJpaRepository clienteRepository;
	 
	 private final ClienteMapper clienteMapper;
	
	 public List<ClienteDto> obtenerTodosLosClientes() {
	        List<Cliente> clientes = clienteRepository.findAll();
	        return clientes.stream()
	                      .map(clienteMapper::toDto)
	                      .collect(Collectors.toList());
	    }

	    public ClienteDto obtenerClientePorId(Long id) {
	        Cliente cliente = clienteRepository.findById(id)
	                                          .orElseThrow(() -> new NoSuchElementException("Cliente no encontrado"));
	        return clienteMapper.toDto(cliente);
	    }

	    public ClienteDto crearCliente(ClienteDto clienteDTO) {
	        Cliente cliente = clienteMapper.toEntity(clienteDTO);
	        Cliente clienteGuardado = clienteRepository.save(cliente);
	        return clienteMapper.toDto(clienteGuardado);
	    }

	    public ClienteDto actualizarCliente(Long id, ClienteDto clienteDTO) {
	        Cliente clienteExistente = clienteRepository.findById(id)
	                .orElseThrow(() -> new NoSuchElementException("Cliente no encontrado"));

	        clienteExistente.setNombre(clienteDTO.getNombre());       

	        Cliente clienteActualizado = clienteRepository.save(clienteExistente);
	        return clienteMapper.toDto(clienteActualizado);
	    }

	    public void eliminarCliente(Long id) {
	        clienteRepository.deleteById(id);
	    }

}
