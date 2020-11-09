package io.simpolor.java.domain.enumerate;

import java.util.function.Predicate;

public enum Calculate implements Predicate<Long> {

    INSPECT(value -> {
        return 300000 > value;
    });

    private Predicate<Long> f;

    Calculate(Predicate<Long> f){
        this.f = f;
    }

    public boolean test(Long value) {
        return f.test(value);
    }

}
