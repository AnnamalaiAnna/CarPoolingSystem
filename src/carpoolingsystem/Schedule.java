/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Radhika
 */
public class Schedule implements Serializable {

    private float cost;
    private Date startDate;
    private Date endDate;
    private boolean status;
    private Passenger passenger;
    private Ride ride;

    public Schedule() {
        this.cost = 0;
        this.startDate = null;
        this.endDate = null;
        this.passenger = null;
        this.ride = null;
        this.status = true;
    }

    public Schedule(Date startDate, Date endDate, Passenger passenger, Ride ride) {
        this.cost = 0;
        this.startDate = startDate;
        this.endDate = endDate;
        this.passenger = passenger;
        this.ride = ride;
        this.status = true;
    }

    public Schedule(Schedule s) {
        this.cost = s.cost;
        this.startDate = s.startDate;
        this.endDate = s.endDate;
        this.status = s.status;
        this.passenger = s.passenger;
        this.ride = s.ride;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Ride getRide() {
        return ride;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getCost() {
        return cost;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void deactivateSchedule() {
        status = false;
    }

    public Schedule modifySchedule(Date startDate, Date endDate) {
        Schedule newSchedule = new Schedule(this);
        newSchedule.setStartDate(startDate);
        newSchedule.setEndDate(endDate);
        ride.getScheduleList().add(newSchedule);
        passenger.getScheduleHistory().add(newSchedule);
        deactivateSchedule();
        return newSchedule;
    }

    public void printReciept() {
        //getcost
        //getenddate
        //getstartdate
        //getcustomerName
        //display reciept
    }
}
