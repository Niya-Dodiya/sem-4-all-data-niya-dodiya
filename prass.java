// package Mypackge.registrationform;

import java.awt.*;
import java.awt.event.*;

public class prass extends Frame implements ActionListener {
    Label lblName, lblEmail, lblPassword, lblAddress, lblGender, lblSubjects, lblCity;
    TextField txtName, txtEmail, txtPassword;
    TextArea txtAddress, txtDisplay;
    Checkbox chkJava, chkPython, chkC;
    CheckboxGroup genderGroup;
    Checkbox rbMale, rbFemale;
    Choice choiceCity;
    Button btnSubmit;

    public prass() {
        setTitle("AWT Registration Form");
        setLayout(null);
        setSize(500, 600);
        setBackground(Color.PINK);
        Font font = new Font("Arial",Font.PLAIN,26);
        

        lblName = new Label("Name:");
        // lblName.setForeground(Color.RED);
        lblName.setBounds(50, 50, 80, 20);
        lblName.setFont(font);
        add(lblName);

        txtName = new TextField();
        txtName.setBounds(150, 50, 200, 20);
        txtName.setFont(font);
        add(txtName);

        lblEmail = new Label("Email:");
        lblEmail.setBounds(50, 80, 80, 20);
        lblEmail.setFont(font);
        add(lblEmail);

        txtEmail = new TextField();
        txtEmail.setBounds(150, 80, 200, 20);
        txtEmail.setFont(font);
        add(txtEmail);

        lblPassword = new Label("Password:");
        lblPassword.setBounds(50, 110, 80, 20);
        lblPassword.setFont(font);
        add(lblPassword);

        txtPassword = new TextField();
        txtPassword.setEchoChar('*');
        txtPassword.setBounds(150, 110, 200, 20);
        txtPassword.setFont(font);
        add(txtPassword);

        lblAddress = new Label("Address:");
        lblAddress.setBounds(50, 140, 80, 20);
        lblAddress.setFont(font);
        add(lblAddress);

        txtAddress = new TextArea();
        txtAddress.setBounds(150, 140, 200, 60);
        txtAddress.setFont(font);
        add(txtAddress);

        lblGender = new Label("Gender:");
        lblGender.setBounds(50, 210, 80, 20);
        lblGender.setFont(font);
        add(lblGender);

        genderGroup = new CheckboxGroup();
        rbMale = new Checkbox("Male", genderGroup, false);
        rbFemale = new Checkbox("Female", genderGroup, false);
        rbMale.setBounds(150, 210, 60, 20);
        rbFemale.setBounds(220, 210, 70, 20);
        rbFemale.setFont(font);
        rbMale.setFont(font);
        add(rbMale);
        add(rbFemale);

        lblSubjects = new Label("Subjects:");
        lblSubjects.setBounds(50, 240, 80, 20);
        lblSubjects.setFont(font);
        add(lblSubjects);

        chkJava = new Checkbox("Java");
        chkPython = new Checkbox("Python");
        chkC = new Checkbox("C++");
        chkJava.setBounds(150, 240, 60, 20);
        chkPython.setBounds(220, 240, 70, 20);
        chkC.setBounds(300, 240, 60, 20);
        chkC.setFont(font);
        chkJava.setFont(font);
        chkPython.setFont(font);
        add(chkJava);
        add(chkPython);
        add(chkC);

        lblCity = new Label("City:");
        lblCity.setBounds(50, 270, 80, 20);
        lblCity.setFont(font);
        add(lblCity);

        choiceCity = new Choice();
        choiceCity.setBounds(150, 270, 150, 20);
        choiceCity.add("Select City");
        choiceCity.add("New York");
        choiceCity.add("Delhi");
        choiceCity.add("London");
        choiceCity.add("Tokyo");
        choiceCity.setFont(font);
        add(choiceCity);

        btnSubmit = new Button("Submit");
        btnSubmit.setBounds(150, 310, 100, 30);
        btnSubmit.addActionListener(this);
        btnSubmit.setFont(font);
        add(btnSubmit);

        txtDisplay = new TextArea();
        txtDisplay.setBounds(50, 360, 400, 180);
        txtDisplay.setEditable(false);
        txtDisplay.setFont(font);
        add(txtDisplay);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = txtName.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();
        String gender = genderGroup.getSelectedCheckbox() != null ?
                        genderGroup.getSelectedCheckbox().getLabel() : "Not selected";

        String subjects = "";
        if (chkJava.getState()) subjects += "Java ";
        if (chkPython.getState()) subjects += "Python ";
        if (chkC.getState()) subjects += "C++ ";
        if (subjects.equals("")) subjects = "None";

        String city = choiceCity.getSelectedItem();

        txtDisplay.setText(
            "----- Registration Details -----\n" +
            "Name: " + name + "\n" +
            "Email: " + email + "\n" +
            "Password: " + password + "\n" +
            "Address: " + address + "\n" +
            "Gender: " + gender + "\n" +
            "Subjects: " + subjects + "\n" +
            "City: " + city
        );
    }

    public static void main(String[] args) {
        new prass();
    }
} 
