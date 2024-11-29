package com.co.easy.steps;

import com.co.easy.pageObject.AnadirPageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static com.co.easy.driver.SeleniumWebDriver.driver;

public class ValidacionSteps {
    @Step
    public void Validacion(){
        WebElement txtElement = driver.findElement(AnadirPageObject.getTxtFinal());
        String txtElementos = txtElement.getText();
        Assert.assertEquals("Métodos de entrega",txtElementos);


    }
}
