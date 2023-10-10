package com.rebolledonaharro.EjemploRestDtoJsonView;

import com.rebolledonaharro.EjemploRestDtoJsonView.Modal.Computadora;
import com.rebolledonaharro.EjemploRestDtoJsonView.Modal.Grafica;
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

        Grafica g1 = new Grafica().builder()
                .id(1L)
                .nombre("Grafica potente 1")
                .build();
        graficaRepository.save(g1);

        Grafica g2 = new Grafica().builder()
                .id(2L)
                .nombre("Grafica potente 2")
                .build();
        graficaRepository.save(g2);

        Grafica g3 = new Grafica().builder()
                .id(3L)
                .nombre("Grafica potente 3")
                .build();
        graficaRepository.save(g3);

        Grafica g4 = new Grafica().builder()
                .id(4L)
                .nombre("Grafica potente 4")
                .build();
        graficaRepository.save(g4);

        Grafica g5 = new Grafica().builder()
                .id(5L)
                .nombre("Grafica potente 5")
                .build();
        graficaRepository.save(g5);

        Grafica g6 = new Grafica().builder()
                .id(6L)
                .nombre("Grafica potente 6")
                .build();
        graficaRepository.save(g6);

        Computadora cmp1 = new Computadora().builder()
                .id(1L)
                .cpu("cpu1")
                .ram(16)
                .hdd(500)
                .grafica(g1)
                .build();
        computadoraRepository.save(cmp1);

        Computadora cmp2 = new Computadora().builder()
                .id(2L)
                .cpu("cpu2")
                .ram(8)
                .hdd(256)
                .grafica(g2)
                .build();
        computadoraRepository.save(cmp2);

        Computadora cmp3 = new Computadora().builder()
                .id(3L)
                .cpu("cpu3")
                .ram(32)
                .hdd(1000)
                .grafica(g3)
                .build();
        computadoraRepository.save(cmp3);

        Computadora cmp4 = new Computadora().builder()
                .id(4L)
                .cpu("cpu4")
                .ram(16)
                .hdd(750)
                .grafica(g4)
                .build();
        computadoraRepository.save(cmp4);

        Computadora cmp5 = new Computadora().builder()
                .id(5L)
                .cpu("cpu5")
                .ram(64)
                .hdd(2000)
                .grafica(g5)
                .build();
        computadoraRepository.save(cmp5);

        Computadora cmp6 = new Computadora().builder()
                .id(6L)
                .cpu("cpu6")
                .ram(32)
                .hdd(1000)
                .grafica(g6)
                .build();
        computadoraRepository.save(cmp6);

        Computadora cmp7 = new Computadora().builder()
                .id(7L)
                .cpu("cpu7")
                .ram(16)
                .hdd(512)
                .grafica(g1) // Reutilizando la gráfica g1
                .build();
        computadoraRepository.save(cmp7);

        Computadora cmp8 = new Computadora().builder()
                .id(8L)
                .cpu("cpu8")
                .ram(32)
                .hdd(1024)
                .grafica(g2) // Reutilizando la gráfica g2
                .build();
        computadoraRepository.save(cmp8);

        Computadora cmp9 = new Computadora().builder()
                .id(9L)
                .cpu("cpu9")
                .ram(8)
                .hdd(256)
                .grafica(g1) // Reutilizando la gráfica g1
                .build();
        computadoraRepository.save(cmp9);

        Computadora cmp10 = new Computadora().builder()
                .id(10L)
                .cpu("cpu10")
                .ram(64)
                .hdd(2000)
                .grafica(g3) // Reutilizando la gráfica g3
                .build();
        computadoraRepository.save(cmp10);

    }

}
