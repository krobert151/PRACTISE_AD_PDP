package com.rebolledoroberto.Practise01.DTO;

import com.rebolledoroberto.Practise01.Modal.Alumno;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DTOAumno {

    private Long id;

    private String nombre, apellido,nombreCurso, direccion;

    public static DTOAumno of (Alumno alumno){
        return DTOAumno.builder()
                .id(alumno.getId())
                .nombre(alumno.getNombre())
                .apellido(alumno.getApellidos())
                .nombreCurso(alumno.getCurso().getNombre())
                .direccion(alumno.getDireccion().getCalle())
                .build();
    }

}
