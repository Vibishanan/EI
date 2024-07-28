package Device_Interface_and_Concrete_Classes;

import java.util.ArrayList;
import java.util.List;

public class Automation {
    private List<Trigger> triggers;

    public Automation() {
        triggers = new ArrayList<>();
    }

    public void addTrigger(String condition, String action) {
        triggers.add(new Trigger(condition, action));
    }

    public void checkTriggers(CentralHub hub) {
        for (Trigger trigger : triggers) {
            // For simplicity, assume the condition is in the format "temperature > 75"
            String[] parts = trigger.getCondition().split(" ");
            String type = parts[0];
            String operator = parts[1];
            int value = Integer.parseInt(parts[2]);

            for (Device device : hub.getDevices()) {
                if (device instanceof Thermostat) {
                    Thermostat thermostat = (Thermostat) device;
                    int temp = thermostat.getTemperature();

                    boolean conditionMet = false;
                    switch (operator) {
                        case ">":
                            conditionMet = temp > value;
                            break;
                        case "<":
                            conditionMet = temp < value;
                            break;
                        case "=":
                            conditionMet = temp == value;
                            break;
                    }

                    if (conditionMet) {
                        // For simplicity, assume the action is in the format "turnOff(1)"
                        String[] actionParts = trigger.getAction().split("[()]");
                        String actionCommand = actionParts[0];
                        int actionId = Integer.parseInt(actionParts[1]);

                        Device actionDevice = hub.getDeviceById(actionId);
                        if (actionDevice != null) {
                            if ("turnOn".equals(actionCommand)) {
                                actionDevice.turnOn();
                            } else if ("turnOff".equals(actionCommand)) {
                                actionDevice.turnOff();
                            }
                        }
                    }
                }
            }
        }
    }
}
