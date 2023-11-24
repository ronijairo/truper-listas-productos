package com.tienda.ejercicio.tiendaejercicio.web.config;

import com.tienda.ejercicio.tiendaejercicio.persistence.crud.StoreJpaRepository;
import com.tienda.ejercicio.tiendaejercicio.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Configuration
public class LoadDatabase {
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	  @Bean
	  CommandLineRunner initDatabase(StoreJpaRepository repository) {

	    return args -> {
	    	String id =  java.util.UUID.randomUUID().toString();

			Date date = Utils.getDateSystem();
	    	log.info("uuid :" + id + " Date: "+ date);
			List<Producto> productos = new ArrayList<Producto>();
			productos.add(new Producto(1,"999923","Esto es una descipcion", true));
			productos.add(new Producto(2,"9999rg23","Esto es una descipcion", true));

			Cliente clientes = new Cliente(1,"710020", true);

			log.info("Preloading ");
	    };
	  }

}
