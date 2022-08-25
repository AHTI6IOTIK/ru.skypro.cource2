package oop.step2.upper.step2;

import java.util.ArrayList;
import java.util.List;

public class Box implements ShapeInterface {
    private final double volume;

    List<ShapeInterface> shapeInterfaces = new ArrayList<>();

    public Box(double volume) {
        this.volume = volume;
    }

    public boolean add(ShapeInterface shapeInterface) {
        if (!isFit(shapeInterface)) {
            return false;
        }

        shapeInterfaces.add(shapeInterface);
        return true;
    }

    private boolean isFit(ShapeInterface shapeInterface) {
        double oc = getOccupiedVolume();
        double ad = shapeInterface.getVolume();
        return getVolume() >= oc + ad ;
    }

    public double getOccupiedVolume() {
        double occupiedVolume = 0;
        for (ShapeInterface shapeInterfaceOfCollection : shapeInterfaces) {
            occupiedVolume += shapeInterfaceOfCollection.getVolume();
        }
        return occupiedVolume;
    }

    @Override
    public double getVolume() {
        return volume;
    }
}
