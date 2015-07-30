package Temperature;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public abstract class UnscaledMeasure {

    private double quantityInBaseUnit;

    public UnscaledMeasure(double quantity){
        this.quantityInBaseUnit = convertToBaseUnit(quantity);
    }

    public UnscaledMeasure(UnscaledMeasure measure){
        this.quantityInBaseUnit = measure.getQuantityInBaseUnit();
    }

    public double getQuantityInBaseUnit(){
        return quantityInBaseUnit;
    }

    protected abstract double convertToBaseUnit(double quantity);

    protected abstract double convertFromBaseUnit(double quantity);


    public double getValue(){
        return convertFromBaseUnit(quantityInBaseUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UnscaledMeasure)) return false;

        UnscaledMeasure that = (UnscaledMeasure) o;

        return (Math.abs(that.quantityInBaseUnit - quantityInBaseUnit)< 0.000001);

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(quantityInBaseUnit);
        return (int) (temp ^ (temp >>> 32));
    }
}
