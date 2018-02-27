package outwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Bantalek
 */
public class OutWrite {

    public Scanner sc;

    public static void main(String[] args) throws FileNotFoundException {
//        Scanner kb = new Scanner(System.in);
//
//        String name, email, password, password1;
//        System.out.println("Please Write Your Name\n-->");
//        name = kb.nextLine();
//        System.out.println("Please Write Your Email address\n-->");
//        email = kb.nextLine();
//        password = verifyPassword();
//        name = properCase(name);
//
//        try {
//            //true = append , false = overwrite
//            FileWriter fw = new FileWriter("customer1.txt", true);
//            PrintWriter pw = new PrintWriter(fw);
//            pw.print(getCustID() + ":" + "\t");
//            pw.print( name + ":" + "\t");
//            pw.print(email + ":" + "\t");
//            pw.print(password + ":" + "\t\n");
//            //GET THIS FORMAT TO WORK
////            pw.print("CustomerID " + getCustID() + ":" + "\t");
////            pw.print("Username " + name + ":" + "\t");
////            pw.print("Useremail " + email + ":" + "\t");
////            pw.print("Password " + password + ":" + "\t\n");
//            pw.println();
//            pw.close();
//        } catch (IOException e) {
//            System.out.println("ERROR");
//        }
//        System.out.println("File Updated");
openFile();
readFile();
    }

    public static String verifyPassword() {
        Scanner kb = new Scanner(System.in);
        String password, password1;
        System.out.println("Please Enter Your Password\n-->");
        password = kb.nextLine();
        System.out.println("Please Verify Your Password\n-->");
        password1 = kb.nextLine();
        if (password1.equals(password)) {
            System.out.println("Passwords Match");
        } else {
            System.out.println("Passwords Do Not Match. Please Try Again.");
            verifyPassword();
        }
        return password1;
    }

    public static String properCase(String name) {
        String syntaxName = "";
        String[] word = name.split(" ");
        for (int i = 0; i < word.length; i++) {
            syntaxName += word[i].substring(0, 1).toUpperCase() + word[i].substring(1).toLowerCase() + " ";
        }

        return syntaxName.trim();
    }

//    public static String verifySyntaxEmail() {
//        String email;
//        Scanner kb = new Scanner(System.in);
//        System.out.println("Please Write Your Email address\n-->");
//        email = kb.nextLine();
//
////        boolean checkFor = email.contains("@.");
////        if (checkFor) {
////
////        } else {
////
////            getEmail();
////        }
//        String syntaxEmail = "";
//        String[] word = email.split("@.");
//        for (int i = 0; i < word.length; i++) {
//
//        }
//        return syntaxEmail.trim();
//    }
//    public static String getEmail() {
//        Scanner kb = new Scanner(System.in);
//        String email;
//        System.out.println("Please Write Your Email address\n-->");
//        email = kb.nextLine();
//        return email;
//    }
    public static int getCustID() throws FileNotFoundException {
        Random r = new Random();
// COLLISON POSSIBLE UNTIL I FIGURE OUT HOW TO AVOID RNG DUPLICATES
        int CustID = r.nextInt(10) + 1;
//        Scanner custNumChecker = new Scanner(new File("customer1.txt"));
//        ArrayList<String> custIDList = new ArrayList<String>();
//        while (custNumChecker.hasNextLine())
//            custIDList.add(custNumChecker.nextLine());
//        System.out.println(custIDList);
//        if (CustID == CustID){
//            System.out.println("Duplicate");
//            getCustID();
            
//        } 
            
    
        return CustID;
    }

    public static void openFile() {
        try {
            Scanner s = new Scanner(new File("customer1.txt"));
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    public static void readFile() throws FileNotFoundException {
        Scanner s = new Scanner(new File("customer1.txt"));
        while (s.useDelimiter(":").hasNext()) {
            String a = s.next();
            String b = s.next();
            String c = s.next();
            String d = s.next();
            //System.out.println(a +" " + b + " " + c + " " + d  + " ");
            
        }
       
    }

}
