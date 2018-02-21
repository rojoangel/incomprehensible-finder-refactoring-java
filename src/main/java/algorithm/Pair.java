package algorithm;

import java.util.Objects;

public class Pair {
	public Person youngest;
	public Person eldest;

    public Pair() {
    }

    public Pair(Person youngest, Person eldest) {
        this.youngest = youngest;
        this.eldest = eldest;
    }

    public long getBirthDateDistance() {
        return eldest.getBirthDate().getTime() - youngest.getBirthDate().getTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(youngest, pair.youngest) &&
                Objects.equals(eldest, pair.eldest);
    }

    @Override
    public int hashCode() {

        return Objects.hash(youngest, eldest);
    }
}
