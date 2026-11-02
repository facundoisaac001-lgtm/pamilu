package pamilu.API.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "usuarios")
class Usuario(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false, length = 100)
    var nombre: String = "",

    @Column(nullable = false, length = 150, unique = true)
    var email: String = "",

    @Column(name = "password_hash", nullable = false, length = 255)
    var passwordHash: String = "",

    @Column(length = 20)
    var telefono: String? = null,

    @Column(columnDefinition = "TEXT")
    var direccion: String? = null,

    @Column(nullable = false, length = 50)
    var rol: String = "cliente",

    @Column(name = "fecha_registro", insertable = false, updatable = false)
    var fechaRegistro: LocalDateTime? = null
)
