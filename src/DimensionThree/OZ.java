package DimensionThree;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public class OZ extends Volume {
    private static final double OzToTsp = 6;

    public OZ(double quantity) {
        super(quantity);
    }

    public OZ(TSP tsp){
        super(tsp);
    }

    @Override
    public double getConversionFactor() {
        return OzToTsp;
    }

    public OZ add(Volume c2){
        return new OZ(this.getValue()+(new OZ(c2.getInBaseUnit()).getValue()));
    }
}
