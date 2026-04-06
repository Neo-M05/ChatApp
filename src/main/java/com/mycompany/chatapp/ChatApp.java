/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class ChatApp {

    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
        
        String userName;
        String passWord;
        String phoneNumber;
        String LoginUser;
        String LoginPass;
        
        System.out.println("--Registration---");
        //this is what the user is going to promt/ enter
        System.out.println("enter your username: ");
        userName = input.nextLine();
          
        System.out.println("enter the password: ");
        passWord = input.nextLine();
        
        System.out.println("enter your number ");
        phoneNumber = input.nextLine();
        
        //this is the object for login class the auth is to authiticate the user 
       Login auth = new Login(userName, passWord);
       
         System.out.println(auth.registerUser());
       
        // Regex reference: https://www.w3schools.com/java/java_regex.asp
        // Additional reference: https://www.geeksforgeeks.org/dsa/write-regular-expressions/
        if(phoneNumber.matches("\\+27[0-9]{9}")){
            System.out.println("cell phone successfuly added");
        }
        else{
            System.out.println("cell phone number incorrectly formatted or does not contain international code");
        }
        //this is the login part
        System.out.println("--Login---");
        
        System.out.println("enter username");
        LoginUser = input.nextLine();
        
        System.out.println("enter password: ");
        LoginPass = input.nextLine();
        //here the boolean checks that if it is a sucess it must pass it through
        boolean success = auth.loginUser(LoginUser, LoginPass);
        System.out.println(auth.returnLoginStatus(success));
    }
}
