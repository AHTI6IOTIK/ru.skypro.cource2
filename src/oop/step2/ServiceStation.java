package oop.step2;

public class ServiceStation {
    public void check(CheckableInterface checkableTransport) {
        checkableTransport.check();
    }

    public void check(CheckableInterface[] transports) {
        for (CheckableInterface transport : transports) {
            check(transport);
        }
    }
}
