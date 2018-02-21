package algorithm;
public class Pair {
	public Person youngest;
	public Person eldest;
	private long birthDateDistance;

    public long getBirthDateDistance() {
        return birthDateDistance;
    }

    public void setBirthDateDistance(long birthDateDistance) {
        this.birthDateDistance = birthDateDistance;
    }
}
