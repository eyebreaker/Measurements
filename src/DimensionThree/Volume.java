package DimensionThree;

import DimensionZero.Unit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Bhushan on 30-Jul-15.
 */
public abstract class Volume extends Unit {


    public Volume(double quantity) {
        super(quantity);
    }

    public Volume(Volume volume){
        super(volume);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Volume)) return false;

        Volume volume = (Volume) o;

        return Double.compare(volume.getQuantityInBaseUnit(), getQuantityInBaseUnit()) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getQuantityInBaseUnit());
        return (int) (temp ^ (temp >>> 32));
    }

    public TSP getInBaseUnit(){
        return new TSP(getQuantityInBaseUnit());
    }

   /* public Volume add(Volume volume) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<?> cons = Class.forName(this.getClass().getName()).getConstructor(TSP.class);
        Volume parameter = (Volume) cons.newInstance(volume.getInBaseUnit());
        cons = Class.forName(this.getClass().getName()).getConstructor(TSP.class);
        Object result = cons.newInstance(this.getValue() + parameter.getValue());
        return (Volume) result;
    }*/

}
