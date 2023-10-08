package com.rebolledonaharro.PracticaAnioPasado.Modal;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "Encuentro")
public class Encuentro {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_encuentro_usuario"))
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_encuentro_especie"))
    private Especie especie;

    private String descripcion, foto, zona;

    private double tamanio, peso;

    public Encuentro getEncuentro() {

        return this;
    }

}
