package io.simpolor.java.domain.enumerate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class GradeCardTest {

    @Test
    void testBySum(){

        // given
        List<Integer> values = Arrays.asList(90, 70, 65);

        // when
        int actual = GradeCard.SUM.calculate(values);

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual).isEqualTo(225);
    }

    @Test
    void testByAvg(){

        // given
        List<Integer> values = Arrays.asList(90, 70, 65);

        // when
        int actual = GradeCard.AVG.calculate(values);

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual).isEqualTo(75);
    }
}
