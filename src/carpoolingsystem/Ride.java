/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author alu
 */
public class Ride implements Serializable, Receipt {

    private Driver driver;
    private LinkedList<Schedule> scheduleList = new LinkedList<Schedule>();
    private String origin;
    private String destination;
    private int capacity;
    private Date startDate;
    private Date endDate;
    private boolean smokingAllowed;
    private boolean status;

    Ride() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Ride(Ride ride) {
        this.origin = ride.origin;
        this.destination = ride.destination;
        this.capacity = ride.capacity;
        this.startDate = ride.startDate;
        this.endDate = ride.endDate;
        this.status = ride.status;
        this.driver = ride.driver;
    }

    Ride(String origin, String destination, int capacity, Date startDate, Date endDate, Driver driver) {
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = true;
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public boolean isSmokingAllowed() {
        return smokingAllowed;
    }

    public void setSmokingAllowed(boolean smokingAllowed) {
        this.smokingAllowed = smokingAllowed;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean verifyAvailability(Date sDate, Date eDate) {
        if (startDate.compareTo(sDate) <= 0 && endDate.compareTo(eDate) >= 0) {
            int cap = capacity;
            for (Schedule schedule : scheduleList) {
                if (schedule.getStatus()) {
                    if (schedule.getStartDate().compareTo(eDate) <= 0 && schedule.getEndDate().compareTo(sDate) >= 0) {
                        cap--;
                    }
                }
            }
            if (cap > 0) {
                return true;
            }
        }
        return false;
    }

    public void addSchedule(Schedule schedule) {
        scheduleList.add(schedule);
    }

    public LinkedList<Customer> getAffectedSchedules(Date sDate, Date eDate) {
        LinkedList<Customer> returnList = new LinkedList<Customer>();
        for (Schedule schedule : scheduleList) {
            if (schedule.getStartDate().compareTo(sDate) >= 0 && schedule.getEndDate().compareTo(eDate) <= 0) {
                continue;
            } else {
                returnList.add(schedule.getPassenger());
                schedule.deactivateSchedule();
            }
        }
        return returnList;
    }

    public LinkedList<Customer> deactivateRide() {
        LinkedList<Schedule> affectedSchedules = this.getScheduleList();
        LinkedList<Customer> returnList = new LinkedList<Customer>();
        for (Schedule schedule : affectedSchedules) {
            if (schedule.getStatus()) {
                returnList.add(schedule.getPassenger());
                schedule.deactivateSchedule();
            }
        }
        status = false;
        return returnList;
    }

    public Ride modifyNRecreate(Date sDate, Date eDate) {
        Ride newRide = new Ride(this);
        this.setStatus(false);
        newRide.setStartDate(sDate);
        newRide.setEndDate(eDate);
        return newRide;
    }

    public LinkedList<Schedule> getScheduleList() {
        return scheduleList;
    }

    public void printReceipt(Customer customer) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Driver Id: %-20d", customer.getCustomerId()));
        sb.append(System.getProperty("line.separator"));
        sb.append(String.format("First Name: %-20SLast Name: %-20S", customer.getfName(), customer.getlName()));
        sb.append(System.getProperty("line.separator"));
        sb.append(String.format("Origin: %-20SDestination: %-20S\n", getOrigin(), getDestination()));
        sb.append(System.getProperty("line.separator"));
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
        sb.append(String.format("Start Date: %-20SEnd Date: %-20S\n", dateFormat.format(getStartDate()), dateFormat.format(getEndDate())));
        Date today = new Date();
        dateFormat = new SimpleDateFormat("yyyy-mm-dd_hh-mm-ss");
        String fileName = ".\\Receipts\\Ride_Receipt_" + dateFormat.format(today) + ".txt";
        PrintWriter writer;
        try {
            writer = new PrintWriter(fileName, "UTF-8");
            writer.println(sb.toString());
            writer.close();
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(Ride.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
