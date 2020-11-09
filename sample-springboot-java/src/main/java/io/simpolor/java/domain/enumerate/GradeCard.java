package io.simpolor.java.domain.enumerate;

import java.util.List;
import java.util.function.Function;

public enum GradeCard {

    AVG("평균", list -> {
        return getSum(list) / list.size();
    }),
    SUM("합계", list -> {
        return getSum(list);
    });

    private final String name;
    private final Function<List<Integer>, Integer> expression;

    GradeCard(String name, Function<List<Integer>, Integer> expression) {
        this.name = name;
        this.expression = expression;
    }

    private static Integer getSum(List<Integer> list) {
        return list.stream()
                .reduce(Integer::sum)
                .get();
    }

    public Integer calculate(List<Integer> list) {
        return expression.apply(list);
    }
}
