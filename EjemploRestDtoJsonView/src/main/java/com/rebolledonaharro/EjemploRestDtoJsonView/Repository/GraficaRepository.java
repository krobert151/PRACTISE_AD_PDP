package com.rebolledonaharro.EjemploRestDtoJsonView.Repository;

import com.rebolledonaharro.EjemploRestDtoJsonView.Modal.Grafica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraficaRepository extends JpaRepository<Grafica,Long> {
}
