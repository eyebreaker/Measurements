package DimensionOne;

/**
 * Created by Bhushan on 29-Jul-15.
 */
public abstract class Length {
    private double quantity;

    public Length(double quantity){
        this.quantity = quantity;
    }

    public double getValue(){
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Length)) return false;

        Length length1 = (Length) o;

        return Double.compare(length1.getValue(), quantity) == 0;

    }

    public Centimeter getInBaseUnit(){
        return new Centimeter(quantity);
    }

}
