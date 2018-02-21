package algorithm;
import java.util.ArrayList;
import java.util.List;

public class Finder {
	private final List<Person> people;

	public Finder(List<Person> people) {
		this.people = people;
	}

	public Pair Find(FT ft) {

        if (people.size() < 2) {
            return new Pair();
        }

        List<Pair> tr = new ArrayList<Pair>();

		for (int i = 0; i < people.size() - 1; i++) {
			for (int j = i + 1; j < people.size(); j++) {
				tr.add(new Pair(people.get(i), people.get(j)));
			}
		}

		Pair answer = tr.get(0);
		for (Pair result : tr) {
		    answer = ft.find(result, answer);
		}

		return answer;
	}
}
