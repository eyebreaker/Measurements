package DimensionOne;

/**
 * Created by Bhushan on 29-Jul-15.
 */
public class Feet extends Length{

    private static final double FeetToCentimeter = 12 * 2.54;
    public Feet(double length) {
        super(length * FeetToCentimeter);
    }


    public Feet(Centimeter c){
        super(c.getValue());
    }

    public double getValue(){
        return super.getValue()/(FeetToCentimeter );
    }

}
