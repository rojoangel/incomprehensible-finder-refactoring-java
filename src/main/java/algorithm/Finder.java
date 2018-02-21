package algorithm;
import java.util.ArrayList;
import java.util.List;

public class Finder {
	private final List<Person> people;

	public Finder(List<Person> people) {
		this.people = people;
	}

	public Pair Find(FT ft) {
		List<Pair> tr = new ArrayList<Pair>();

		for (int i = 0; i < people.size() - 1; i++) {
			for (int j = i + 1; j < people.size(); j++) {
				Pair r = new Pair();
				if (people.get(i).birthDate.getTime() < people.get(j).birthDate.getTime()) {
					r.P1 = people.get(i);
					r.P2 = people.get(j);
				} else {
					r.P1 = people.get(j);
					r.P2 = people.get(i);
				}
				r.D = r.P2.birthDate.getTime() - r.P1.birthDate.getTime();
				tr.add(r);
			}
		}

		if (tr.size() < 1) {
			return new Pair();
		}

		Pair answer = tr.get(0);
		for (Pair result : tr) {
			switch (ft) {
				case Closest:
					if (result.D < answer.D) {
						answer = result;
					}
					break;

				case Furthest:
					if (result.D > answer.D) {
						answer = result;
					}
					break;
			}
		}

		return answer;
	}
}
