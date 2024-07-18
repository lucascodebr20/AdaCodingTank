package ConversorTemperatura;

public class SystemConverterTemperatura {

    public static double converterTemperatura
            (double temp, String modeloA, String modeloB) {
        switch (modeloA) {
            case "KELVIN":
                switch (modeloB) {
                    case "FAHRENHEIT":
                        return (temp - 273.15) * 9 / 5 + 32;
                    case "CELSIUS":
                        return temp - 273.15;
                }
                break;
            case "FAHRENHEIT":
                switch (modeloB) {
                    case "KELVIN":
                        return (temp - 32) * 5 / 9 + 273.15;
                    case "CELSIUS":
                        return (temp - 32) * 5 / 9;
                }
                break;
            case "CELSIUS":
                switch (modeloB) {
                    case "KELVIN":
                        return temp + 273.15;
                    case "FAHRENHEIT":
                        return (temp * 9 / 5) + 32;
                }
                break;
        }
        return temp;
    }


}
