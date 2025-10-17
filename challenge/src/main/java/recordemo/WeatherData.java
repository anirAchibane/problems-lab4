package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return (temperatureCelsius * 9/5) + 32.0;
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        double temperatureFar = temperatureFahrenheit();
        return String.format("Current weather: %.2f°C (%.2f°F), and %s ",
                                        temperatureCelsius,
                                        temperatureFar,
                                        conditions);
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tempCelsius = (tempFahrenheit - 32.0) * 5 / 9;

        return new WeatherData(tempCelsius, conditions);
    }

    public static void main(String[] args) {
        WeatherData weather1 = new WeatherData(25.0, "Sunny");
        System.out.println("weather1's temperature in F = " + weather1.temperatureFahrenheit());
        System.out.println("Today's weather: " +  weather1.getSummary());

        WeatherData weather2 = WeatherData.fromFahrenheit(50.0, "Cloudy");
        System.out.println("Yesterday's weather: " + weather2.getSummary());
    }
}
