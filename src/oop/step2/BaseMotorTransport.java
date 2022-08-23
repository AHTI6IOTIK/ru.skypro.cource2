package oop.step2;

public abstract class BaseMotorTransport extends BaseTransport implements CheckableInterface {
    public BaseMotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    abstract public void checkEngine();

    @Override
    public void check() {
       super.check();
       checkEngine();
    }
}
