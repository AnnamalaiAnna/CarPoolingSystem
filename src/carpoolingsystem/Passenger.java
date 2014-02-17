/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.util.*;

/**
 *
 * @author Rajesh
 */
public class Passenger extends Customer {

    private boolean smokingPref;
    private LinkedList<Schedule> scheduleHistory = new LinkedList<Schedule>();

    public boolean isSmokingPref() {
        return smokingPref;
    }

    public void setSmokingPref(boolean smokingPref) {
        this.smokingPref = smokingPref;
    }

    public Passenger() {
        super();
        this.smokingPref = false;
    }

    public Passenger(boolean smokingPref, String fName, String lName, Date dob, Gender sex, String email, String mobile, String address) {
        super(fName, lName, dob, sex, email, mobile, address);
        this.smokingPref = smokingPref;
    }

    public Schedule getActiveSched() {
        for (Schedule schedule : scheduleHistory) {
            if (schedule.getStatus()) {
                return schedule;
            }
        }
        return null;
    }

    public void addSched() {

    }

    @Override
    public void modifyCustomer(String fName, String lName, Gender sex, Date dob, String email, String mobile, String address, String dlNumber, String carNumber, String insurance, boolean smokingPref) {
        this.setfName(fName);
        this.setlName(lName);
        this.setSex(sex);
        this.setDob(dob);
        this.setEmail(email);
        this.setMobile(mobile);
        this.setAddress(address);
        this.setSmokingPref(smokingPref);
    }

    @Override
    public void deactivateCustomer() {
        Schedule activeSchedule = this.getActiveSched();
        if (activeSchedule != null) {
            activeSchedule.deactivateSchedule();
        }
        this.disableCustomer();
    }
}
