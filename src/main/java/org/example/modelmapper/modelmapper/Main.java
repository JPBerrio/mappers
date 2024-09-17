package org.example.modelmapper.modelmapper;

import org.example.modelmapper.modelmapper.dto.PersonCustomDTO;
import org.example.modelmapper.modelmapper.entities.Person;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;

public class Main {
    /*Model mapper default*/
    /*public static void main(String[] args) {

        ModelMapper modelMapper = new ModelMapper();

        Person person = new Person(1L, "Juan Pablo", "Berrio", 24, 'M');
        System.out.println(person);

        //Si los atributos son exactamente iguales esta seria la forma de mapearlos
        PersonDefaultDTO personDefaultDTO = modelMapper.map(person, PersonDefaultDTO.class);
        System.out.println(personDefaultDTO);

    }*/

    public static void main(String[] args) {
        ModelMapper modelMapper = new ModelMapper();

        //Desde que clase y hacia que clase quiero mapear
        TypeMap<Person, PersonCustomDTO> propertyMapper = modelMapper.createTypeMap(Person.class, PersonCustomDTO.class);
        propertyMapper.addMapping(Person::getId, PersonCustomDTO::setIdDTO);
        propertyMapper.addMapping(Person::getName, PersonCustomDTO::setNameDTO);
        propertyMapper.addMapping(Person::getLastName, PersonCustomDTO::setLastNameDTO);
        propertyMapper.addMapping(Person::getGender, PersonCustomDTO::setGenderDTO);
        propertyMapper.addMapping(Person::getAge, PersonCustomDTO::setAgeDTO);
        propertyMapper.addMapping(Person::getGender, PersonCustomDTO::setGenderDTO);

        Person person = new Person(1L, "Juan Pablo", "Berrio", 24, 'M');
        System.out.println(person);

        PersonCustomDTO personCustomDTO = propertyMapper.map(person);
        System.out.println(personCustomDTO);

    }
}