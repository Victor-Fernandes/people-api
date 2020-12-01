package one.digitalinovation.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;

import one.digitalinovation.personapi.dto.MessageResponseDTO;
import one.digitalinovation.personapi.entity.Person;
import one.digitalinovation.personapi.repository.PersonRepository;

public class PersonService {
  
  private PersonRepository personRepository;

  @Autowired
  public PersonService(PersonRepository personRepository){
    this.personRepository = personRepository;
  }

  public MessageResponseDTO createPerson(Person person){
    Person savedPerson = personRepository.save(person);
    return MessageResponseDTO
            .builder()
            .message("Created person with ID " + person.getId())
            .build();
    }

}
