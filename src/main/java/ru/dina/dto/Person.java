package ru.dina.dto;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Data
//object ready for storage in a JPA-based data store
public class Person {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String adress;

    public Person() {
    }

    public Person(String name, String adress) {

        this.name = name;
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Person))
            return false;
        Person person = (Person) o;
        return Objects.equals(this.id, person.id) && Objects.equals(this.name, person.name)
                && Objects.equals(this.adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.adress);
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + this.id + ", name='" + this.name + '\'' + ", adress='" + this.adress + '\'' + '}';
    }
}
