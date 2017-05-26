package com.example.samsung.password_validator;

/**
 * Created by Samsung on 5/22/2017.
 *
 * Creates a password object which takes a string (user's password) as input,
 * determines the strength of the password based on specific rule, and outputs
 * a string that states the strength
 *
 * @author Sean Mahoney B00752957
 */

public class Password {
    /**
     * Tests a password against a set of rules and returns the number of rules it passes
     * @param userInputForPassword the user's password
     * @return number 1-5, depending on how many rules the password passed
     */
    public int validate(String userInputForPassword){
        int count=0;
        if(!userInputForPassword.toLowerCase().equals("password"))
            count++;
        if (userInputForPassword.length()>=8)
                count++;
        for(int i=0; i<userInputForPassword.length();i++){
            if(!Character.isLetterOrDigit(userInputForPassword.charAt(i))){
                count++;
                break;
        }
        }
        for(int i=0; i<userInputForPassword.length();i++){
            if(Character.isDigit(userInputForPassword.charAt(i))){
                count++;
                break;
            }
        }

        boolean upper=false;
        boolean lower=false;
        for(int i=0; i<userInputForPassword.length();i++){
            if(Character.isLowerCase(userInputForPassword.charAt(i)))
                lower=true;
            if(Character.isUpperCase(userInputForPassword.charAt(i)))
                upper=true;
            }
        if(upper && lower)
            count++;

        return count;

    }

    /**
     * An extension of the 'validate' method.  It outputs a string describing the password's
     * strength
     * dependency: Password.validate()
     * @param userInput the user's password
     * @return One of the following: "Very weak", "Weak", "Moderate", "Strong", "Very Strong"
     */
    public String strength_message(String userInput){
        int rules_passed = validate(userInput);
        String strengthMessage ="";

        switch(rules_passed){
            case 1 :
                strengthMessage = "Very weak";
                break;

            case 2 :
                strengthMessage = "Weak";
                break;

            case 3 :
                strengthMessage = "Moderate";
                break;

            case 4 :
                strengthMessage = "Strong";
                break;

            case 5 :
                strengthMessage = "Very strong";
                break;
        }
        return strengthMessage;

    }
}

