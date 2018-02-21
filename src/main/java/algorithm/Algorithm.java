package algorithm;

import algorithm.result.Pair;

public enum Algorithm {
    Closest {
        @Override
        Pair find(Pair onePair, Pair anotherPair) {
            if (onePair.getBirthDateDistance() < anotherPair.getBirthDateDistance()) {
                return onePair;
            }
            return anotherPair;
        }
    },
    Furthest {
        @Override
        Pair find(Pair onePair, Pair anotherPair) {
            if (onePair.getBirthDateDistance() > anotherPair.getBirthDateDistance()) {
                return onePair;
            }
            return anotherPair;
        }
    };

    abstract Pair find(Pair onePair, Pair anotherPair);
}
