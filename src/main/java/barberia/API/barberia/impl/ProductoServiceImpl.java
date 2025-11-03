package barberia.API.barberia.impl;

import barberia.API.barberia.model.maquinas;
import barberia.API.barberia.repository.ProductoRepository;
import barberia.API.barberia.service.ProductoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<maquinas> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public maquinas findById(Long id) {
        return productoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Máquina no encontrada con id: " + id));
    }

    @Override
    public maquinas save(maquinas maquina) {
        return productoRepository.save(maquina);
    }

    @Override
    public maquinas update(Long id, maquinas nuevaMaquina) {
        maquinas existente = findById(id);
        existente.setMarca(nuevaMaquina.getMarca());
        existente.setModelo(nuevaMaquina.getModelo());
        existente.setPrecio(nuevaMaquina.getPrecio());
        existente.setEstado(nuevaMaquina.getEstado());
        return productoRepository.save(existente);
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }
}

