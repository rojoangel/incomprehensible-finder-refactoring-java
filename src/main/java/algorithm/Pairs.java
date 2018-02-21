package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Pairs {
    private List<Pair> pairs;

    public Pairs() {
        this.pairs = new ArrayList<Pair>();
    }

    public void add(Pair pair) {
        pairs.add(pair);
    }

    public Pair find(Algorithm algorithm) {
        Pair answer = pairs.get(0);

        for (Pair result : pairs) {
            answer = algorithm.find(result, answer);
        }

        return answer;
    }
}