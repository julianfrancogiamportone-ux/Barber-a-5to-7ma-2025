package barberia.API.barberia.service;

import barberia.API.barberia.model.maquinas;
import java.util.List;

public interface ProductoService {
    List<maquinas> findAll();
    maquinas findById(Long id);
    maquinas save(maquinas maquina);
    maquinas update(Long id, maquinas maquina);
    void delete(Long id);
}
