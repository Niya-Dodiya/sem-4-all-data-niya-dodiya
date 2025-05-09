// // import java.awt.*;
// // import java.awt.event.WindowAdapter;
// // import java.awt.event.WindowEvent;
// // import java.awt.event.ActionListener;
// // import java.awt.event.ActionEvent;

// // public class Loginform extends Frame implements ActionListener{

// //     TextField usernametext,passwordtext,result;
// //     Label l1,l2;
// //     Button btn;
// //     Frame f1;
// //     Loginform(){
    
// //     f1 = new Frame("Login form");
// //     setSize(1300,600);
   

// //     setLayout(null);
// //     l1 = new Label("enter the username");
// //     l1.setBounds(50, 60, 180, 60);
// //     add(l1);
// //     usernametext = new TextField(8);
// //     usernametext.setBounds(240,60,180,60);
// //     add(usernametext);

// //     l2 = new Label("enter the password");
// //     l2.setBounds(50, 160, 180, 60);
// //     add(l2);
// //     passwordtext = new TextField(8);
// //     passwordtext.setBounds(240,160,180,60);
// //     add(passwordtext);

// //     btn = new Button("Login");
// //     btn.setBounds(200, 300, 80, 60);
// //     add(btn);
// //     btn.addActionListener(this);

    
// //     result=new TextField();
// //     result.setBounds(80, 400, 280, 60);
// //     add(result);
    
// //     addWindowListener(new WindowAdapter() {
// //         public void windowClosing(WindowEvent e) {
// //             dispose();
// //         }
// //     });
// //     setVisible(true);

    

// // }   

// // public void actionPerformed(ActionEvent e){
// //     String username=(usernametext.getText());
// //     int passwordset = Integer.parseInt(passwordtext.getText());
// //     result.setText("username is: "+username+ "\npassword is"+passwordset);
// // }



    

// //     public static void main(String[] args) {
    
    
// //         new Loginform();

// //     }
// // }

// import java.awt.*;
// import java.awt.event.*;

// public class Evendemo extends Frame implements ActionListener{
//     TextField t1,t2,addi,sub,mul,div;
//     Label l1,l2,l3,l4,l5,l6;
//     Button b;

//     Evendemo(){

//         setLayout(null);
//         l1=new Label("value of no1");
//         l1.setBounds(50,50,80,60);
//         add(l1);
//         t1=new TextField("0",5);
//         t1.setBounds(180, 50, 80, 60);
//         add(t1);

//         l2=new Label("value of no2");
//         l2.setBounds(50, 120, 80, 60);
//         add(l2);
//         t2=new TextField("0",5);
//         t2.setBounds(180, 120, 80, 60);
//         add(t2);

//         l3=new Label("ADDITION IS");
//         l3.setBounds(50, 200, 80, 60);
//         add(l3);
//         addi=new TextField();
//         addi.setBounds(180, 200, 80, 60);
//         add(addi);

        
//         l4=new Label("SUBTRACTION  IS");
//         l4.setBounds(50, 280, 80, 60);
//         add(l4);
//         sub=new TextField();
//         sub.setBounds(180, 280, 80, 60);
//         add(sub);

        
//         l5=new Label("Multiplication  IS");
//         l5.setBounds(50, 380, 80, 60);
//         add(l5);
//         mul=new TextField();
//         mul.setBounds(180, 380, 80, 60);
//         add(mul);

        
//         l6=new Label("division IS");
//         l6.setBounds(50, 450, 80, 60);
//         add(l6);
//         div=new TextField();
//         div.setBounds(180, 450, 80, 60);
//         add(div);


//         b=new Button("Calculate");
//         b.setBounds(130,550,80,60);
//         b.addActionListener(this);
        
//         setVisible(true);
//         add(b);

//     }
//     public void actionPerformed(ActionEvent e){
//         int n1=Integer.parseInt(t1.getText());
//         int n2=Integer.parseInt(t2.getText());
//         int addition = n1+n2;
//         int subtraction = n1-n2;
//         int multiplication = n1*n2;
//         int devision;
//         if(n2==0){
//             devision=0;
//         }
//         else{
//             devision = n1/n2;
//         }

//         addi.setText(Integer.toString(addition));
//         sub.setText(Integer.toString(subtraction));
//         mul.setText(Integer.toString(multiplication));
//         div.setText(Integer.toString(devision));

//     }
//     public static void main(String[] args){
//         new  Evendemo();
//     }
// }

import java.awt.*;
import java.awt.event.*;
// import Mathutils.*;
import Mathutils.Calculator;
import Mathutils.advanced.Power;

public class MainAWTProgram extends Frame implements ActionListener {
    TextField t1, t2;
    Label result;
    Button add, subtract, multiply, divide, power, factorial, bmi;
    Calculator calc = new Calculator();
    Power pow = new Power();

    MainAWTProgram() {
        Font font = new Font("Arial",Font.PLAIN,20);
        setLayout(new GridLayout(9, 2, 10, 10));

        t1 = new TextField();
        t1.setFont(font);
        t2 = new TextField();
        t2.setFont(font);

        result = new Label("Result will be shown here");
        result.setFont(font);

        add = new Button("Add");
        subtract = new Button("Subtract");
        multiply = new Button("Multiply");
        divide = new Button("Divide");
        power = new Button("Power");
        factorial = new Button("Factorial (1st)");
        bmi = new Button("BMI (Weight in 1st, Height in 2nd)");

        add.setFont(font);
        subtract.setFont(font);
        multiply.setFont(font);
        divide.setFont(font);
        power.setFont(font);
        factorial.setFont(font);
        bmi.setFont(font);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        power.addActionListener(this);
        factorial.addActionListener(this);
        bmi.addActionListener(this);

        add(new Label("Input 1:"));
        add(t1);
        add(new Label("Input 2:"));
        add(t2);
        

        add(add); add(subtract);
        add(multiply); add(divide);
        add(power); add(factorial);
        add(bmi); add(result);

        setTitle("AWT Multi-Function Program");
        setSize(400, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String input1 = t1.getText();
            String input2 = t2.getText();

            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);

            if (e.getSource() == add) {
                result.setText("Add: " + calc.add((int) num1, (int) num2));
            } else if (e.getSource() == subtract) {
                result.setText("Subtract: " + calc.subtract((int) num1, (int) num2));
            } else if (e.getSource() == multiply) {
                result.setText("Multiply: " + calc.multiply((int) num1, (int) num2));
            } else if (e.getSource() == divide) {
                result.setText("Divide: " + calc.divide((int) num1, (int) num2));
            } else if (e.getSource() == power) {
                result.setText("Power: " + pow.power((int)num1, (int)num2));
            } else if (e.getSource() == factorial) {
                result.setText("Factorial: " + pow.factorial((int) num1));
            } else if (e.getSource() == bmi) {
                if (num1 <= 0 || num2 <= 0)
                    throw new ArithmeticException("Height and weight must be > 0");
                double bmiVal = num1 / (num2 * num2);
                result.setText(String.format("BMI: %.2f", bmiVal));
            }

        } catch (NumberFormatException ex) {
            result.setText("Please enter valid numbers!");
        } catch (ArithmeticException ex) {
            result.setText("Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new MainAWTProgram();
    }
}
