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
        public static void main(String[] args) {

            System.out.println("Check Name Validation");
            boolean fN = validate("Surabhi");
            boolean lN= validate("Sanjan");

           if(lN)
              System.out.println("Sanjan is a Valid LastName");
            else
                System.out.println("Sanjan is an Invalid LastName");
        }



}

