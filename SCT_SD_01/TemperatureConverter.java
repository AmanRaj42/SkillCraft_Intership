package SCT_SD_01;

import java.util.Scanner;

        public class TemperatureConverter {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Temperature Converter");
                System.out.println("1. Celsius to Fahrenheit");
                System.out.println("2. Celsius to Kelvin");
                System.out.println("3. Fahrenheit to Celsius");
                System.out.println("4. Fahrenheit to Kelvin");
                System.out.println("5. Kelvin to Celsius");
                System.out.println("6. Kelvin to Fahrenheit");
                System.out.print("Choose an option (1-6): ");
                int option = scanner.nextInt();

                System.out.print("Enter the temperature value: ");
                double inputTemperature = scanner.nextDouble();
                double convertedTemperature;

                switch (option) {
                    case 1: // Celsius to Fahrenheit
                        convertedTemperature = (inputTemperature * 9 / 5) + 32;
                        System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                        break;
                    case 2: // Celsius to Kelvin
                        convertedTemperature = inputTemperature + 273.15;
                        System.out.println("Temperature in Kelvin: " + convertedTemperature);
                        break;
                    case 3: // Fahrenheit to Celsius
                        convertedTemperature = (inputTemperature - 32) * 5 / 9;
                        System.out.println("Temperature in Celsius: " + convertedTemperature);
                        break;
                    case 4: // Fahrenheit to Kelvin
                        convertedTemperature = (inputTemperature - 32) * 5 / 9 + 273.15;
                        System.out.println("Temperature in Kelvin: " + convertedTemperature);
                        break;
                    case 5: // Kelvin to Celsius
                        convertedTemperature = inputTemperature - 273.15;
                        System.out.println("Temperature in Celsius: " + convertedTemperature);
                        break;
                    case 6: // Kelvin to Fahrenheit
                        convertedTemperature = (inputTemperature - 273.15) * 9 / 5 + 32;
                        System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                        break;
                    default:
                        System.out.println("Invalid option. Please choose a valid option (1-6).");
                }

                scanner.close();
            }
        }



