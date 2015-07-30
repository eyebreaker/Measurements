package DimensionThree;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public class Cup extends Volume {
    private static final double CupToTsp = 48;

    public Cup(double quantity) {
        super(quantity);
    }

    public Cup(TSP tsp){
        super(tsp);
    }

    @Override
    public double getConversionFactor() {
        return CupToTsp;
    }

    public Cup add(Volume c2){
        return new Cup(this.getValue()+(new Cup(c2.getInBaseUnit()).getValue()));
    }

}
