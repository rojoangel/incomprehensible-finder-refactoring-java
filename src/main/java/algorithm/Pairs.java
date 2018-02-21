package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Pairs {
    private List<Pair> pairs;

    public Pairs() {
        this.pairs = new ArrayList<Pair>();
    }

    public void add(Person onePerson, Person anotherPerson) {
        pairs.add(new Pair(onePerson, anotherPerson));
    }

    public Pair find(Algorithm algorithm) {

        if (pairs.size() < 1) {
            return new Pair();
        }

        Pair answer = pairs.get(0);

        for (Pair result : pairs) {
            answer = algorithm.find(result, answer);
        }

        return answer;
    }
}