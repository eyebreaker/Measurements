package Temperature;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public class Celsius extends UnscaledMeasure {

    public Celsius(double quantity) {
        super(quantity);
    }

    public Celsius(UnscaledMeasure measure){
        super(measure);
    }

    @Override
    protected double convertToBaseUnit(double quantity) {
        return quantity;
    }

    @Override
    protected double convertFromBaseUnit(double quantity) {
        return quantity;
    }


}
