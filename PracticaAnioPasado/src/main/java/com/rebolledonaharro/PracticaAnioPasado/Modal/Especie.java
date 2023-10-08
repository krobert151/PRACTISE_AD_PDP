package com.rebolledonaharro.PracticaAnioPasado.Modal;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@Table(name = "Especie")
@NoArgsConstructor
@Builder
public class Especie {

    @Id
    @GeneratedValue
    public Long id;

    private String nombre,descripcion,detalles,urlFoto;


    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Builder.Default
    @OneToMany(
            mappedBy = "especie",
            fetch = FetchType.EAGER,
            cascade = CascadeType.REMOVE,
            orphanRemoval = true
    )
    private List<Encuentro>encuentro = new ArrayList<>();

}
