package DimensionOne;

/**
 * Created by Bhushan on 29-Jul-15.
 */
public class Yard extends Length {

    private static  final  double YardToCentimeter =  2.54 * 12 * 3;

    public Yard(double length) {
        super(length * YardToCentimeter);
    }


    public Yard(Centimeter c){
        super(c.getValue());
    }

    public double getValue(){
        return super.getValue()/(YardToCentimeter);
    }
}
