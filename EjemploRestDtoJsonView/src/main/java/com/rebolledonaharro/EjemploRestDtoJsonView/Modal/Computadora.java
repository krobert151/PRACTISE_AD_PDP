package com.rebolledonaharro.EjemploRestDtoJsonView.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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
