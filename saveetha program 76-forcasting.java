import java.util.Scanner;

class R192211820 {
    protected String date;
    protected double temperature;

    public R192211820(String date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public void displayForecast() {
        System.out.println("Date: " + date);
        System.out.println("Temperature: " + temperature + "°C");
    }
}

class SunnyForecast extends R192211820 {
    private int sunHours;

    public SunnyForecast(String date, double temperature, int sunHours) {
        super(date, temperature);
        this.sunHours = sunHours;
    }

    public void predictWeather() {
        System.out.println("It's going to be sunny with " + sunHours + " hours of sunshine.");
    }

    public void displayForecast() {
        super.displayForecast();
        predictWeather();
    }
}

class RainyForecast extends R192211820 {
    private double rainfall;

    public RainyForecast(String date, double temperature, double rainfall) {
        super(date, temperature);
        this.rainfall = rainfall;
    }

    public void predictWeather() {
        System.out.println("Expect rain with " + rainfall + " mm of rainfall.");
    }

    public void displayForecast() {
        super.displayForecast();
        predictWeather();
    }
}

public class weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the date (e.g., 2024-08-30):");
        String date = scanner.nextLine();

        System.out.println("Enter the temperature (in °C):");
        double temperature = scanner.nextDouble();

        System.out.println("Choose forecast type: 1 for Sunny, 2 for Rainy");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the number of hours of sunshine:");
            int sunHours = scanner.nextInt();
            SunnyForecast sunnyForecast = new SunnyForecast(date, temperature, sunHours);
            sunnyForecast.displayForecast();
        } else if (choice == 2) {
            System.out.println("Enter the amount of rainfall (in mm):");
            double rainfall = scanner.nextDouble();
            RainyForecast rainyForecast = new RainyForecast(date, temperature, rainfall);
            rainyForecast.displayForecast();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
