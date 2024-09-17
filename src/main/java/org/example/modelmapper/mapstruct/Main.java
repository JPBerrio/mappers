package org.example.modelmapper.mapstruct;

import org.example.modelmapper.mapstruct.dto.PersonCustomDTO;
import org.example.modelmapper.mapstruct.entities.Person;
import org.example.modelmapper.mapstruct.dto.PersonDefaultDTO;
import org.example.modelmapper.mapstruct.mapper.PersonMapper;

public class Main {

    //MapStruct default
    /*public static void main(String[] args) {
        Person person = new Person(1L, "Juan Pablo", "Berrio", 24, 'M');
        System.out.println(person);

        PersonDefaultDTO personDefaultDTO = PersonMapper.INSTANCE.PersonToPersonDefaultDTO(person);
        System.out.println(personDefaultDTO);
    }*/

    //Mapstruct custom
    public static void main(String[] args) {
        Person person = new Person(1L, "Juan Pablo", "Berrio", 24, 'M');
        System.out.println(person);

        PersonCustomDTO personCustomDTO = PersonMapper.INSTANCE.personToCustomDTO(person);
        System.out.println(personCustomDTO);
    }
}
