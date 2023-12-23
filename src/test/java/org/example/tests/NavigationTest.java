package org.example.tests;

import org.example.screens.*;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest{

    @Test
    public void changeMenuOption(){
        // Start from the HomeScreen
        HomeScreen homeScreen = returnHomeScreen();

        // Navigate to WebScreen
        WebScreen webScreen = homeScreen.navigateToWebScreen();

        // Navigate to LoginScreen
        LoginScreen loginScreen = webScreen.navigateToLoginScreen();

        // Navigate to FormScreen
        FormScreen formScreen = loginScreen.navigateToFormScreen();

        // Navigate to SwipeScreen
        SwipeScreen swipeScreen = formScreen.navigateToSwipeScreen();

        // Navigate to DragScreen
        DragScreen dragScreen = swipeScreen.navigateToDragScreen();

    }

    @Test
    public void signUp(){
        // Start from the HomeScreen
        ;

    }

}
