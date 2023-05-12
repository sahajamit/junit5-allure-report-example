package com.sahajamit.allure;

import com.sahajamit.util.MathUtil;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Epic("Login Tests Epic")
@Feature("Invalid Login Features")
@DisplayName("Suite to test Onboarding")
public class Junit5_Integration_Test {
    @Test
    @Story("Test Story")
    @Description("This test will onboard the user")
    @DisplayName("Testing the CASA onboarding")
    void onboardingTheUserITest() {
        userCleanup();
        iamUserCreation();
        assertEquals(5, MathUtil.add(3, 2));
    }

    @Step("Cleaning up the user if it already exist")
    private void userCleanup(){
        Allure.addAttachment("Cleanup","User is deleted");
    }

    @Step("Creating the user in IAM")
    private void iamUserCreation(){
        System.out.println(" Creating the user in IAM");
        Allure.addAttachment("Response from IAM","asas asas asasas");
    }
}
