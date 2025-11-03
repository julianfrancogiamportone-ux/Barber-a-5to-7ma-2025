package barberia.API.barberia.service;

import java.util.List;
import barberia.API.barberia.model.Producto;

public interface ProductoService2 {
    List<Producto> getAllProductos();
    Producto getProductoById(Long id);
    Producto saveProducto(Producto producto);
    Producto updateProducto(Long id, Producto producto);
    void deleteProducto(Long id);
}
