package DimensionThree;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public class TBSP extends Volume {

    private static final double TbspTotsp = 3;

    public TBSP(double quantity) {
        super(quantity);
    }

    public TBSP(Volume tsp){
        super(tsp);
    }

    @Override
    public double getConversionFactor() {
        return TbspTotsp;
    }

    public TBSP add(Volume c2){
        return new TBSP(this.getValue()+(new TBSP(c2.getInBaseUnit()).getValue()));
    }
}
