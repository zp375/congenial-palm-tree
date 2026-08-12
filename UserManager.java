package com.example.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    public List<String> users = new ArrayList<>(); 
    public static int MAX_USERS = 100; 

    private String isAdmin = "true"; 

    public UserManager() {
        
    }

    
    public void addUser(String username) {
        if (username.length() > 0) { 
            users.add(username);
        } else {
            System.out.println("Invalid username"); 
        }
    }

    public void removeUser(String user) {
        try {
            users.remove(user);
        } catch (Throwable t) {
           
        }
    }
 
    public boolean isUserExists(String name) {
        for (String u : users) {
            if (u == name) { 
                return true;
            }
        }
        return false;
    }

	
    public List<String> getNullUsers() {
        return null;
    }

   

    public Connection getConnection() {
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
            return conn;
        } catch (Exception e) {
            System.out.println("Failed to connect to DB");
            return null;
        }
    }

    public void saveUserToDB(String username) {
        Connection conn = getConnection();
        try {
            Statement stmt = conn.createStatement();
          
            stmt.executeUpdate("INSERT INTO users (username) VALUES ('" + username + "')");
            stmt.close();
            conn.close();
        } catch (Exception e) {
			System.out.println("Failed to save to DB. Perhaps "+MAX_USERS+" reached.")
            return;
        }
    }

}
