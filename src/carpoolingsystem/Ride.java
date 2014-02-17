/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author alu
 */
public class Ride {

    private Driver drv;
    private LinkedList<Schedule> scheduleList = new LinkedList<Schedule>();
    private String origin;
    private String dest;
    private int capacity;
    private Date sStartDate;
    private Date sEndDate;
    private boolean smookingAllowed;
    private boolean status;

    public void verifyAvailability(Date sDate, Date eDate, String origin, String Dest) {
    }

    public void addSched(Schedule sched) {
    }

    public void getDriver() {
    }

    public LinkedList<Schedule> getAffectedSchedules(Date nSDate, Date nEDate) {
        LinkedList<Schedule> returnList = new LinkedList<Schedule>();
        return returnList;
    }

    public void deactivateRide() {
        LinkedList<Schedule> affectedSchedules = this.getScheduleList();
        for (Schedule schedule : affectedSchedules) {
            if (schedule.getStatus()) {
                schedule.deactivateSchedule();
            }
        }
        status = false;
    }

    public void modifyNRecreate() {
    }

    public LinkedList<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void printReceipt() {
    }
}
