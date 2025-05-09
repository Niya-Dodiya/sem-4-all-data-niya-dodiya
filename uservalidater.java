package Mypackge.userAuthentication;

public class uservalidater {

    public static boolean verifyPassword(String s){
        if(s.length()>=7){
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean verifyEmail(String s){
        if(s.contains("@") && s.contains(".")){
            return true;
        }
        else{
            return false;
        }
    }
}
