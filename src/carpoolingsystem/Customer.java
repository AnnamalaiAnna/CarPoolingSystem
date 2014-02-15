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
abstract public class Customer {
    private int customerId;
    private String fName;
    private String lName;
    private Date dob; 
    enum sex{Male,Female};
    private sex value;
    private String email;
    private String mobile;
    private String address;
    private boolean bustStatus;
    //private LinkedList<Review> reviewList = new LinkedList<Review>();
    public void modifyCust(String fName,String lName,sex value, Date dob, String email, String mobile, String address)
    {
        
    }
    
    public void deleteCust()
    {
        
    }
    
    public void changeCustStatus()
    {
        
    }
    
    public void searchReview()
    {
        
    }
    
    public void addReview()
    {
        
    }
}
