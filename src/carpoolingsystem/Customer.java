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
abstract public class Customer implements Serializable, Comparable<Customer> {

    private final long customerId;
    private String fName;
    private String lName;
    private Date dob;
    private Gender sex;
    private String email;
    private String mobile;
    private String address;
    private boolean status;
    private LinkedList<Review> reviewList = new LinkedList<Review>();

    public LinkedList<Review> getReviewList() {
        return reviewList;
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getfName() {
        return fName;
    }

    public String getName() {
        return fName + " " + lName;
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

    public abstract LinkedList<Customer> deactivateCustomer();

    @Override
    public int compareTo(Customer t) {
        if (this.customerId < t.customerId) {
            return -1;
        } else if (this.customerId > t.customerId) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Comparator<Customer> FirstNameComparator = new Comparator<Customer>() {
        @Override
        public int compare(Customer customer1, Customer customer2) {
            return customer1.getfName().compareToIgnoreCase(customer2.getfName());
        }
    };

    public static Comparator<Customer> LastNameComparator = new Comparator<Customer>() {
        @Override
        public int compare(Customer customer1, Customer customer2) {
            return customer1.getlName().compareToIgnoreCase(customer2.getlName());
        }
    };

    public void disableCustomer() {
        this.status = false;
    }

    public Review searchReview(Customer reviewer) {
        Review returnReview = null;
        if (!reviewList.isEmpty()) {
            for (Review review : reviewList) {
                if (review.getCustomer().equals(reviewer)) {
                    returnReview = review;
                    break;
                }
            }
        }
        return returnReview;

    }

    @Override
    public String toString(){
    String ret = String.format("%-20s%-40s%-30s",this.getCustomerId(),this.getName(),this.getMobile());    
    return ret;
    }
    
    public void addReview() {

    }

}
