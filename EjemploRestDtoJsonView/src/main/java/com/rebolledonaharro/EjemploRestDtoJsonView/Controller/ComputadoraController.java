package com.rebolledonaharro.EjemploRestDtoJsonView.Controller;

import com.rebolledonaharro.EjemploRestDtoJsonView.DTO.GETSimpleInfoDTO;
import com.rebolledonaharro.EjemploRestDtoJsonView.Modal.Computadora;
import com.rebolledonaharro.EjemploRestDtoJsonView.Repository.ComputadoraRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/computadora")
public class ComputadoraController {

    private final ComputadoraRepository computadoraRepository;

    @GetMapping("/")
    public ResponseEntity<List<GETSimpleInfoDTO>> findAllSimple(){

        List<Computadora> computadoras = computadoraRepository.findAll();

        if(computadoras.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.ok(computadoras.stream().map(GETSimpleInfoDTO::of).toList());

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findByIdSimple(@PathVariable Long id){
        return ResponseEntity.of(computadoraRepository.findById(id).map(GETSimpleInfoDTO::of));
    }

    @PostMapping("/")
    public ResponseEntity<GETSimpleInfoDTO> newCompu(@RequestBody GETSimpleInfoDTO getSimpleInfoDTO){

    }


}
