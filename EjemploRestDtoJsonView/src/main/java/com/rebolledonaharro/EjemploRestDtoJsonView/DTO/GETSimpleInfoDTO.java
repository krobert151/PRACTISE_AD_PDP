package com.rebolledonaharro.EjemploRestDtoJsonView.DTO;

import com.rebolledonaharro.EjemploRestDtoJsonView.Modal.Computadora;

public record GETSimpleInfoDTO(
        Long id,
        String nombreCpu,

        String nombreGrafica

        ) {

    public static GETSimpleInfoDTO of(Computadora computadora){

        return new GETSimpleInfoDTO(
                computadora.getId(),
                computadora.getCpu(),
                computadora.getGrafica().getNombre());


    }

}
