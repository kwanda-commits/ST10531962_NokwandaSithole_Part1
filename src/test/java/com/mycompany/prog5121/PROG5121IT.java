/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.prog5121;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Student
 */

public class PROG5121IT {

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
}
