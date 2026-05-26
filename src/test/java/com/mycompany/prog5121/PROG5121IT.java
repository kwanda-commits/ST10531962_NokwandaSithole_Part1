/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog5121;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
/**
 *
 * @author Student
 */

public class PROG5121IT {

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void testCheckUserName() {
        assertTrue(PROG5121.checkUserName("user_"));  // valid
        assertFalse(PROG5121.checkUserName("user"));  // missing _
        assertFalse(PROG5121.checkUserName("long_username"));  // too long
    }

    @Test
    public void testCheckPasswordComplexity() {
        assertTrue(PROG5121.checkPasswordComplexity("Passw0rd!"));  // valid
        assertFalse(PROG5121.checkPasswordComplexity("password"));  // no capital, number, special
        assertFalse(PROG5121.checkPasswordComplexity("Password"));  // no number, special
        assertFalse(PROG5121.checkPasswordComplexity("Pass1234"));  // no special char
    }

    @Test
    public void testCheckCellPhoneNumber() {
        assertTrue(PROG5121.checkCellPhoneNumber("+27123456789"));  // valid
        assertFalse(PROG5121.checkCellPhoneNumber("0123456789"));  // missing +27
        assertFalse(PROG5121.checkCellPhoneNumber("+2712345678"));  // too short
    }

    @Test
    public void testRegisterUser() {
        assertEquals("Username and password successfully captured. User registered!",
                PROG5121.registerUser("user_", "Passw0rd!"));

        assertEquals("Username is not correct. Must have _ and max 5 chars.",
                PROG5121.registerUser("user", "Passw0rd!"));

        assertEquals("Password is not correct. Must have 8+ chars, capital letter, number, and special char.",
                PROG5121.registerUser("user_", "password"));
    }

    @Test
    public void testLoginUser() {
        String storedUsername = "user_";
        String storedPassword = "Passw0rd!";

        assertTrue(PROG5121.loginUser("user_", "Passw0rd!", storedUsername, storedPassword));
        assertFalse(PROG5121.loginUser("wrong", "Passw0rd!", storedUsername, storedPassword));
        assertFalse(PROG5121.loginUser("user_", "wrong", storedUsername, storedPassword));
    }

    @Test
    public void testReturnLoginStatus() {
        assertEquals("Login successful! Welcome back!", PROG5121.returnLoginStatus(true));
        assertEquals("Username or password incorrect, please try again.", PROG5121.returnLoginStatus(false));
    }

    /**
     * Test of registerUser method, of class PROG5121.
     */
    @Test
    public void testRegisterUser_String_String() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String expResult = "";
        String result = PROG5121.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateNumber method, of class PROG5121.
     */
    @Test
    public void testValidateNumber() {
        System.out.println("validateNumber");
        String num = "";
        String expResult = "";
        String result = PROG5121.validateNumber(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class PROG5121.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        String id = "";
        int num = 0;
        String msg = "";
        String expResult = "";
        String result = PROG5121.createMessageHash(id, num, msg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PROG5121.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PROG5121.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class PROG5121.
     */
    @Test
    public void testRegisterUser_0args() {
        System.out.println("registerUser");
        String[] expResult = null;
        String[] result = PROG5121.registerUser();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class PROG5121.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String[] credentials = null;
        PROG5121.login(credentials);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageLimit method, of class PROG5121.
     */
    @Test
    public void testGetMessageLimit() {
        System.out.println("getMessageLimit");
        int expResult = 0;
        int result = PROG5121.getMessageLimit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayMenu method, of class PROG5121.
     */
    @Test
    public void testDisplayMenu() {
        System.out.println("displayMenu");
        PROG5121.displayMenu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class PROG5121.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        PROG5121.sendMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMessages method, of class PROG5121.
     */
    @Test
    public void testShowMessages() {
        System.out.println("showMessages");
        PROG5121.showMessages();
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of discardLastMessage method, of class PROG5121.
     */
    @Test
    public void testDiscardLastMessage() {
        System.out.println("discardLastMessage");
        PROG5121.discardLastMessage();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of storeMessage method, of class PROG5121.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        PROG5121.storeMessage();
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of saveAndExit method, of class PROG5121.
     */
    @Test
    public void testSaveAndExit() {
        System.out.println("saveAndExit");
        PROG5121.saveAndExit();
        // TODO review the generated test code and remove the default call to fail.
       
    }
}
