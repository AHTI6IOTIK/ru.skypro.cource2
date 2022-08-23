package oop.step2;

public abstract class BaseTruckTransport extends BaseMotorTransport implements CheckableInterface {
    public BaseTruckTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    abstract public void checkTrailer();

    @Override
    public void check() {
        super.check();
        checkTrailer();
    }
}
