/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.util.Date;
import java.util.LinkedList;
import org.jdesktop.swingx.JXLoginPane.Status;

/**
 *
 * @author Nagul
 */
public class CarPoolingSystem {

    public double costpermile;
    public LinkedList<Customer> Customerlist = new LinkedList<Customer>();

    enum Type {

        Driver,
        Passenger
    }

    public CarPoolingSystem() {
        costpermile = 0;
    }

    public CarPoolingSystem(double costpermile) {
        this.costpermile = costpermile;
    }

    public void addCustomer(Customer customer) {
        this.Customerlist.add(customer);
    }

    public void addRide(Ride r) {
    }

    public LinkedList<Customer> searchCustomer(long customerId, String fName, String lName, String email, String mobile) {
        LinkedList<Customer> returnList = new LinkedList<Customer>();
        for (Customer customer : Customerlist) {
            if ((customerId > 0) && (customer.getCustomerId() == customerId)) {
                returnList.add(customer);
                break;
            }
            if ((email != null) && (email.compareToIgnoreCase(customer.getEmail()) == 0)) {
                returnList.add(customer);
                break;
            }
            if ((mobile != null) && (mobile.compareToIgnoreCase(customer.getMobile()) == 0)) {
                returnList.add(customer);
                break;
            }
            if ((fName != null) && (fName.compareToIgnoreCase(customer.getfName()) == 0)) {
                returnList.add(customer);
                continue;
            }
            if ((lName != null) && (lName.compareToIgnoreCase(customer.getlName()) == 0)) {
                returnList.add(customer);
                continue;
            }
        }
        return returnList;
    }

    public void calcCost(Date sDate, Date eDate, String origin, String dest) {
    }

    public void getAvailableRide(Date sDate, Date eDate, String origin, String dest) {
    }

    public void validateCust(long customerId, Type type) {
    }

    public void searchRide(Customer c) {
    }

    public void printCustByName(Type t) {
    }

    public void printRideByOrigin(Status s) {
    }

}
