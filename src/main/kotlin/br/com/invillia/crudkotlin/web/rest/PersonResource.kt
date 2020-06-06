package br.com.invillia.crudkotlin.web.rest

import br.com.invillia.crudkotlin.domain.Person
import br.com.invillia.crudkotlin.service.PersonService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class PersonResource(
        private val personService: PersonService) {

    @PostMapping("people")
    fun createPeople(@RequestBody person: Person): ResponseEntity<Person> {
        if (person.id != null){
            throw Exception("Não informar o id")
        }
        val result = personService.save(person)
        return ResponseEntity.ok(result)
    }

    @PutMapping("people")
    fun updatePerson(@RequestBody person: Person): ResponseEntity<Person> {
        if (person.id == null) {
            throw Exception("Informar o id")
        }
        val result = personService.save(person)
        return ResponseEntity.ok(result)
    }

    @DeleteMapping("people/{id}")
    fun deletePerson(@PathVariable id: Long): ResponseEntity<Void> {
        personService.delete(id)
        return ResponseEntity.noContent().build()
    }

    @GetMapping("people")
    fun listPeople():MutableList<Person>{
        val result = personService.findAll();
        return result;
    }
}