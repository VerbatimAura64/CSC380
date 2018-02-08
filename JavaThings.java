package javathings;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 *
 */
public class JavaThings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        
        Customer[] customers = getCustomers();
        PrintWriter custOutput = createFile("/Users/Blazer88/Documents/text files/customers.txt");
        
        for (Customer person : customers) {
            createCustomers(person, custOutput);
        }
        custOutput.close();
        getFileInfo();
    } 


    private static class Customer {

        public String firstName;
        public String lastName;
        public int custAge;
        public int CCNum;

        public Customer(String firstName, String lastName, int custAge, int CCNum) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.custAge = custAge;
            this.CCNum = CCNum;
        }
    }

    private static Customer[] getCustomers() {
        Customer[] customers = new Customer[6];
        customers[0] = new Customer("John", "Smith", 21, 1212);
        customers[1] = new Customer("Paul", "Smith", 29, 1213);
        customers[2] = new Customer("Rob", "Smith", 27, 1234);
        customers[3] = new Customer("Kameron", "Smith", 24, 1215);
        customers[4] = new Customer("Brian", "Smith", 25, 1243);
        customers[5]= new Customer("Quintice", "Witt", 110, 1111);
        return customers;

    }

    private static PrintWriter createFile(String fileName) {
        try {
            File listOfNames = new File(fileName);
            PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(new FileWriter(listOfNames)));
            return infoToWrite;
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
            System.exit(0);
        }
        return null;
    }

    private static void createCustomers(Customer customer, PrintWriter custOutput) {
        String custInfo = customer.firstName + " " + customer.lastName + " ";
        custInfo += Integer.toString(customer.custAge) + " ";
        custInfo += Integer.toString(customer.CCNum);
        custOutput.println(custInfo);
    }

    private static void getFileInfo() {
        System.out.println("Info Written to File\n");
        File listOfNames = new File("/Users/Blazer88/Documents/text files/customers.txt");
        try {

            // FileReader reads character files
            // BufferedReader reads as many characters as possible
            BufferedReader getInfo = new BufferedReader(new FileReader(listOfNames));

            // Reads a whole line from the file and saves it in a String
            String custInfo = getInfo.readLine();
            // readLine returns null when the end of the file is reached

            while (custInfo != null) {

                 System.out.println(custInfo);
                // Break lines into pieces
                String[] indivCustData = custInfo.split(" ");
                // Convert the String into an integer with parseInt
                int custAge = Integer.parseInt(indivCustData[2]);
                System.out.print("Customer " + indivCustData[0] + " is " + custAge + "\n");
                custInfo = getInfo.readLine();
            }

        } // Can be thrown by FileReader
        catch (FileNotFoundException e) {
            System.out.println("Couldn't Find the File");
            System.exit(0);
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
            System.exit(0);
        }
    }

}

