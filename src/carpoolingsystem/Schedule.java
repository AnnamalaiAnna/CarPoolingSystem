/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carpoolingsystem;
import java.util.Date;

/**
 *
 * @author Radhika
 */
public class Schedule {
private float cost;
private Date startDate;
private Date endDate;
private boolean schedStatus;
private Passenger pass;
private Ride ride;

public Schedule(){
    
}
public Schedule(Date gstartDate, Date gendDate, Passenger gpass, Ride gride){
    startDate=gstartDate;
    endDate=gendDate;
    pass=gpass;
    ride=gride;
}
public float getCost(){
    //cost= cost/mile*no of days* no of miles per day
    return cost;
}
public Date getStartDate(){
    return startDate;
}
public Date getEndDate(){
    return endDate;
}
public void deleteSchedule(){
schedStatus=false;
    //
}
public void modifySchedule(Date givenStartDate, Date givenEndDate){
 //check if different
 //deleteSchedule()
 //Schedule(parameters)  
}

public void printReciept(){
 //getcost
    //getenddate
    //getstartdate
    //getcustomerName
    //display reciept
}
}
