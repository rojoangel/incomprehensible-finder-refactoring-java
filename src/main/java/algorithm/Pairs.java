package algorithm;

import java.util.List;

public class Pairs {
    private List<Pair> pairs;

    public Pairs(List<Pair> pairs) {
        this.pairs = pairs;
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