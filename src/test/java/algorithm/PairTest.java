package algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static algorithm.SamplePerson.greg;
import static algorithm.SamplePerson.sue;

public class PairTest {

    @Test
    public void a_pair_of_two_people_should_always_be_the_same() {
        Pair onePair = new Pair(sue, greg);
        Pair reversedPair = new Pair(greg, sue);
        assertEquals(onePair, reversedPair);
    }

    @Test
    public void birthDateDistance_should_be_the_difference_between_dates() {
        Pair onePair = new Pair(sue, greg);
        assertEquals(76204800000L, onePair.getBirthDateDistance());
    }
}