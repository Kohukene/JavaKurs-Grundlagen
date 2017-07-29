package com.t_systems_mms.additional;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleIntegerAdderTest {
    @Test
    public void testSimpleIntegerAdder() {
        SimpleIntegerAdder adder = new SimpleIntegerAdder();
        assertThat(adder.addIntegers(1, 1)).isEqualTo(2);
    }
}
