package pamilu.API.repository

import pamilu.API.entity.DetallePedido
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DetallePedidoRepository : JpaRepository<DetallePedido, Long> {
    fun findByPedidoId(pedidoId: Long): List<DetallePedido>
}
