package one.digitalinovation.personapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinovation.personapi.dto.MessageResponseDTO;
import one.digitalinovation.personapi.entity.Person;
import one.digitalinovation.personapi.service.PersonService;

@RestController
@RequestMapping("api/v1/people")
public class PersonController {
  
  private PersonService personService;

  @Autowired
  public PersonController(PersonService personService) {
    this.personService = personService;
  }


  //@RequestBody indica que está vindo de uma requisição

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MessageResponseDTO createUser(@RequestBody Person person) {
    return personService.createPerson(person);
  }


}
