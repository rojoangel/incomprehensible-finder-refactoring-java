package algorithm;
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
}
