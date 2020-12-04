package one.digitalinovation.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinovation.personapi.dto.MessageResponseDTO;
import one.digitalinovation.personapi.dto.Request.PersonDTO;
import one.digitalinovation.personapi.entity.Person;
import one.digitalinovation.personapi.mapper.PersonMapper;
import one.digitalinovation.personapi.repository.PersonRepository;

@Service
public class PersonService {
  
  private PersonRepository personRepository;

  private final PersonMapper personMapper = PersonMapper.INSTANCE;

  @Autowired
  public PersonService(PersonRepository personRepository){
    this.personRepository = personRepository;
  }

  public MessageResponseDTO createPerson(PersonDTO personDTO){
    Person personToSave = personMapper.toModel(personDTO);
    Person savedPerson = personRepository.save(personToSave);

    return MessageResponseDTO
            .builder()
            .message("Created person with ID " + savedPerson.getId())
            .build();
    }

}