package com.rebolledoroberto.Practise01.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, apellidos;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Direccion direccion;

}
