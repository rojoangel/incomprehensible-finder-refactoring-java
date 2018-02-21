package algorithm;

import java.util.ArrayList;
import java.util.List;

public class People {
    private List<Person> people = new ArrayList<Person>();

    public void add(Person person) {
        people.add(person);
    }

    Pairs pairs() {

        Pairs pairs = new Pairs();

        for (int i = 0; i < people.size() - 1; i++) {
            for (int j = i + 1; j < people.size(); j++) {
                pairs.add(new Pair(people.get(i), people.get(j)));
            }
        }

        return pairs;
    }
}