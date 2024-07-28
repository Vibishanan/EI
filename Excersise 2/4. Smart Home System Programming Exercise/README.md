Smart Home System
This project simulates a Smart Home System that manages various smart devices such as lights, thermostats, and door locks. It allows adding, removing, and controlling devices, setting schedules, and adding automation triggers.

Features
Add and Remove Devices: Manage devices in the system.
Turn Devices On and Off: Control the state of devices.
Set Schedules: Schedule actions for devices.
Add Automation Triggers: Create triggers for automating device actions based on conditions.
Show Device Statuses: Display the current status of all devices.
Show Schedules: Display all set schedules.
Design Patterns Used
Factory Method Pattern: Used for creating different types of devices.
Singleton Pattern: Not explicitly shown here but can be implemented for managing a single instance of the CentralHub.
Project Structure
CentralHub: Manages all devices.
Device Interface: Defines the common interface for all devices.
Concrete Device Classes: Implementations of the Device interface (Light, Thermostat, DoorLock).
DeviceFactory: Creates devices based on the provided type.
Scheduler: Manages schedules for device actions.
Automation: Manages automation triggers.
Trigger: Represents a condition and action for automation.
Classes
CentralHub
Manages all smart devices in the system.

Device Interface
Defines the methods that all device types must implement.

Light, Thermostat, DoorLock
Concrete implementations of the Device interface.

DeviceFactory
Factory class to create devices based on the type.

Scheduler
Manages scheduling of device actions.

Automation
Manages automation triggers based on conditions.

Trigger
Represents a condition and the corresponding action for automation.
Contributing
Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.
