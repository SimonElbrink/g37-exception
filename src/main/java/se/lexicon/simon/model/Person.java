package se.lexicon.simon.model;

import se.lexicon.simon.data.PersonSequencer;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private final int id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public Person(String name, String email, LocalDate birthDate) {
        this.id = PersonSequencer.getInstance().getNextInSequence();

        this.email = email;
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getId() == person.getId() && Objects.equals(getName(), person.getName()) && Objects.equals(getEmail(), person.getEmail()) && Objects.equals(getBirthDate(), person.getBirthDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmail(), getBirthDate());
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
