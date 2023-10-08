package com.rebolledonaharro.PracticaAnioPasado.DTO;

import com.rebolledonaharro.PracticaAnioPasado.Modal.Encuentro;

public record EncuentroDetalladoDTO (
        Long id,
        String nombreEsp,

        String nombreUsuario,

        String correo,

        String fotoPerfil,

        String detalles,

        double peso,

        double tamanio

){

    public static EncuentroDetalladoDTO of(Encuentro e){
        return new EncuentroDetalladoDTO(
                e.getId(),
                e.getEspecie().getNombre(),
                e.getUsuario().getNombre(),
                e.getUsuario().getCorreo(),
                e.getUsuario().getFotoPerfil(),
                e.getEspecie().getDetalles(),
                e.getPeso(),
                e.getTamanio()
        );
    }


}
