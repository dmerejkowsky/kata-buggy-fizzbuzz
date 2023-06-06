package info.dmerej;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FizzBuzzTest {
    @Test
    void itWorks() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertNotNull(fizzBuzz);
    }
}
