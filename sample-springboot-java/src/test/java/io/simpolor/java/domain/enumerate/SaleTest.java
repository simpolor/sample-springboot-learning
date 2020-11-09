package io.simpolor.java.domain.enumerate;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SaleTest {

    @Test
    void testSaleByOriginal() {

        // given
        long money = 10000L;

        // when
        Long actual = Sale.ORIGIN.calculate(money);

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual).isEqualTo(10000L);
    }

    @Test
    void testSaleBySupply() {

        // given
        long money = 10000L;

        // when
        Long actual = Sale.SUPPLY.calculate(money);

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual).isEqualTo(9090L);
    }

    @Test
    void testSaleByVat() {

        // given
        long money = 10000L;

        // when
        Long actual = Sale.VAT.calculate(money);

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual).isEqualTo(909L);
    }

    @Test
    void testSaleByNothing() {

        // given
        long money = 10000L;

        // when
        Long actual = Sale.NOTHING.calculate(money);

        // then
        Assertions.assertThat(actual).isNotNull();
        Assertions.assertThat(actual).isEqualTo(0L);
    }
}
