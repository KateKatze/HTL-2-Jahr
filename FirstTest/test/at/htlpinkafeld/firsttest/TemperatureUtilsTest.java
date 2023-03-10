package at.htlpinkafeld.firsttest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureUtilsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void celsiusToFahrenheit() {
        float result;
        result = TemperatureUtils.celsiusToFahrenheit(0);
        assertEquals(32.0, result, 0.001); //delta - toleranzbereich
    }
}