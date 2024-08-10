public class Operations {

    public void FahrenheitToCelsius(double temperature) {
        double c;
        c = (temperature-32)/1.8;
        System.out.println(temperature + "ºF is equivalent to " + c
        + "ºC.");
    }

    public void CelsiusToFahrenheit(double temperature) {
        double f;
        f = (temperature*1.8) + 32;
        System.out.println(temperature + "ºC is equivalent to " + f
                + "ºF.");
    }
}