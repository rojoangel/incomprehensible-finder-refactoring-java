package algorithm;

import algorithm.result.Pair;
import algorithm.result.Result;

public class Finder {
    private final People people;

    public Finder(People people) {
        this.people = people;
    }

    public Result Find(Algorithm algorithm) {
        return people.pairs().find(algorithm);
    }
}
