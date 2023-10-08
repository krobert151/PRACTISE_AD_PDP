package com.rebolledonaharro.PracticaAnioPasado.Repository;

import com.rebolledonaharro.PracticaAnioPasado.Modal.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
