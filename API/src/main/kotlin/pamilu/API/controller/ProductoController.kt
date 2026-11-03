package pamilu.API.controller

import pamilu.API.entity.Producto
import pamilu.API.entity.Categoria
import pamilu.API.repository.ProductoRepository
import pamilu.API.repository.CategoriaRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = ["*"]) // Permite la conexión con tu React en localhost:3000
class ProductoController(
    private val productoRepository: ProductoRepository,
    private val categoriaRepository: CategoriaRepository
) {

    // Endpoint para obtener todos los productos (/api/products)
    @GetMapping("/products")
    fun getProducts(): List<Producto> {
        return productoRepository.findAll()
    }

    // Endpoint para obtener un producto por ID (/api/products/{id})
    @GetMapping("/products/{id}")
    fun getProductById(@PathVariable id: Long): Producto? {
        return productoRepository.findById(id).orElse(null)
    }

    // Endpoint para obtener las categorías (/api/categories)
    @GetMapping("/categories")
    fun getCategories(): List<Categoria> {
        return categoriaRepository.findAll()
    }
}
