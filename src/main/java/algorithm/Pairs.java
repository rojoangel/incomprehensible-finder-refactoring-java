package algorithm;

import java.util.List;

public class Pairs {
    public Pairs() {
    }

    Pair find(Algorithm algorithm, List<Pair> tr) {
        Pair answer = tr.get(0);
        for (Pair result : tr) {
            answer = algorithm.find(result, answer);
        }

        return answer;
    }
}