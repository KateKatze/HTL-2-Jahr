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
        assertEquals(32.0, result, 0.001, "Test with 0 Degrees"); //delta - toleranzbereich
        result = TemperatureUtils.celsiusToFahrenheit(1);
        assertEquals(33.8, result, 0.001, "Test with 1 Degree"); //delta - toleranzbereich
    }
}