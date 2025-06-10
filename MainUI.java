// Author: Kanishk Varshney
// Project: FASTag Toll System - GUVI Hackathon
// Year: 2025

package MyUI;

import javax.swing.*;
import java.awt.event.*;
import MyDAO.VehicleDAO;

public class MainUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FASTag Toll System - Kanishk");
        JLabel label = new JLabel("Enter Vehicle Number:");
        JTextField vehicleInput = new JTextField();
        JButton rechargeBtn = new JButton("Recharge ₹100");
        JButton tollBtn = new JButton("Deduct Toll ₹50");

        label.setBounds(30, 30, 200, 30);
        vehicleInput.setBounds(30, 70, 200, 30);
        rechargeBtn.setBounds(30, 120, 150, 30);
        tollBtn.setBounds(30, 170, 150, 30);

        VehicleDAO dao = new VehicleDAO();

        rechargeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vNum = vehicleInput.getText();
                dao.recharge(vNum, 100);
            }
        });

        tollBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String vNum = vehicleInput.getText();
                dao.deductToll(vNum, 50);
            }
        });

        frame.add(label); frame.add(vehicleInput);
        frame.add(rechargeBtn); frame.add(tollBtn);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
