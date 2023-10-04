package com.rebolledoroberto.Practise01.Repository;

import com.rebolledoroberto.Practise01.Modal.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {
}
