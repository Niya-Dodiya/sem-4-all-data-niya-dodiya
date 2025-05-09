// import java.awt.*;
// import java.awt.event.*;
// import java.util.*;
// import Mathutils.Calculator;
// import Mathutils.advanced.Power;

// // import Mathutils.MathUtils;


// // Main Class
// public class AllInOneAWTMenu extends Frame implements ActionListener {
    
//     Choice menu;
//     Button select;

//     AllInOneAWTMenu() {
//         setLayout(null);

//         Label heading = new Label("Select Program :");
//         heading.setBounds(50, 100, 150, 30);
//         add(heading);

//         menu = new Choice();
//         menu.setBounds(200, 100, 250, 30);

//         menu.add("Select");
//         menu.add("1. Login Form");
//         menu.add("2. Calculator");
//         menu.add("3. Package Operations");
//         menu.add("4. ATM Program");
//         menu.add("5. Voting Eligibility");
//         menu.add("6. BMI Calculator");
//         menu.add("7. Loan Eligibility");
//         menu.add("8. Library Membership");
//         menu.add("9. Reverse Student Names");
//         menu.add("10. Paragraph Operations");
//         menu.add("11. Electricity Bill");
//         menu.add("12. Exit");

//         add(menu);

//         select = new Button("Select");
//         select.setBounds(150, 160, 80, 30);
//         add(select);

//         select.addActionListener(this);

//         setSize(550, 350);
//         setTitle("All In One Java AWT Menu");
//         setVisible(true);
//     }

//     // Event Handling
//     public void actionPerformed(ActionEvent e) {
//         int choice = menu.getSelectedIndex();
//         switch (choice) {
//             case 1: loginForm(); break;
//             case 2: calculator(); break;
//             case 3: packageOperation(); break;
//             case 4: atmProgram(); break;
//             case 5: votingEligibility(); break;
//             case 6: bmiCalculator(); break;
//             case 7: loanEligibility(); break;
//             case 8: libraryMembership(); break;
//             case 9: reverseNames(); break;
//             case 10: paragraphOperation(); break;
//             case 11: electricityBill(); break;
//             case 12: System.exit(0); break;
//             default: System.out.println("Please Select a Valid Option"); break;
//         }
//     }

//     // 1. Login Form
//     void loginForm() {
//         Frame f = new Frame("Login Form");
//         f.setLayout(null);

//         Label user = new Label("Username:");
//         user.setBounds(50, 50, 100, 30);
//         TextField t1 = new TextField();
//         t1.setBounds(150, 50, 150, 30);

//         Label pass = new Label("Password:");
//         pass.setBounds(50, 100, 100, 30);
//         TextField t2 = new TextField();
//         t2.setBounds(150, 100, 150, 30);
//         t2.setEchoChar('*');

//         Checkbox showPass = new Checkbox("Show Password");
//         showPass.setBounds(150, 140, 150, 30);

//         Button login = new Button("Login");
//         login.setBounds(100, 200, 70, 30);

//         Button clear = new Button("Clear");
//         clear.setBounds(200, 200, 70, 30);

//         showPass.addItemListener(e -> t2.setEchoChar(showPass.getState() ? (char) 0 : '*'));

//         login.addActionListener(e -> {
//             String u = t1.getText();
//             String p = t2.getText();
//             if (u.equals("admin") && p.equals("1234")) {
//                 showMessage("Login Successful");
//             } else {
//                 showMessage("Invalid Credentials");
//             }
//         });

//         clear.addActionListener(e -> {
//             t1.setText("");
//             t2.setText("");
//         });

//         f.add(user); f.add(t1);
//         f.add(pass); f.add(t2);
//         f.add(showPass);
//         f.add(login); f.add(clear);

//         f.setSize(400, 300);
//         f.setVisible(true);
//     }

//     // 2. Calculator
//     void calculator() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first number:");
//         int a = sc.nextInt();
//         System.out.println("Enter second number:");
//         int b = sc.nextInt();

//         System.out.println("Choose operation (+ - * /):");
//         char op = sc.next().charAt(0);

//         switch (op) {
//             case '+': System.out.println("Result: " + (a + b)); break;
//             case '-': System.out.println("Result: " + (a - b)); break;
//             case '*': System.out.println("Result: " + (a * b)); break;
//             case '/': System.out.println("Result: " + ((b != 0) ? (a / b) : "Division by Zero")); break;
//             default: System.out.println("Invalid Operation");
//         }
//     }

//     // 3. Package Operation Simulation
//     void packageOperation() {
//         Calculator calc = new Calculator();
//         Power pwr = new Power();

//         System.out.println("Add: " + calc.add(5, 10));
//         System.out.println("Multiply: " + calc.multiply(3, 4));
//         System.out.println("Power: " + pwr.power(2, 5));
//         System.out.println("Factorial: " + pwr.factorial(5));
//     }

//     // 4. ATM Program
//     void atmProgram() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Balance: ");
//         double balance = sc.nextDouble();
//         System.out.print("Enter Withdraw Amount: ");
//         double withdraw = sc.nextDouble();

//         try {
//             if (withdraw > balance)
//                 throw new Exception("Insufficient Balance");
//             else
//                 System.out.println("Transaction Successful. Remaining Balance: " + (balance - withdraw));
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     // 5. Voting Eligibility
//     void votingEligibility() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Age: ");
//         String input = sc.next();

//         try {
//             int age = Integer.parseInt(input);
//             if (age < 18)
//                 throw new Exception("You must be 18+ to vote.");
//             else
//                 System.out.println("Eligible to Vote");
//         } catch (NumberFormatException e) {
//             System.out.println("Invalid Input");
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
//     }

//     // 6. BMI Calculator
//     void bmiCalculator() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Height in meters: ");
//         double height = sc.nextDouble();
//         System.out.print("Enter Weight in kg: ");
//         double weight = sc.nextDouble();

//         if (height == 0) {
//             System.out.println("Height can't be Zero");
//             return;
//         }

//         double bmi = weight / (height * height);
//         System.out.println("BMI is: " + bmi);
//     }

//     // 7. Loan Eligibility
//     void loanEligibility() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Income: ");
//         int income = sc.nextInt();
//         System.out.print("Enter Credit Score: ");
//         int credit = sc.nextInt();

//         if (income < 10000 || credit < 600) {
//             System.out.println("Not Eligible for Loan");
//         } else {
//             System.out.println("Eligible for Loan");
//         }
//     }

//     // 8. Library Membership
//     void libraryMembership() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Name: ");
//         String name = sc.next();
//         System.out.print("Enter Email: ");
//         String email = sc.next();
//         System.out.print("Select Membership (Gold/Silver/Platinum): ");
//         String plan = sc.next();

//         if (name.isEmpty() || email.isEmpty() || plan.isEmpty())
//             System.out.println("All fields are required.");
//         else
//             System.out.println("Membership Registered Successfully.");
//     }

//     // 9. Reverse Student Names
//     void reverseNames() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of Students: ");
//         int n = sc.nextInt();
//         String[] names = new String[n];

//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter name: ");
//             names[i] = sc.next();
//         }

//         System.out.println("Reversed Names:");
//         for (String name : names) {
//             StringBuffer sb = new StringBuffer(name);
//             System.out.println(sb.reverse());
//         }
//     }

//     // 10. Paragraph Operation
//     void paragraphOperation() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a paragraph:");
//         sc.nextLine(); 
//         String para = sc.nextLine();

//         String[] words = para.split(" ");
//         System.out.println("Total Words: " + words.length);
//         System.out.println("Total Characters: " + para.length());

//         StringBuffer sb = new StringBuffer(para);
//         System.out.println("Reversed Paragraph: " + sb.reverse());
//     }

//     // 11. Electricity Bill
//     void electricityBill() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Units Consumed: ");
//         int units = sc.nextInt();

//         double bill = 0;
//         if (units <= 100)
//             bill = units * 5;
//         else if (units <= 200)
//             bill = 100 * 5 + (units - 100) * 7;
//         else
//             bill = 100 * 5 + 100 * 7 + (units - 200) * 10;

//         System.out.println("Total Bill is: Rs. " + bill);
//     }

//     void showMessage(String msg) {
//         Dialog d = new Dialog(this, "Message", true);
//         d.setLayout(new FlowLayout());
//         Label l = new Label(msg);
//         Button b = new Button("OK");
//         b.addActionListener(e -> d.setVisible(false));
//         d.add(l); d.add(b);
//         d.setSize(200, 100);
//         d.setVisible(true);
//     }

//     public static void main(String[] args) {
//         new AllInOneAWTMenu();
//     }
// }






