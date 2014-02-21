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
    long custIdGenerator;
    public LinkedList<Customer> customerlist = new LinkedList<Customer>();

    enum Type {

        Driver,
        Passenger
    }

    public static void main(String[] args) throws IOException {

        CarPoolingSystem cps = (CarPoolingSystem) deSerialize("CarPoolingSystem.dat");
        if (cps == null) {
            cps = new CarPoolingSystem(5.2);
        }
        checkAndCreateFileSystem();
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
        File receiptDir = new File("Receipts");
        if (!receiptDir.exists()) {
            receiptDir.mkdir();
        }
    }

    public long generateCustomerId() {
        return custIdGenerator += 1;
    }

    public CarPoolingSystem() {
        costpermile = 0;
        custIdGenerator = 0;
    }

    public CarPoolingSystem(double costpermile) {
        this.costpermile = costpermile;
        custIdGenerator = 0;
    }

    public void addCustomer(Customer customer) {
        this.customerlist.add(customer);
    }

    public void addRide(Ride r) {
    }

    public LinkedList<Customer> searchCustomer(long customerId, String fName, String lName, String email, String mobile) {

        LinkedList<Customer> returnList = new LinkedList<Customer>();
        /*if (customerId == 0) {
         return Customerlist;
         }*/
        for (Customer customer : customerlist) {
            if (!customer.getCustomerStatus()) {
                continue;
            }
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

    public LinkedList<Ride> getAvailableRide(Date sDate, Date eDate, String origin, String dest) {
        LinkedList<Ride> returnList = new LinkedList<Ride>();
        for (Customer customer : customerlist) { 
            if (customer.getCustomerStatus() == true && customer instanceof Driver) {
                Driver driver = (Driver) customer;
                if (driver.getRideHistory().getLast().isStatus()) {
                    if ((driver.getRideHistory().getLast().getOrigin()).equals(origin) && (driver.getRideHistory().getLast().getDestination()).equals(dest)) {
                        if (driver.getRideHistory().getLast().verifyAvailability(sDate, eDate)) {
                            returnList.add(driver.getRideHistory().getLast());
                        }
                    }
                }
            }
        }
        return returnList;
    }

    public boolean validateCust(long customerId, Type type) {
        LinkedList<Customer> returnList = new LinkedList<Customer>();
        returnList = searchCustomer(customerId, null, null, null, null);
        Customer c = returnList.get(0);
        if (c != null) {
            if (type == Type.Driver && (c instanceof Driver)) {
                return true;
            } else if (type == Type.Passenger && (c instanceof Passenger)) {
                return true;
            }
        }
        return false;
    }

    public void searchRide(Customer c) {
    }

    public void printCustByName(Type t) {
    }

    public void printRideByOrigin(Status s) {
    }

}
