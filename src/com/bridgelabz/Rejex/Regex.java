package com.bridgelabz.Rejex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
        public static boolean validate(String LName) {
            String firstName= "^[A-Z]{1}[A-Za-z]{2,}$";
            Pattern obj1= Pattern.compile(firstName);
            if(LName==null) {
                return false;
            }
            Matcher obj2 = obj1.matcher(LName);
            return obj2.matches();
        }

    public static boolean validatemail(String email) {
       String Email= "^[A-Za-z0-9]+[@][a-zA-Z]+[.][a-zA-Z]+[.]?[a-zA-Z]{2}$";
        Pattern obj= Pattern.compile(Email);

        if(email==null) {
            return false;

        }
        Matcher obj3 = obj.matcher(email);
        return obj3.matches();
    }
    public static boolean validatemobile(String num) {
        String number = "^(91)[ ]{1}[1-9]{1}[0-9]{9}$";
        Pattern obj= Pattern.compile(number);

        if(num==null) {
            return false;
        }
        Matcher obj4 = obj.matcher(num);
        return obj4.matches();
    }
        public static void main(String[] args) {

            System.out.println("Check Validation");
            boolean fN = validate("Surabhi");
            boolean lN= validate("Sanjan");
            boolean email= validatemail("surabhisanjan@gmail.com");
            boolean number = validatemobile("91 8544370256");
            if(fN)
                System.out.println("Surabhi is a Valid LastName");
            else
                System.out.println("Surabhi is an Invalid LastName");

            if(lN)
              System.out.println("Sanjan is a Valid LastName");
            else
                System.out.println("Sanjan is an Invalid LastName");

            if(email)
                System.out.println("surabhisanjan@gmail.com is a Valid email");
            else
                System.out.println("surabhisanjan@gmail.com is an Invalid email");

            if(number)
                System.out.println(" number is Valid");
            else
                System.out.println("number is Invalid");
        }



}

