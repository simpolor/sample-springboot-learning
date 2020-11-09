package io.simpolor.java.domain.enumerate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateTest {

    @Test
    void test(){

        // given
        long value = 22700;

        // when
        boolean actual = Calculate.INSPECT.test(value);

        // then
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void testByFalse(){

        // given
        long value = 32700;

        // when
        boolean actual = Calculate.INSPECT.test(value);

        // then
        Assertions.assertThat(actual).isTrue();
    }
}
