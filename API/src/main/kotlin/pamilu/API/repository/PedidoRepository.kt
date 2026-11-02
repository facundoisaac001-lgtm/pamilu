package pamilu.API.repository

import pamilu.API.entity.Pedido
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PedidoRepository : JpaRepository<Pedido, Long> {
    fun findByUsuarioId(usuarioId: Long): List<Pedido>
}
