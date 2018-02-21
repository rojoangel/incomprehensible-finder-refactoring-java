package algorithm;

import org.junit.Test;

import static algorithm.SamplePerson.*;
import static org.junit.Assert.assertEquals;

public class AlgorithmTest {

    private Pair closestPair = new Pair(sue, greg);
    private Pair furthestPair = new Pair(sarah, sue);

    @Test
    public void closest_find_should_result_closest_birth_dates() {
        Algorithm closest = Algorithm.Closest;
        assertEquals(closestPair, closest.find(closestPair, furthestPair));
    }

    @Test
    public void furthest_find_should_result_furthest_birth_dates() {
        Algorithm closest = Algorithm.Furthest;
        assertEquals(furthestPair, closest.find(closestPair, furthestPair));
    }
}
