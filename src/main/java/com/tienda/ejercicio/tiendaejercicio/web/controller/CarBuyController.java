package com.tienda.ejercicio.tiendaejercicio.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/store")
public class CarBuyController {

    @PostMapping("/busylist")
    public ResponseEntity<Map<String,Object>> saveListBuys(){
        Map<String, Object> jsonResponse = new HashMap<>();
        //jsonResponse.put("result", "") //Implementar el service.
        return (new ResponseEntity<>(jsonResponse, new HttpHeaders(), HttpStatus.OK));
    }


    @GetMapping("/buyslistbyclient")
    public ResponseEntity<Map<String,Object>> getbuysListByClient(){
        Map<String, Object> jsonResponse = new HashMap<>();
        //jsonResponse.put("result", "") //Implementar el service.
        return (new ResponseEntity<>(jsonResponse, new HttpHeaders(), HttpStatus.OK));
    }

    @PutMapping("/updatepricebyclient")
    public ResponseEntity<Map<String, Object>> updatePriceByClient(){
        Map<String, Object> jsonResponse = new HashMap<>();
        //jsonResponse.put("result", "") //Implementar el service.
        return (new ResponseEntity<>(jsonResponse, new HttpHeaders(), HttpStatus.OK));
    }

    @DeleteMapping("/deletebuyList")
    public ResponseEntity<Map<String,Object>> deleteBuyList(){
        Map<String, Object> jsonResponse = new HashMap<>();
        //jsonResponse.put("result", "") //Implementar el service.
        return (new ResponseEntity<>(jsonResponse, new HttpHeaders(), HttpStatus.OK));
    }


}
