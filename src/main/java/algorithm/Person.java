package algorithm;

import java.util.Date;

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
}

