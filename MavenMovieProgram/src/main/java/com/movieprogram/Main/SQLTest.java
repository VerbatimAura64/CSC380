/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movieprogram.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Main
 */
public class SQLTest {
    
    public static void main(String args[]){  
   String userName;
//    String email;
    Scanner f = new Scanner(System.in);
    System.out.println("Enter name: ");
    userName = f.nextLine();
//    System.out.println("Enter an email");
//    email = f.nextLine();
//    
//    

                            // Printing out from table
    try{
               //conn = DriverManager.getConnection("jdbc:derby://localhost:1527/csc380"); 
               String url = "jdbc:derby://localhost:1527/csc380";
               Connection conn = DriverManager.getConnection(url, "csc", "380");
               Statement st = conn.createStatement();
               String query = "SELECT * "
                       + "FROM picklerick.movie";
                       
                        // Currently, all values are grabbed.
                        // We then check to see if user input (login) matches what was grabbed
                        // In real project, make it so login works. If not, throw error.
               ResultSet rs = st.executeQuery(query);
               while(rs.next()){
                   boolean good = false;
                   String name = rs.getString(1);
                   String email = rs.getString(2);
                   System.out.println(name + "  " + email);
                   if (userName.equals(name)){
                       good = true;
                       System.out.println("we good");
                   } 
                   
               }
                       
               
               //PreparedStatement ps = conn.prepareStatement("INSERT into test1 VALUES (?,?)");
//               String sql = "INSERT INTO brandonx21.test1 VALUES (?,?)";
//               PreparedStatement ps = conn.prepareStatement(sql);
//               //ps.setInt(1, '1');
//               ps.setString(1, name);
//               ps.setString(2, email);
//               ps.executeUpdate();
//               ps.close();
                } catch(Exception e) {
                   System.err.println("Error");
                   System.err.println(e.getMessage());
                }               
    }
//    
//}
}

