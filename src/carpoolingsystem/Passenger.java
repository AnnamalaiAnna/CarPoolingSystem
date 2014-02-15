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
public class Passenger extends Customer {
    private boolean smokingPref;
    private LinkedList<Schedule> scheduleList = new LinkedList<Schedule>();
    public Schedule getActiveSched()
    {
        Schedule s = null;
        return s;
    }
    public void addSched()
    {
        
    }
}
