/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.LinkedList;
import org.jdesktop.swingx.JXLoginPane.Status;
import javax.swing.JOptionPane;

/**
 *
 * @author Nagul
 */
public class CarPoolingSystem implements Serializable {

    public double costpermile;
    public LinkedList<Customer> Customerlist = new LinkedList<Customer>();

    enum Type {

        Driver,
        Passenger
    }

    public static void main(String[] args) throws IOException {
        
        CarPoolingSystem cps = (CarPoolingSystem) deSerialize("CarPoolingSystem.dat");
        if (cps == null) {
            cps = new CarPoolingSystem(5.2);
        }
        //checkAndCreateFileSystem();
        HomeGUI home = new HomeGUI(cps);
        home.setVisible(true);
    }

    public static Object deSerialize(String filePath) {
        Path cpsFile = Paths.get(filePath);
        if (Files.notExists(cpsFile)) {
            return null;
        } else {
            try {
                FileInputStream fis = new FileInputStream(filePath);
                Object o;
                try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                    o = ois.readObject();
                }
                return o;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "EXCEPTION", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        }
    }

    public static void serialize(Object obj, String filePath) {
        try {
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(obj);
                oos.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "EXCEPTION", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void checkAndCreateFileSystem() throws IOException {
        //Path p1 = Paths.get("CarPoolingSystem.dat");
//        if (Files.notExists(p1)) {
//            JOptionPane.showMessageDialog(null, "File is present", "LOG", JOptionPane.INFORMATION_MESSAGE);
//        } else {
//            JOptionPane.showMessageDialog(null, "File is absent", "LOG", JOptionPane.INFORMATION_MESSAGE);
//            File f = new File("CarPoolingSystem.dat");
//            f.createNewFile();
//        }
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
        if (customerId == 0) {
            return Customerlist;
        }
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
