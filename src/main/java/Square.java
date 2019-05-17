import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Square implements Shape {

    private double length;

    void setProperty(double length) {
        this.length = length;
    }

    double getArea() {
        return Double.parseDouble(new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US)).format(length * length));
    }

    public String getDetails() {
        return "Square... " + " Length: " + length + " Area: " + getArea() + " ";
    }
}