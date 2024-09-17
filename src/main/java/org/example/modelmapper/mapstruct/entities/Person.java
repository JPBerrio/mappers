package org.example.modelmapper.mapstruct.entities;

public class Person {

    private Long id;
    private String name;
    private String lastName;
    private Byte age;
    private Character gender;

    // Constructor con parámetros para inicializar todos los campos
    public Person(Long id, String name, String lastName, Byte age, Character gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    // Constructor adicional para usar tipos primitivos
    public Person(long id, String name, String lastName, int age, char gender) {
        this.id = id;  // Aquí se debe usar el tipo Long
        this.name = name;
        this.lastName = lastName;
        this.age = (byte) age;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
