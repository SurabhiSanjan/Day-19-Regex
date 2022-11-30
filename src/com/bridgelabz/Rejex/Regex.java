package com.bridgelabz.Rejex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
        public static boolean validate(String fName) {
            String firstName= "^[A-Z]{1}[A-Za-z]{2,}$";
            Pattern obj1= Pattern.compile(firstName);
            if(fName==null) {
                return false;
            }
            Matcher obj2 = obj1.matcher(fName);
            return obj2.matches();
        }
        public static void main(String[] args) {

            System.out.println("Check Name Validation");
            //boolean fN = validate("Surabhi");

           // if(fN)
             //   System.out.println("Surabhi is a Valid firstName");
            //else
                //System.out.println("Surabhi is an Invalid firstName");
        }



}

