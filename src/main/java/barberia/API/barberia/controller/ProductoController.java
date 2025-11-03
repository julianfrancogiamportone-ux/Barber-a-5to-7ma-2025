package barberia.API.barberia.controller;

import barberia.API.barberia.model.maquinas;
import barberia.API.barberia.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/maquinas")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public ResponseEntity<List<maquinas>> getAll() {
        return ResponseEntity.ok(productoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<maquinas> getById(@PathVariable Long id) {
        return ResponseEntity.ok(productoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<maquinas> create(@RequestBody maquinas maquina) {
        return ResponseEntity.ok(productoService.save(maquina));
    }

    @PutMapping("/{id}")
    public ResponseEntity<maquinas> update(@PathVariable Long id, @RequestBody maquinas maquina) {
        return ResponseEntity.ok(productoService.update(id, maquina));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        productoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
