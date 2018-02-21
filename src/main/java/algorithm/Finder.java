package algorithm;

public class Finder {
    private final People people;

    public Finder(People people) {
        this.people = people;
    }

    public Pair Find(Algorithm algorithm) {
        return people.pairs().find(algorithm);
    }
}
