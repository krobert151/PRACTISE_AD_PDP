package com.rebolledonaharro.PracticaAnioPasado.DTO;

import com.rebolledonaharro.PracticaAnioPasado.Modal.Encuentro;

public record EncuentroDTO(
        Long id,
        String nombreEsp,

        String nombreUsuario,

        String detalles

) {

    public static EncuentroDTO of (Encuentro e){
        return new EncuentroDTO(
                e.getId(),
                e.getEspecie().getNombre(),
                e.getUsuario().getNombre(),
                e.getEspecie().getDetalles()
        );

    }


}
