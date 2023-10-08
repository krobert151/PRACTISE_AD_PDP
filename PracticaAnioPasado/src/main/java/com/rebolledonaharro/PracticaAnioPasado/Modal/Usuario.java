package com.rebolledonaharro.PracticaAnioPasado.Modal;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, apellidos, correo, username, password, fotoPerfil;


    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Builder.Default
    @OneToMany(mappedBy = "usuario",
    fetch = FetchType.EAGER,
    cascade = CascadeType.REMOVE,
    orphanRemoval = true)
    private List<Encuentro> encuentros = new ArrayList<>();



}
