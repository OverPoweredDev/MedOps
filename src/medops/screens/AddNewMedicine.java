package medops.screens;

import medops.Medicine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNewMedicine {
    private JButton addNewMedicineButton;
    private JTextField nameField;
    private JTextField priceField;
    public JPanel panel;


    public AddNewMedicine() {
        addNewMedicineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int price = Integer.parseInt(priceField.getText());
                Medicine newMedicine = new Medicine(++Medicine.lastID, name, 0, price);
                EmployeeScreen.storeRecord.medicineList.add(newMedicine);
            }
        });
    }
}
