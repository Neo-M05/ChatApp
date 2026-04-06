/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.chatapp.Login;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class LoginTest {
    
    @Test
    public void TestUserNameCorrect(){
        //this is the objective and  Test case for valid username format (underscore and length <= 5)
        Login auth = new Login("kyl_1","P@ssword1");
        
        boolean actual = auth.checkUserName();
        
        assertTrue(actual, "The username kyl_1 should be valid (contain underscore and < 5 chars)");
    }
       
    
      @Test
    public void TestpasswordSuccess (){
     // object of the password and  Test case for a password that meets all complexity requirements
     Login auth = new Login("user_", "Ch&&sec@ke99!");
     
     boolean actual = auth.checkPasswordComplexity();
     
     assertTrue(actual,"The password should meet all complexity requirements");
    }
    
   @Test
    public void testRegistrationMessage() {
        
        Login auth = new Login("kyl_1", "Ch&&sec@ke99!");
        
        //  Get the message from your registerUser method
        String actual = auth.registerUser();
        String expected = "Username and Password successfully captured.";
        
        // Assert: Check if the text matches exactly
        assertEquals(expected, actual);
    }
    
    @Test
    public void TestPhoneNumbersucess(){
        Login auth = new Login("user_", "P@ssword1");
        //using the data from the poe table that was provides
        assertTrue(auth.checkPhoneNumber("+27838968976"), "Valid SA international format should pass");
        
    }
    @Test
    public void TestPhoneNumberFailure(){
        Login auth = new Login("user_","P@ssword1");
        
        assertFalse(auth.checkPhoneNumber("08966553"), "Invalid format should fail");
        
    
    }
}

