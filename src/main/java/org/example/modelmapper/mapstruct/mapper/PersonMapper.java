package org.example.modelmapper.mapstruct.mapper;

import org.example.modelmapper.mapstruct.dto.PersonCustomDTO;
import org.example.modelmapper.mapstruct.dto.PersonDefaultDTO;
import org.example.modelmapper.mapstruct.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDefaultDTO PersonToPersonDefaultDTO(Person person);

    @Mapping(source = "id", target = "idDTO")
    @Mapping(source = "name", target = "nameDTO")
    @Mapping(source = "lastName", target = "lastNameDTO")
    @Mapping(source = "age", target = "ageDTO")
    @Mapping(source = "gender", target = "genderDTO")
    PersonCustomDTO personToCustomDTO(Person person);

}
