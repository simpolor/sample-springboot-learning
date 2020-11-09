package io.simpolor.java.domain.enumerate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeParamTest {

    @Test
    void testGetValue(){

        // given, when
        GradeParam actual = GradeParam.JUNIOR;

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual.getValue()).isEqualTo(Grade.ONE);
    }
}
