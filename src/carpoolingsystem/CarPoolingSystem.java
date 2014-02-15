/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpoolingsystem;

import java.util.Date;
import org.jdesktop.swingx.JXLoginPane.Status;
import static org.omg.IOP.CodecPackage.TypeMismatchHelper.type;

/**
 *
 * @author Nagul
 */
public class CarPoolingSystem {
    public double costpermile = 5.2;
    //public LinkedList<Customer> Customerlist = new LinkedList>Customer>();
    
    public void addCust(customer c){}
    
    public void addRide(ride r){ }
    
    public void searchCust(int customerId, String fName, String lName, String email, String mobile){}
    
    public void calcCost(Date sDate, Date eDate, String origin, String dest){}
    
    public void getAvailableRide(Date sDate, Date eDate, String origin, String dest){}
    
    public void validateCust(int customerId, type){}
    
    public void searchRide(Customer c){}
    
    public void printCustByName(Type t){}
    
    public void printRideByOrigin(Status s){}
    
}