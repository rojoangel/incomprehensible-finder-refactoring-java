package algorithm;

import java.util.List;

public class Finder {
    private final People people;

    public Finder(List<Person> peopleList) {
        this.people = new People(peopleList);
    }

    public Pair Find(Algorithm algorithm) {
        return people.pairs().find(algorithm);
    }
}
