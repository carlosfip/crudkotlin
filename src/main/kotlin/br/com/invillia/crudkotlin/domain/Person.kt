package br.com.invillia.crudkotlin.domain

import java.io.Serializable
import javax.persistence.*
import javax.validation.constraints.NotNull

@Entity
@Table(name = "person")
data class Person(
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
        @SequenceGenerator(name = "sequenceGenerator", sequenceName = "s_person")
        var id: Long? = null,

        @get: NotNull
        @Column(name = "name", nullable = false)
        var name: String? = null,

        @get: NotNull
        @Column(name = "cpf", nullable = false)
        var cpf: String? = null
) : Serializable {
    override fun toString(): String {
        return "Person(id=$id, name=$name, cpf=$cpf)"
    }
    companion object {
        private const val serialVersionUID = 1L
    }
}