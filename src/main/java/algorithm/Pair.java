package algorithm;

import java.util.Objects;

public class Pair {
    private Person youngest;
    private Person eldest;

    public Pair() {
    }

    public Pair(Person onePerson, Person anotherPerson) {
        if (onePerson.isYoungerThan(anotherPerson)) {
            this.youngest = onePerson;
            this.eldest = anotherPerson;
        } else {
            this.youngest = anotherPerson;
            this.eldest = onePerson;
        }
    }

    public long getBirthDateDistance() {
        return Math.abs(eldest.getBirthDate().getTime() - youngest.getBirthDate().getTime());
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
