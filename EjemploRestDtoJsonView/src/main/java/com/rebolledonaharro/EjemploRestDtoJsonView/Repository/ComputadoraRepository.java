package com.rebolledonaharro.EjemploRestDtoJsonView.Repository;

import com.rebolledonaharro.EjemploRestDtoJsonView.Modal.Computadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputadoraRepository extends JpaRepository<Computadora,Long> {
}
