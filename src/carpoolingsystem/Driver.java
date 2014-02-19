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
public class Driver extends Customer {

    private String dlNumber;
    private String carNumber;
    private String insurance;
    private LinkedList<Ride> rideHistory = new LinkedList<Ride>();

    public String getDlNumber() {
        return dlNumber;
    }

    public void setDlNumber(String dlNumber) {
        this.dlNumber = dlNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public Driver() {
        super();
        this.dlNumber = null;
        this.carNumber = null;
        this.insurance = null;
    }

    public Driver(long customerId, String dlNumber, String carNumber, String insurance, String fName, String lName, Date dob, Gender sex, String email, String mobile, String address) {
        super(customerId, fName, lName, dob, sex, email, mobile, address);
        this.dlNumber = dlNumber;
        this.carNumber = carNumber;
        this.insurance = insurance;
    }

    public Ride getActiveRide() {
        Ride a = null;
        return a;
    }

    public void addRide() {

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
        this.setCarNumber(carNumber);
        this.setDlNumber(dlNumber);
        this.setInsurance(insurance);
    }

    @Override
    public void deactivateCustomer() {
        Ride activeRide = getActiveRide();
        if (activeRide != null) {
            activeRide.deactivateRide();
        }
        this.disableCustomer();
    }
}
