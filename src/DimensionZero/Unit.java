package DimensionZero;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public abstract class Unit {

    private double quantityInBaseUnit;

    public Unit(double quantity){
        this.quantityInBaseUnit = quantity * getConversionFactor();
    }

    public Unit(Unit unit){
        this.quantityInBaseUnit = unit.getValue();
    }

    public double getValue(){
        return quantityInBaseUnit / getConversionFactor();
    }

    public double getQuantityInBaseUnit(){
        return quantityInBaseUnit;
    }

    public abstract double getConversionFactor();
}
