package io.simpolor.java.domain.enumerate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GradeTest {

    @Test
    void testGetTitle(){

        // given, when
        Grade actual = Grade.ONE;

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual.getTitle()).isEqualTo("1학년");
    }

    @Test
    void testGetClasses(){

        // given, when
        Grade actual = Grade.TWO;

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual.getClasses()).size().isEqualTo(3);
        Assertions.assertThat(actual.getClasses()).contains(Class.C);
        Assertions.assertThat(actual.getClasses()).doesNotContain(Class.D);
    }
}
