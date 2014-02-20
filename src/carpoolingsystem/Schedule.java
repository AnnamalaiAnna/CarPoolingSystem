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
public class Schedule implements Serializable{

    private float cost;
    private Date startDate;
    private Date endDate;
    private boolean status;
    private Passenger passenger;
    private Ride ride;

    public Schedule() {

    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Schedule(Date gstartDate, Date gendDate, Passenger gpass, Ride gride) {
        startDate = gstartDate;
        endDate = gendDate;
        passenger = gpass;
        ride = gride;
    }

    public float getCost() {
        //cost= cost/mile*no of days* no of miles per day
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

    public void modifySchedule(Date givenStartDate, Date givenEndDate) {
        //check if different
        //deleteSchedule()
        //Schedule(parameters)  
    }

    public void printReciept() {
        //getcost
        //getenddate
        //getstartdate
        //getcustomerName
        //display reciept
    }
}
