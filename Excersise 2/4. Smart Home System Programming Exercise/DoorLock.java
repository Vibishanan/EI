package Device_Interface_and_Concrete_Classes;

public class DoorLock implements Device {
    private int id;
    private boolean isLocked;

    public DoorLock(int id) {
        this.id = id;
        this.isLocked = true; // default locked state
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void turnOn() {
        isLocked = true;
    }

    @Override
    public void turnOff() {
        isLocked = false;
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + (isLocked ? "Locked" : "Unlocked");
    }

    @Override
    public void update() {
        // Update logic if needed
    }
}
