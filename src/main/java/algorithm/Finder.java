package algorithm;
import java.util.List;

public class Finder {
	private final List<Person> personList;
	private final People people;

    public Finder(List<Person> peopleList) {
		this.personList = peopleList;
		this.people = new People(peopleList);
	}

	public Pair Find(Algorithm algorithm) {

        return people.pairs().find(algorithm);
    }
}
