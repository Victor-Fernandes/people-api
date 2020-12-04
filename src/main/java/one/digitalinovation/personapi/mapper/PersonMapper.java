package one.digitalinovation.personapi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import one.digitalinovation.personapi.dto.Request.PersonDTO;
import one.digitalinovation.personapi.entity.Person;

@Mapper
public interface PersonMapper {
  
  PersonMapper INSTANCE =Mappers.getMapper(PersonMapper.class);

  @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
  Person toModel(PersonDTO personDTO); //converter um dto para um obj para bd

  PersonDTO toDto(Person person);

}
