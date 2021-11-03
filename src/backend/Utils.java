package backend;

public class Utils {

    public static String roundDoubleToNDigits(Double number, int digits) {
        return String.format("%." + ++digits + "g%n", number);
    }

}
