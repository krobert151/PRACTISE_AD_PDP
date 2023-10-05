package com.rebolledoroberto.Practise02;

import Modal.Producto;
import Repository.ProductoRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {


    private final ProductoRepo productoRepo;

    @PostConstruct
    public void init(){

        productoRepo.save(
                 Producto.builder()
                         .id(1L)
                         .nombre("Manzana")
                         .precio(2)
                         .build()
        );


    }

}
