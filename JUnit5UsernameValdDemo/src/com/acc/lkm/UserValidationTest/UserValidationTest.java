package com.acc.lkm.UserValidationTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.expectThrows;
import com.acc.lkm.uservalidlogic.UserValidation;

class UserValidationTest {
	
	UserValidation userValidation;
	String username;

	 @BeforeAll
	    static void setupAll() {
	        System.out.println("Before all tests");
	    }
	 
	 @BeforeEach
	    void setup() {
		 userValidation=new UserValidation();
	      //  System.out.println("Before each test");
	        
	    }
	 
	 @Test
	    void loginUsernamePasswordAreCorrect() {
	      boolean actual = userValidation.login("admin", "password123");
	      assertTrue(actual);
	      //Fails when expected does not equal actual
	    }
	 
	    @Test
	    void loginUsernamePasswordAreInCorrect() {
	      boolean actual = userValidation.login("admin", "password1233245");
	      assertFalse(actual);
	      //Fails when expression is not false
	    }
	    
	    @Test
	    void loginUsernamePasswordNull() {
	    	 Throwable exception = assertThrows(IllegalArgumentException.class, () -> { //Class to be tested is expected to throw an exception
	    		 userValidation.login(null, null);
	          });
	      assertEquals("Username and password must not be null or empty", exception.getMessage());
	      
	    }
	    
	    @Test
	    void loginUsernamePasswordAreEmpty() {
	 
	      assertThrows(IllegalArgumentException.class, () -> {
	        userValidation.login("", "");
	      });
	 
	    }
	 
	    

	    @AfterEach
	    void tearDown() {
	        System.out.println("After each test");
	    }

	    @AfterAll
	    static void tearDownAll() {
	        System.out.println("After all tests");
	    }
	    
	 
}
