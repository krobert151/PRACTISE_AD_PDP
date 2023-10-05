package Controller;

import Modal.Producto;
import Repository.ProductoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductoController {

    private final ProductoRepo productoRepo;

    @GetMapping("/producto")
    public ResponseEntity<List<Producto>> findAll(){

        List<Producto> list = productoRepo.findAll();

        if(list.isEmpty())
            return ResponseEntity.status(201).build();

        return ResponseEntity.ok(list);

    }

    @GetMapping("/producto/{id}")
    public ResponseEntity<?> obtenerProducto (@PathVariable Long id){
        return ResponseEntity.of(productoRepo.findById(id));
    }

    @PostMapping("/producto")
    public ResponseEntity<Producto> nuevoProducto (@RequestBody Producto nuevo){
        Producto saved= productoRepo.save(nuevo);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);

    }

    @PutMapping("/producto/{id}")
    public ResponseEntity<Producto> editarProducto(@RequestBody Producto editar, @PathVariable Long id){

        return ResponseEntity.of(productoRepo.findById(id).map(
                old->{
                    old.setId(editar.getId());
                    old.setPrecio(editar.getPrecio());
                    old.setNombre(editar.getNombre());
                    return productoRepo.save(old);
                }
        ));

    }

    @DeleteMapping("/producto/{id}")
    public ResponseEntity<?> delProducto (@PathVariable Long id){
        if(productoRepo.existsById(id))
            productoRepo.deleteById(id);
            return ResponseEntity.noContent().build();

    }

}

