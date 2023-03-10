package at.htlpinkafeld.firsttest;

public class TemperatureUtils {
    public static float celsiusToFahrenheit(float celsius) {
        return celsius*9/5+32; // when (9/5) will be integer and can be multiplied with float, better to do e.g. 9.0/5.0 or 9F/5F
    }
}
