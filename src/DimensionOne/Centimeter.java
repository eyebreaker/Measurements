package DimensionOne;

/**
 * Created by Bhushan on 29-Jul-15.
 */
public class Centimeter extends Length {

    public Centimeter(double length) {
        super(length);
    }


    public Centimeter(Centimeter c){
        super(c.getValue());
    }

    public double getValue(){
        return super.getValue();
    }
}
