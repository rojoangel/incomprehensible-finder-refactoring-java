package algorithm;

import java.util.Date;

public class Person {
	private String name;
	private Date birthDate;

    public Person(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}

    public boolean isYoungerThan(Person anotherPerson) {
        return this.birthDate.after(anotherPerson.birthDate);
    }
}

