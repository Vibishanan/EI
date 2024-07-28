package Device_Interface_and_Concrete_Classes;

public class DeviceProxy implements Device {
    private Device device;

    public DeviceProxy(Device device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        // Add access control logic if needed
        device.turnOn();
    }

    @Override
    public void turnOff() {
        // Add access control logic if needed
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }

    @Override
    public int getId() {
        return device.getId();
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
