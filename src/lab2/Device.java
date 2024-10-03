package lab2;

public abstract class Device {
    protected boolean status;
    public Device(boolean status){
        this.status = status;
    }
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void getStatus();
}
