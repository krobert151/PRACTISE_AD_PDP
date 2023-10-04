package com.rebolledoroberto.Practise01.Repository;

import com.rebolledoroberto.Practise01.Modal.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DireccionRepository extends JpaRepository<Direccion,Long> {
}
