package Temperature;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public class Fahrenheit extends UnscaledMeasure {
    public Fahrenheit(double quantity) {
        super(quantity);
    }

    public Fahrenheit(UnscaledMeasure measure){
        super(measure);
    }

    @Override
    protected double convertToBaseUnit(double quantity) {
        return (quantity-32)/1.8;
    }

    @Override
    protected double convertFromBaseUnit(double quantity) {
        return (quantity * 1.8) + 32;
    }
}
