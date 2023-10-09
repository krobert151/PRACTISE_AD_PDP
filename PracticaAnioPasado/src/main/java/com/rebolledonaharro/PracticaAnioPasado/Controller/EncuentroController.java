package com.rebolledonaharro.PracticaAnioPasado.Controller;

import com.rebolledonaharro.PracticaAnioPasado.DTO.EncuentroDTO;
import com.rebolledonaharro.PracticaAnioPasado.Modal.Encuentro;
import com.rebolledonaharro.PracticaAnioPasado.Modal.Usuario;
import com.rebolledonaharro.PracticaAnioPasado.Repository.EncuentroRepository;
import com.rebolledonaharro.PracticaAnioPasado.Repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/encuentros/")
public class EncuentroController {

    private final EncuentroRepository encuentroRepository;
    private final UsuarioRepository usuarioRepository;

    @GetMapping("/short")
    public ResponseEntity<List<EncuentroDTO>> findAll(){

        List<Encuentro> listaEncuentro = encuentroRepository.findAll();

        if(listaEncuentro.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(
                listaEncuentro.stream().map(EncuentroDTO::of).toList()
        );

    }

    @GetMapping("/long")
    public ResponseEntity<List<EncuentroDTO>> findAllDetail(){
        List<Encuentro> listaEncuentros = encuentroRepository.findAll();

        if(listaEncuentros.isEmpty())
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok(
                listaEncuentros.stream().map(EncuentroDTO::of).toList()
        );

    }


    @PostMapping("/short")
    public ResponseEntity<EncuentroDTO> add(@RequestBody EncuentroDTO eDTO){

        return null;
    }


}
