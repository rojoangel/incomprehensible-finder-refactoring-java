package algorithm;
public class Pair {
	public Person youngest;
	public Person eldest;

    public long getBirthDateDistance() {
        return eldest.getBirthDate().getTime() - youngest.getBirthDate().getTime();
    }
}
