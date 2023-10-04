package com.rebolledoroberto.Practise01.Controller;

import com.rebolledoroberto.Practise01.DTO.DTOAumno;
import com.rebolledoroberto.Practise01.Modal.Alumno;
import com.rebolledoroberto.Practise01.Repository.AlumnoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final AlumnoRepository alumnoRepository;

    @GetMapping("/")
    public ResponseEntity<List<DTOAumno>> findAll(){

        List<Alumno> lista = alumnoRepository.findAll();

        if(lista.isEmpty())
            return ResponseEntity.notFound().build();

        List<DTOAumno> result = lista.stream().map(DTOAumno::of).toList();

        return ResponseEntity.ok(result);



    }

}
