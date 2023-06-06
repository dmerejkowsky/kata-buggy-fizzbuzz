package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void two_plus_three_is_five() {
        int left = 2;
        int right = 3;

        int result = Calculator.add(left, right);

        assertEquals(5, result);
    }
}