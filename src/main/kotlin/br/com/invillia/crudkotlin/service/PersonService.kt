package br.com.invillia.crudkotlin.service

import br.com.invillia.crudkotlin.domain.Person
import br.com.invillia.crudkotlin.repository.PersonRepository
import org.springframework.stereotype.Service
import java.util.*
import javax.transaction.Transactional

@Service
@Transactional
class PersonService(
        private val personRepository: PersonRepository) {

    fun save(person: Person): Person {
        return personRepository.save(person)
    }

    fun findAll(): MutableList<Person> {
        return personRepository.findAll()
    }
    fun findOne(id: Long): Optional<Person> {
        return personRepository.findById(id)
    }

    fun delete(id: Long) {
        personRepository.deleteById(id)
    }
}