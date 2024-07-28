package Device_Interface_and_Concrete_Classes;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class CentralHub {
    private List<Device> devices;

    public CentralHub() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public Device removeDevice(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                devices.remove(device);
                return device;
            }
        }
        return null;
    }

    public Device getDeviceById(int id) {
        for (Device device : devices) {
            if (device.getId() == id) {
                return device;
            }
        }
        return null;
    }

    public void updateAllDevices() {
        for (Device device : devices) {
            device.update();
        }
    }

    public void showDeviceStatuses() {
        for (Device device : devices) {
            System.out.println(device.getStatus());
        }
    }

    public Device[] getDevices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDevices'");
    }
}
