package algorithm.result;

public class Empty implements Result {

    @Override
    public long getBirthDateDistance() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return (o != null && getClass() == o.getClass());
    }

    @Override
    public String toString() {
        return "Empty{}";
    }
}
