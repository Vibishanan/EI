package Device_Interface_and_Concrete_Classes;

public class Thermostat implements Device {
    private int id;
    private int temperature;

    public Thermostat(int id) {
        this.id = id;
        this.temperature = 70; // default temperature
    }

    @Override
    public int getId() {
        return id;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void turnOn() {
        // Implement turn on logic for thermostat if needed
    }

    @Override
    public void turnOff() {
        // Implement turn off logic for thermostat if needed
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees";
    }

    @Override
    public void update() {
        // Update logic if needed
    }
}
