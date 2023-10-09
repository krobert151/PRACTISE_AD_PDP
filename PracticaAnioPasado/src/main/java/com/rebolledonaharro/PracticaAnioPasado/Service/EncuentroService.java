package com.rebolledonaharro.PracticaAnioPasado.Service;

import com.rebolledonaharro.PracticaAnioPasado.DTO.EncuentroDTO;
import com.rebolledonaharro.PracticaAnioPasado.DTO.EncuentroDetalladoDTO;
import com.rebolledonaharro.PracticaAnioPasado.Modal.Encuentro;
import com.rebolledonaharro.PracticaAnioPasado.Modal.Especie;
import com.rebolledonaharro.PracticaAnioPasado.Repository.EncuentroRepository;
import com.rebolledonaharro.PracticaAnioPasado.Repository.EspecieRepository;
import com.rebolledonaharro.PracticaAnioPasado.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EncuentroService {

    private final EncuentroRepository encuentroRepository;
    private final EspecieRepository especieRepository;
    private final UsuarioRepository usuarioRepository;

    public Encuentro saveShort(EncuentroDTO encuentroDTO){

        return encuentroRepository.save(
                Encuentro.builder()
                        .id(encuentroDTO.id())
                        .especie(especieRepository.findAll().stream()
                                .filter(
                                        x-> x.getNombre().equalsIgnoreCase(encuentroDTO.nombreEsp()))
                                .findFirst()
                                .orElse(null))
                        .usuario(usuarioRepository.findAll().stream()
                                .filter(
                                        x->x.getNombre().equalsIgnoreCase(encuentroDTO.nombreUsuario())
                                ).findFirst().orElse(null))
                        .descripcion(encuentroDTO.detalles())
                        .build()
        );
    }

    public Encuentro saveLong(EncuentroDetalladoDTO encuentroDetalladoDTO){

        return encuentroRepository.save(
                Encuentro.builder()
                        .id(encuentroDetalladoDTO.id())
                        .especie(especieRepository.findAll().stream()
                                .filter(x->x.getNombre().equalsIgnoreCase(encuentroDetalladoDTO.nombreEsp()))
                                .findFirst()
                                .orElse(null))
                        .usuario(usuarioRepository.findAll().stream()
                                .filter(x->x.getNombre().equalsIgnoreCase(encuentroDetalladoDTO.nombreUsuario()))
                                .findAny()
                                .orElse(null))
                        .tamanio(encuentroDetalladoDTO.tamanio())
                        .peso(encuentroDetalladoDTO.peso())
                        .build()
        );

    }


}
