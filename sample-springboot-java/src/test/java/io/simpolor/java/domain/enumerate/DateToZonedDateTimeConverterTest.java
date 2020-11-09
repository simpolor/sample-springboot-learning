package io.simpolor.java.domain.enumerate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.*;

public class DateToZonedDateTimeConverterTest {

    @Test
    void testConvert(){

        // given
        LocalDateTime dateTime = LocalDateTime.of(2020, 11, 29, 12, 30);

        // when
        ZonedDateTime actual = DateTimeConverter.INSTANCE.convert(dateTime);

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual.getYear()).isEqualTo(2020);
        Assertions.assertThat(actual.getMonth().getValue()).isEqualTo(11);
        Assertions.assertThat(actual.getDayOfMonth()).isEqualTo(29);
    }
}
