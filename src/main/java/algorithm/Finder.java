package algorithm;
import java.util.ArrayList;
import java.util.List;

public class Finder {
	private final List<Person> _p;

	public Finder(List<Person> p) {
		_p = p;
	}

	public F Find(FT ft) {
		List<F> tr = new ArrayList<F>();

		for (int i = 0; i < _p.size() - 1; i++) {
			for (int j = i + 1; j < _p.size(); j++) {
				F r = new F();
				if (_p.get(i).birthDate.getTime() < _p.get(j).birthDate.getTime()) {
					r.P1 = _p.get(i);
					r.P2 = _p.get(j);
				} else {
					r.P1 = _p.get(j);
					r.P2 = _p.get(i);
				}
				r.D = r.P2.birthDate.getTime() - r.P1.birthDate.getTime();
				tr.add(r);
			}
		}

		if (tr.size() < 1) {
			return new F();
		}

		F answer = tr.get(0);
		for (F result : tr) {
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
