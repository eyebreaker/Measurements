package DimensionThree;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public class TSP extends Volume{
    @Override
    public double getConversionFactor() {
        return 1;
    }

    public TSP(double quantity){
        super(quantity);
    }

    public TSP(TSP tsp){
        super(tsp);
    }

    public TSP add(Volume c2){
        return new TSP(this.getValue()+(new TSP(c2.getInBaseUnit()).getValue()));
    }

}
