package Login_Authentication_System;

class LoginSystem {

    static String loginInfo(String userName){

        return userName;
    }

    //Overload
    static String loginInfo(String userName , String email){
        return  userName + " " + email;
    }

    //Overload
    static String loginInfo(String userName,   String email , String password){
        return email + " " + password;
    }

    //Overload
    static String loginInfo(String userName , String password , String email , String mobileNumber){
        return userName + " " +email + " " + password + " " + mobileNumber;

    }
    static String loginInfo(String userName , String password , String email , String mobileNumber ,  int otp){
        return userName + " " + email + " " + password + " " + mobileNumber + " " + otp;

    }

}


public class Authentication {
    public static void main(String[] args){


      String login =  LoginSystem.loginInfo("Akash" , "yoohoo1234@gmail.com" , "password1234@"  , "2547896214" , 214550);

        System.out.println(login);



    }
}
