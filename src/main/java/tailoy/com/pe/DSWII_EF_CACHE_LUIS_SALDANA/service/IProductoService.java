package tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA.service;

import tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA.model.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> obtenerTodosLosProductos();
    Producto obtenerProductoPorId(Long id);
    List<Producto> obtenerProductosPorCategoria(Long categoriaId);
    Producto crearProducto(Producto producto);
    Producto actualizarProducto(Long id, Producto producto);
    void eliminarProducto(Long id);
}
