import java.util.Scanner;

public class ShowMenu {

    Scanner reader = new Scanner(System.in);
    Operations operation = new Operations();

    public void menu() {

        System.out.print("""
                1 - Celsius -> Fahrenheit
                2 - Fahrenheit -> Celsius
                Choose an option:\s""");

        int option = reader.nextInt();
        double temperature;

        switch(option) {
            case 1: System.out.println("Type a temperature: ");
                    temperature = reader.nextDouble();
                    operation.CelsiusToFahrenheit(temperature);
                break;
            case 2: System.out.println("Type a temperature: ");
                    temperature = reader.nextDouble();
                    operation.FahrenheitToCelsius(temperature);
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}