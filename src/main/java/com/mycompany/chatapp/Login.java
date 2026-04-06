package com.mycompany.chatapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Login {
    
       private String userName;
   private String passWord;
  
   
   
   public Login(String userName, String passWord){
    
       this.userName = userName;
       this.passWord = passWord;
      
   }

    public boolean checkUserName() {
        return userName.contains("_") && userName.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        boolean hasCapital = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < passWord.length(); i++) {
            char ch = passWord.charAt(i);
            if (Character.isUpperCase(ch)) hasCapital = true;
            if (Character.isDigit(ch)) hasNumber = true;
            if (!Character.isLetterOrDigit(ch)) hasSpecial = true;
        }
        return passWord.length() >= 8 && hasCapital && hasNumber && hasSpecial;
    }
    
       public boolean checkPhoneNumber(String phoneNumber) {
       return phoneNumber.matches("\\+27[0-9]{9}");
  }

    public String registerUser() {
        
        if (!checkUserName()) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        } 
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        return "Username and Password successfully captured.";
    }
    

    public boolean loginUser(String enterUser, String enterPass) {
        return enterUser.equals(this.userName) && enterPass.equals(this.passWord);
    }

    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Welcome" +" " + userName  + " " + "it is great to see you again ";
        } else {
            return "Username or password incorrect, please try again.";
        }
        
        
    }
}
    

