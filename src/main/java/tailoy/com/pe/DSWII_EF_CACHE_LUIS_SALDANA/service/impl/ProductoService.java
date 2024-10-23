package tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA.model.Producto;
import tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA.repository.ProductoRepository;
import tailoy.com.pe.DSWII_EF_CACHE_LUIS_SALDANA.service.IProductoService;

import java.util.List;

@Service
public class ProductoService implements IProductoService {

    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    @Cacheable("productos")
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    @Override
    @Cacheable(value = "productos", key = "#id")
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    @Cacheable(value = "productosPorCategoria", key = "#categoriaId")
    public List<Producto> obtenerProductosPorCategoria(Long categoriaId) {
        return productoRepository.findByCategoriaId(categoriaId);
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizarProducto(Long id, Producto producto) {
        if (!productoRepository.existsById(id)) {
            return null;
        }
        producto.setId(id);

        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
