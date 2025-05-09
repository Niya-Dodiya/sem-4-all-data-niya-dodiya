package Mypackge.userAuthentication;

public class userAuthSystem {
    private static final int maxUsers = 5;
    private static String[] registeredUsers = new String[maxUsers];
    private static int userCount = 0;

    public static boolean userExists(String email) {
        for (String userEmail : registeredUsers) {
            if (userEmail != null && userEmail.equals(email)) {
                return true; 
            }
        }
        return false;
    }

    public static boolean registerUser(String email, String password) {
        if (!uservalidater.verifyEmail(email)) {
            System.out.println("Email format is not valid!");
            return false;
        }

        if (!uservalidater.verifyPassword(password)) {
            System.out.println("Weak password!");
            System.out.println("Password must hold at least 8 characters");
            return false;
        }

        if (userExists(email)) {
            System.out.println("User with email " + email + " already exists!");
            return false;
        }

        if (userCount < maxUsers) {
            registeredUsers[userCount++] = email; 
            System.out.println("User registered successfully: " + email);
            return true;
        } else {
            System.out.println("Registration limit reached!");
            return false;
        }
    }
} 