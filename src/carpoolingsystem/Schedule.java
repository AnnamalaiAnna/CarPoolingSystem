/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Radhika
 */
public class Schedule implements Serializable, Receipt {

    private double cost;
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
        this.cost = calculateCost(startDate, endDate);
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

    public double getCost() {
        return cost;
    }

    public String getCostStr() {
        return String.format("%5.2f", cost);
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

//    public double round(double unrounded, int precision, int roundingMode) {
//        BigDecimal bd = new BigDecimal(unrounded);
//        BigDecimal rounded = bd.setScale(precision, roundingMode);
//        return rounded.doubleValue();
//    }
    public double calculateCost(Date startDate, Date endDate) {
        //return daysBetween(startDate, endDate) * round(CarPoolingSystem.costPerDay, 2, BigDecimal.ROUND_HALF_UP);
        return daysBetween(startDate, endDate) * CarPoolingSystem.costPerDay;
    }

    public int daysBetween(Date d1, Date d2) {
        int days = (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
//        if (days > 0) {
//            days = days + 1;
//        }
        return days + 1;
    }

    @Override
    public void printReceipt(Customer customer) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Driver Id: %-20d Driver Name: %-20S %-20S Contact Number: %-10S", ride.getDriver().getCustomerId(), ride.getDriver().getfName(), ride.getDriver().getlName(), ride.getDriver().getMobile()));
        sb.append(System.getProperty("line.separator"));
        sb.append(String.format("First Name: %-20SLast Name: %-20S", customer.getfName(), customer.getlName()));
        sb.append(System.getProperty("line.separator"));
        sb.append(String.format("Origin: %-20SDestination: %-20S", ride.getOrigin(), ride.getDestination()));
        sb.append(System.getProperty("line.separator"));
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
        sb.append(String.format("Start Date: %-10S End Date: %-10S No of Days %-5d", dateFormat.format(getStartDate()), dateFormat.format(getEndDate()), daysBetween(getStartDate(), getEndDate())));
        sb.append(System.getProperty("line.separator"));
        sb.append(String.format("Total Cost: %-5f", getCost()));

        Date today = new Date();
        dateFormat = new SimpleDateFormat("yyyy-mm-dd_hh-mm-ss");
        String fileName = ".\\Receipts\\Schedule_Receipt_" + dateFormat.format(today) + ".txt";
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
