package com.rebolledonaharro.EjemploRestDtoJsonView;

import com.rebolledonaharro.EjemploRestDtoJsonView.Repository.ComputadoraRepository;
import com.rebolledonaharro.EjemploRestDtoJsonView.Repository.GraficaRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    private final ComputadoraRepository computadoraRepository;
    private final GraficaRepository graficaRepository;

    @PostConstruct
    public void init(){

    }

}
