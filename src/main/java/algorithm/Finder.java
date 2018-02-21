package algorithm;
import java.util.List;

public class Finder {
	private final List<Person> people;

    public Finder(List<Person> people) {
		this.people = people;
	}

	public Pair Find(Algorithm algorithm) {

        if (people.size() < 2) {
            return new Pair();
        }

        Pairs pairs = pairs(this.people);
        return pairs.find(algorithm);
    }

    private Pairs pairs(List<Person> peopleList) {
        People people = new People(peopleList);
        return people.pairs();
    }
}
