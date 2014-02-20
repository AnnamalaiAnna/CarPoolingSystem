/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Rajesh
 */
abstract public class Customer implements Serializable {

    private final long customerId;
    private String fName;
    private String lName;
    private Date dob;
    private Gender sex;
    private String email;
    private String mobile;
    private String address;
    private boolean status;

    public long getCustomerId() {
        return customerId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean getCustomerStatus() {
        return status;
    }

    public void setCustomerStatus(boolean status) {
        this.status = status;
    }

    enum Gender {

        Male, Female, Undefined
    };

    //private LinkedList<Review> reviewList = new LinkedList<Review>();
    public Customer() {
        this.customerId = 0;
        this.fName = null;
        this.lName = null;
        this.dob = null;
        this.sex = Gender.Undefined;
        this.email = null;
        this.mobile = null;
        this.address = null;
        this.status = true;
    }

    public Customer(long customerID, String fName, String lName, Date dob, Gender sex, String email, String mobile, String address) {
        this.customerId = customerID;
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.sex = sex;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.status = true;
    }

    public abstract void modifyCustomer(String fName, String lName, Gender sex, Date dob, String email, String mobile, String address, String dlNumber, String carNumber, String insurance, boolean smokingPref);

    public abstract void deactivateCustomer();

    public void disableCustomer() {
        this.status = false;
    }

    public void searchReview() {

    }

    public void addReview() {

    }

}
