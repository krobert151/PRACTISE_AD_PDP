package com.rebolledonaharro.EjemploRestDtoJsonView.Modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grafica {
    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @OneToMany
    private List<Computadora> computadoras;

}
