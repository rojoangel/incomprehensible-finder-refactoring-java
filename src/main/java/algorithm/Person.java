package algorithm;

import java.util.Date;

public class Person {
	private String name;
	public Date birthDate;

    public Person(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}

