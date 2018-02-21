package algorithm;

import java.util.Date;
import java.util.Objects;

public class Person {
    private String name;
    private Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public boolean isYoungerThan(Person anotherPerson) {
        return this.birthDate.after(anotherPerson.birthDate);
    }

    public long birthDateDistanceTo(Person anotherPerson) {
        return Math.abs(this.birthDate.getTime() - anotherPerson.birthDate.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(birthDate, person.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}

