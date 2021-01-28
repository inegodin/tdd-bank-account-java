package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MoneyTest {

    @Test
    public void moneyHasAmount() {
        Money money = new Money(100);
        assertThat(money.getAmount()).isEqualTo(100);
    }

}