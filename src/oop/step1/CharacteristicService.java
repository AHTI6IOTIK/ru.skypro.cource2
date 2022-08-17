package oop.step1;

import java.util.ArrayList;
import java.util.List;

public class CharacteristicService {
    public Characteristic createByString(final String characteristic) {
        String[] prepared = characteristic.split("=");
        return new Characteristic(prepared[0], Integer.parseInt(prepared[1]));
    }

    public Characteristic[] createByStrings(final String[] characteristics) {
        List<Characteristic> characteristicList = new ArrayList<>();
        for (String characteristic: characteristics) {
            characteristicList.add(createByString(characteristic));
        }

        return characteristicList.toArray(new Characteristic[0]);
    }
}
