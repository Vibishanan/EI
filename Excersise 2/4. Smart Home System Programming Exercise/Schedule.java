package Device_Interface_and_Concrete_Classes;

public class Schedule {
    private int deviceId;
    private String time;
    private String command;

    public Schedule(int deviceId, String time, String command) {
        this.deviceId = deviceId;
        this.time = time;
        this.command = command;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getTime() {
        return time;
    }

    public String getCommand() {
        return command;
    }
}
