package DimensionOne;

/**
 * Created by Bhushan on 29-Jul-15.
 */
public class Inch extends Length{

    private static final double InchToCetimeter = 2.54;

    public Inch(double length) {
        super(length * InchToCetimeter);
    }

    public Inch(Centimeter c){
        super(c.getValue());
    }

    public double getValue(){
        return super.getValue()/InchToCetimeter;
    }
}
