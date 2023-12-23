package com.exampleMobile.tests;

import com.exampleMobile.screens.*;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest{

    @Test
    public void changeMenuOption(){
        // Start from the HomeScreen
        HomeScreen homeScreen = returnHomeScreen();

    }
    @Test
    public void signUp(){
        // Start from the HomeScreen
        HomeScreen homeScreen2 = returnHomeScreen();
        homeScreen2.navigateToLoginScreen();
        System.out.println("hello");

    }
}
