package Device_Interface_and_Concrete_Classes;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private List<Schedule> schedules;

    public Scheduler() {
        schedules = new ArrayList<>();
    }

    public void setSchedule(int deviceId, String time, String command) {
        schedules.add(new Schedule(deviceId, time, command));
    }

    public void showSchedules() {
        for (Schedule schedule : schedules) {
            System.out.println("Device " + schedule.getDeviceId() + ": At " + schedule.getTime() + " execute " + schedule.getCommand());
        }
    }
}
