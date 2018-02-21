package algorithm;

import org.junit.Test;

import static algorithm.SamplePerson.greg;
import static algorithm.SamplePerson.sue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {

    @Test
    public void should_be_younger_if_was_born_later() {
        assertTrue(greg.isYoungerThan(sue));
    }

    @Test
    public void should_not_be_younger_if_was_born_before() {
        assertFalse(sue.isYoungerThan(greg));
    }

}