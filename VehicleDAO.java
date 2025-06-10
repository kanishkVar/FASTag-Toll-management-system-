// Author: Kanishk Varshney
// Project: FASTag Toll System - GUVI Hackathon
// Year: 2025

package MyDAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class VehicleDAO {
    public Connection connect() {
        try {
            System.out.println("Trying to connect to database...");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/fastagdb", "root", "");
        } catch (Exception e) {
            System.out.println("Database connection failed");
            return null;
        }
    }

    public void recharge(String vehicleNumber, int amount) {
        try {
            Connection conn = connect();
            String query = "UPDATE vehicles SET balance = balance + ? WHERE vehicleNumber = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, amount);
            stmt.setString(2, vehicleNumber);
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Recharge successful!");
                System.out.println("Recharge successful for: " + vehicleNumber);
            } else {
                JOptionPane.showMessageDialog(null, "Vehicle not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deductToll(String vehicleNumber, int tollAmount) {
        try {
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT balance FROM vehicles WHERE vehicleNumber = '" + vehicleNumber + "'");
            if (rs.next()) {
                int balance = rs.getInt("balance");
                if (balance >= tollAmount) {
                    PreparedStatement ps = conn.prepareStatement("UPDATE vehicles SET balance = balance - ? WHERE vehicleNumber = ?");
                    ps.setInt(1, tollAmount);
                    ps.setString(2, vehicleNumber);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Toll Deducted Successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vehicle not found!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
