/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpoolingsystem;

import static carpoolingsystem.Customer.FirstNameComparator;
import static carpoolingsystem.Customer.LastNameComparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    enum SortType {

        ByID, ByFName, ByLName
    }

    enum SortStatus {

        Active, InActive, Both
    }

    enum ReportType {

        Customer, Ride, Schedule
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
        String[] folders = {"Receipts", "Reports"};
        for (String folder : folders) {
            File receiptDir = new File(folder);
            if (!receiptDir.exists()) {
                receiptDir.mkdir();
            }
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
                if (driver.getRideHistory().getLast().getStatus()) {
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

    private void doSorting(SortType sortType) {
        if (sortType == SortType.ByFName) {
            Collections.sort(customerlist, FirstNameComparator);
        } else if (sortType == SortType.ByLName) {
            Collections.sort(customerlist, LastNameComparator);
        } else {
            Collections.sort(customerlist);
        }
    }

    private void writeReport(ReportType reportType, SortType sortType, SortStatus sortStatus, StringBuilder sb) {
        try {
            if (sb.length() == 0) {
                JOptionPane.showMessageDialog(null, "No details found", "REPORT-INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            Date today = new Date();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd_hh-mm-ss");
            File dir = new File("Reports");
            String fileName = reportType.toString() + "_Report_" + sortType.toString() + "_" + sortStatus.toString() + "_" + dateFormat.format(today) + ".txt";
            PrintWriter writer;
            writer = new PrintWriter(new File(dir, fileName));
            writer.println(sb.toString());
            writer.close();
//            if (Desktop.isDesktopSupported()) {
//                Desktop.getDesktop().open(new File(dir, fileName));
//            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CarPoolingSystem.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(CarPoolingSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void generateCustomerReport(SortType sortType, SortStatus sortStatus) {
        doSorting(sortType);

        StringBuilder sb = new StringBuilder();

        for (Customer customer : customerlist) {
            if ((sortStatus == SortStatus.Active && !customer.getCustomerStatus()) || (sortStatus == SortStatus.InActive && customer.getCustomerStatus())) {
                continue;
            }
            sb.append(String.format("Customer Id: %-20d First Name: %-20S Last Name: %-20S Status: %-20S", customer.getCustomerId(), customer.getfName(), customer.getlName(), customer.getCustomerStatus()));
            sb.append(System.getProperty("line.separator"));
        }
        writeReport(ReportType.Customer, sortType, sortStatus, sb);
    }

    public void generateRideReport(SortType sortType, SortStatus sortStatus, Date startDate, Date endDate, String origin, String destination) {
        doSorting(sortType);

        StringBuilder sb = new StringBuilder();
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");

        for (Customer customer : customerlist) {
            if (customer instanceof Driver) {
                LinkedList<Ride> rideHistory = ((Driver) customer).getRideHistory();
                for (Ride ride : rideHistory) {
                    if ((sortStatus == SortStatus.Active && !ride.getStatus()) || (sortStatus == SortStatus.InActive && ride.getStatus())) {
                        continue;
                    }
                    if ((startDate != null) && (endDate != null) && ((startDate.compareTo(ride.getStartDate()) > 0) || (endDate.compareTo(ride.getEndDate()) < 0))) {
                        continue;
                    }
                    if ((origin.length() > 0) && (destination.length() > 0) && ((origin.compareToIgnoreCase(ride.getOrigin()) != 0) || (destination.compareToIgnoreCase(ride.getDestination()) != 0))) {
                        continue;
                    }
                    sb.append(String.format("Customer Id: %-20d First Name: %-20S Last Name: %-20S Status: %-20S Origin: %-20S Destination: %-20S Capacity: %-5d Start Date: %-20S End Date: %-20S", customer.getCustomerId(), customer.getfName(), customer.getlName(), customer.getCustomerStatus(), ride.getOrigin(), ride.getDestination(), ride.getCapacity(), dateFormat.format(ride.getStartDate()), dateFormat.format(ride.getEndDate())));
                    sb.append(System.getProperty("line.separator"));
                }
            }
        }
        writeReport(ReportType.Ride, sortType, sortStatus, sb);
    }

    public void generateScheduleReport(SortType sortType, SortStatus sortStatus, Date startDate, Date endDate, String origin, String destination) {
        doSorting(sortType);

        StringBuilder sb = new StringBuilder();
        DateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");

        for (Customer customer : customerlist) {
            if (customer instanceof Passenger) {
                LinkedList<Schedule> scheduleHistory = ((Passenger) customer).getScheduleHistory();
                for (Schedule schedule : scheduleHistory) {
                    if ((sortStatus == SortStatus.Active && !schedule.getStatus()) || (sortStatus == SortStatus.InActive && schedule.getStatus())) {
                        continue;
                    }
                    if ((startDate != null) && (endDate != null) && ((startDate.compareTo(schedule.getRide().getStartDate()) > 0) || (endDate.compareTo(schedule.getRide().getEndDate()) < 0))) {
                        continue;
                    }
                    if ((origin.length() > 0) && (destination.length() > 0) && ((origin.compareToIgnoreCase(schedule.getRide().getOrigin()) != 0) || (destination.compareToIgnoreCase(schedule.getRide().getDestination()) != 0))) {
                        continue;
                    }
                    sb.append(String.format("Customer Id: %-20d First Name: %-20S Last Name: %-20S Status: %-20S Origin: %-20S Destination: %-20S Start Date: %-20S End Date: %-20S", customer.getCustomerId(), customer.getfName(), customer.getlName(), customer.getCustomerStatus(), schedule.getRide().getOrigin(), schedule.getRide().getDestination(), dateFormat.format(schedule.getStartDate()), dateFormat.format(schedule.getEndDate())));
                    sb.append(System.getProperty("line.separator"));
                }
            }
        }
        writeReport(ReportType.Schedule, sortType, sortStatus, sb);
    }
}
