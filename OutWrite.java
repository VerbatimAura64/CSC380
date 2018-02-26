package outwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import outwrite.InRead;

/**
 *
 * @author Bantalek
 */
public class OutWrite {

    public Scanner sc;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String name, email, password, password1;
        System.out.println("Please Write Your Name\n-->");
        name = kb.nextLine();
        System.out.println("Please Write Your Email address\n-->");
        email = kb.nextLine();
        password = verifyPassword();
        name = properCase(name);
        // email = verifySyntaxEmail();
//        System.out.println("Please Enter Your Password\n-->");
//        password = kb.nextLine();
//        System.out.println("Please Verify Your Password\n-->");
//        password1 = kb.nextLine();
//        if (password != password1) {
//            System.out.println("Passwords Do Not Match");
//            verifyPassword();
//        } else {
//            System.out.println("Passwords Match");
//        }
        try {
            //true = append , false = overwrite
            FileWriter fw = new FileWriter("customer1.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.print(getCustID() + "\t");
            pw.print(name + "\t");
            pw.print(email + "\t");
            pw.print(password + "\t\n");
            pw.println();
            pw.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
        System.out.println("File Updated");

    }

    public static String verifyPassword() {
        Scanner kb = new Scanner(System.in);
        String password, password1;
        System.out.println("Please Enter Your Password\n-->");
        password = kb.nextLine();
        System.out.println("Please Verify Your Password\n-->");
        password1 = kb.nextLine();
        if (password.equals(password1)) {
            System.out.println("Passwords Match");
        } else {
            System.out.println("Passwords Do Not Match. Please Try Again.");
            verifyPassword();
        }
        return password;
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
    public static int getCustID() {
        Random r = new Random();


        int CustID = r.nextInt(10) + 1;
//        int MAX = 20;
//        int numbersNeeded = 0;
//        if(MAX < numbersNeeded){
//            throw new IllegalArgumentException("No Number Available");
//             //Random r = new Random();
//             Set<Integer> generated = new LinkedHashSet<Integer>();
//             while (generated.size() < numbersNeeded){
//                 Integer next = r.nextInt(MAX)+1;
//                 generated.add(next);
//                 
//             }
//        }        
        return CustID;
    }

    public  void openFile() {
        try {
            sc = new Scanner(new File("customer1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }

    public void readFile() {
        while (sc.hasNext()) {
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            String d = sc.next();
            System.out.println(a + b + c + d);
            sc.close();
        }
    }

}
