package Device_Interface_and_Concrete_Classes;

import java.util.Scanner;

public class SmartHomeSystem {
    public static void main(String[] args) {
        CentralHub hub = new CentralHub();
        Scheduler scheduler = new Scheduler();
        Automation automation = new Automation();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Select an option:");
                System.out.println("1. Add Device");
                System.out.println("2. Remove Device");
                System.out.println("3. Turn On Device");
                System.out.println("4. Turn Off Device");
                System.out.println("5. Set Schedule");
                System.out.println("6. Add Automation Trigger");
                System.out.println("7. Show Device Statuses");
                System.out.println("8. Show Schedules");
                System.out.println("9. Check Automation Triggers");
                System.out.println("10. Exit");

                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        System.out.print("Enter device type (light, thermostat, door): ");
                        String type = scanner.nextLine();
                        System.out.print("Enter device ID: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        Device device = DeviceFactory.createDevice(type, id);
                        hub.addDevice(device);
                        System.out.println(type + " with ID " + id + " added.");
                        break;

                    case 2:
                        System.out.print("Enter device ID to remove: ");
                        int removeId = Integer.parseInt(scanner.nextLine());
                        Device removedDevice = hub.removeDevice(removeId);
                        if (removedDevice != null) {
                            System.out.println("Device with ID " + removeId + " removed.");
                        } else {
                            System.out.println("Device not found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter device ID to turn on: ");
                        int onId = Integer.parseInt(scanner.nextLine());
                        Device deviceToTurnOn = hub.getDeviceById(onId);
                        if (deviceToTurnOn != null) {
                            deviceToTurnOn.turnOn();
                            System.out.println("Device with ID " + onId + " turned on.");
                        } else {
                            System.out.println("Device not found.");
                        }
                        break;

                    case 4:
                        System.out.print("Enter device ID to turn off: ");
                        int offId = Integer.parseInt(scanner.nextLine());
                        Device deviceToTurnOff = hub.getDeviceById(offId);
                        if (deviceToTurnOff != null) {
                            deviceToTurnOff.turnOff();
                            System.out.println("Device with ID " + offId + " turned off.");
                        } else {
                            System.out.println("Device not found.");
                        }
                        break;

                    case 5:
                        System.out.print("Enter device ID to schedule: ");
                        int scheduleId = Integer.parseInt(scanner.nextLine());
                        System.out.print("Enter time (HH:MM): ");
                        String time = scanner.nextLine();
                        System.out.print("Enter command (Turn On/Turn Off): ");
                        String command = scanner.nextLine();
                        scheduler.setSchedule(scheduleId, time, command);
                        System.out.println("Schedule set for device with ID " + scheduleId + " at " + time + " to " + command);
                        break;

                    case 6:
                        System.out.print("Enter condition (e.g., temperature > 75): ");
                        String condition = scanner.nextLine();
                        System.out.print("Enter action (e.g., turnOff(1)): ");
                        String action = scanner.nextLine();
                        automation.addTrigger(condition, action);
                        System.out.println("Trigger added: " + condition + " -> " + action);
                        break;

                    case 7:
                        hub.showDeviceStatuses();
                        break;

                    case 8:
                        scheduler.showSchedules();
                        break;

                    case 9:
                        automation.checkTriggers(hub);
                        break;

                    case 10:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
