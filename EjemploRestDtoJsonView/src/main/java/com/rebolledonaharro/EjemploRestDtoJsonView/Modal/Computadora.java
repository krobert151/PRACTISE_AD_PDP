package com.rebolledonaharro.EjemploRestDtoJsonView.Modal;

import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Computadora")
public class Computadora {

    @Id
    @GeneratedValue
    private Long id;

    private String cpu;

    private double ram;

    private double hdd;

    @ManyToOne
    private Grafica grafica;

}
