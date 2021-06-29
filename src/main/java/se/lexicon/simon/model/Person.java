package se.lexicon.simon.model;

import se.lexicon.simon.data.PersonSequencer;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

    private final int id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public Person(String name, String email) {
        this.id = PersonSequencer.getInstance().getNextInSequence();
        setName(name);
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Validating the input (name)
    // not allowed to have a name with 1 letter.
    // not allowed to have a name only Space (" ");
    // not allowed to be "null"
    public void setName(String name) {
        if (name == null){
            throw new NullPointerException("Name was Null can't continue");
        }

        name = name.trim();

        if (name.isEmpty() || name.length() < 2){
            throw new IllegalArgumentException("Name need to be at least 2 letters long");
        }

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

        if (birthDate == null){
            throw new NullPointerException("BirthDate Was null");
        }

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
