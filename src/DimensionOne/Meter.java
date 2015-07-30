package DimensionOne;

/**
 * Created by Bhushan on 29-Jul-15.
 */
public class Meter extends Length {

    private static final double MeterToCentimeter = 100;
    public Meter(double length) {
        super(length * MeterToCentimeter);
    }


    public Meter(Centimeter c){
        super(c.getValue());
    }

    public double getValue(){
        return super.getValue()/MeterToCentimeter;
    }


}
