package com.tienda.ejercicio.tiendaejercicio.domian.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthenticationRequest {
    private String username;
    private String password;
}
