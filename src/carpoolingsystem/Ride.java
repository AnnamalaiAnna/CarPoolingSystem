/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpoolingsystem;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author alu
 */
public class Ride {
    Driver drv;
    LinkedList<Schedule> schedList = new LinkedList<Schedule>();
    String origin;
    String dest;
    int capacity;
    Date sStartDate;
    Date sEndDate;
    boolean smookingAllowed;
    boolean rideStatus;
    
    public void verifyAvailability(Date sDate, Date eDate, String origin, String Dest){}
    public void addSched(Schedule sched){}
    public void getDriver(){}
    public void getAffectedSched(Date nSDate, Date nEDate){}
    public void delete(){}
    public void modifyNRecreate(){}
    public void getAffectedSched(){}
    public void printReceipt(){}
}
