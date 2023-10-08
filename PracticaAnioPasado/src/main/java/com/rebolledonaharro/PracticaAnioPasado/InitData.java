package com.rebolledonaharro.PracticaAnioPasado;

import com.rebolledonaharro.PracticaAnioPasado.Modal.Encuentro;
import com.rebolledonaharro.PracticaAnioPasado.Modal.Especie;
import com.rebolledonaharro.PracticaAnioPasado.Modal.Usuario;
import com.rebolledonaharro.PracticaAnioPasado.Repository.EncuentroRepository;
import com.rebolledonaharro.PracticaAnioPasado.Repository.EspecieRepository;
import com.rebolledonaharro.PracticaAnioPasado.Repository.UsuarioRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitData {

    private final EncuentroRepository encuentroRepository;
    private final UsuarioRepository usuarioRepository;
    private final EspecieRepository especieRepository;

    @PostConstruct
    public void init(){

        Usuario usuario1 = Usuario.builder()
                .id(1L)
                .nombre("Robeto")
                .apellidos("RebolledoNaharro")
                .correo("robertorebolledo151@gmail.com")
                .username("krobert151")
                .password("contrasenia")
                .fotoPerfil("fotoPerfil")
                .build();

        usuarioRepository.save(usuario1);

        Usuario usuario2 = Usuario.builder()
                .id(2L)
                .nombre("Ana")
                .apellidos("García")
                .correo("ana.garcia@example.com")
                .username("ana_g")
                .password("contrasenia123")
                .fotoPerfil("fotoPerfilAna")
                .build();
        usuarioRepository.save(usuario2);

        Usuario usuario3 = Usuario.builder()
                .id(3L)
                .nombre("Carlos")
                .apellidos("Martínez")
                .correo("carlos.m@example.com")
                .username("carlosm")
                .password("contrasenia456")
                .fotoPerfil("fotoPerfilCarlos")
                .build();

        usuarioRepository.save(usuario3);

        Especie especie1 = Especie.builder()
                .id(1L)
                .nombre("Escapatrajo Montes")
                .descripcion("Un escapatrajo molon")
                .detalles("Pica y duele")
                .urlFoto("Foto del escapatrajo")
                .build();

        especieRepository.save(especie1);
        Especie especie2 = Especie.builder()
                .id(2L)
                .nombre("Tigre Siberiano")
                .descripcion("Un majestuoso tigre de Siberia")
                .detalles("Pelaje rayado y ojos intensos")
                .urlFoto("Foto del tigre siberiano")
                .build();

        especieRepository.save(especie2);
        Especie especie3 = Especie.builder()
                .id(3L)
                .nombre("Orquídea Dorada")
                .descripcion("Una flor exótica y rara")
                .detalles("Color dorado y aroma embriagador")
                .urlFoto("Foto de la orquídea dorada")
                .build();
        especieRepository.save(especie3);
        Especie especie4 = Especie.builder()
                .id(4L)
                .nombre("Pez Ángel")
                .descripcion("Un colorido pez de agua salada")
                .detalles("Aletas largas y colores vibrantes")
                .urlFoto("Foto del pez ángel")
                .build();

        especieRepository.save(especie4);
        Especie especie5 = Especie.builder()
                .id(5L)
                .nombre("Elefante Africano")
                .descripcion("El animal terrestre más grande")
                .detalles("Piel gruesa y trompa larga")
                .urlFoto("Foto del elefante africano")
                .build();

        especieRepository.save(especie5);
        Especie especie6 = Especie.builder()
                .id(6L)
                .nombre("Rosa Roja")
                .descripcion("La flor del amor y la pasión")
                .detalles("Pétalos rojos y aroma embriagador")
                .urlFoto("Foto de la rosa roja")
                .build();
        especieRepository.save(especie6);

        Especie especie7 = Especie.builder()
                .id(7L)
                .nombre("León Africano")
                .descripcion("El rey de la selva africana")
                .detalles("Melena majestuosa y rugido poderoso")
                .urlFoto("Foto del león africano")
                .build();
        especieRepository.save(especie7);


        Encuentro encuentro1 = Encuentro.builder()
                .id(1L)
                .usuario(usuario1)
                .especie(especie1)
                .zona("Guillena")
                .peso(3)
                .tamanio(2.9)
                .foto("Foto del bicho suuu")
                .descripcion("Tela de grande")
                .build();

        encuentroRepository.save(encuentro1);

        Encuentro encuentro2 = Encuentro.builder()
                .id(2L)
                .usuario(usuario2)
                .especie(especie2)
                .zona("Selva Amazónica")
                .peso(5.7)
                .tamanio(3.2)
                .foto("Foto del bicho en la selva")
                .descripcion("Especie rara y colorida")
                .build();

        encuentroRepository.save(encuentro2);
        Encuentro encuentro3 = Encuentro.builder()
                .id(3L)
                .usuario(usuario3)
                .especie(especie3)
                .zona("Himalayas")
                .peso(1.2)
                .tamanio(0.8)
                .foto("Foto de la flor en la montaña")
                .descripcion("Flor exótica de alta montaña")
                .build();

        encuentroRepository.save(encuentro3);

        Encuentro encuentro4 = Encuentro.builder()
                .id(4L)
                .usuario(usuario1)
                .especie(especie4)
                .zona("Gran Barrera de Coral")
                .peso(0.5)
                .tamanio(0.3)
                .foto("Foto del pez en el arrecife")
                .descripcion("Pez pequeño y colorido")
                .build();

        encuentroRepository.save(encuentro4);

        Encuentro encuentro5 = Encuentro.builder()
                .id(5L)
                .usuario(usuario2)
                .especie(especie5)
                .zona("Savannah Africana")
                .peso(500)
                .tamanio(3.5)
                .foto("Foto del elefante en la naturaleza")
                .descripcion("Elefante majestuoso")
                .build();

        encuentroRepository.save(encuentro5);

        Encuentro encuentro6 = Encuentro.builder()
                .id(6L)
                .usuario(usuario3)
                .especie(especie6)
                .zona("Jardín")
                .peso(0.1)
                .tamanio(0.05)
                .foto("Foto de la rosa en el jardín")
                .descripcion("Rosa roja hermosa")
                .build();

        encuentroRepository.save(encuentro6);

        Encuentro encuentro7 = Encuentro.builder()
                .id(7L)
                .usuario(usuario1)
                .especie(especie7)
                .zona("Savannah Africana")
                .peso(180)
                .tamanio(2.8)
                .foto("Foto del león en la naturaleza")
                .descripcion("León majestuoso y poderoso")
                .build();
        encuentroRepository.save(encuentro7);


    }

}
