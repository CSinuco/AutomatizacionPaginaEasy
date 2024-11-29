package com.co.easy.pageObject;

import org.openqa.selenium.By;

public class InicioPageObjects {

    private static By btnSearch = By.xpath("//*[@id='downshift-0-input']");


    private static By btnArmario = By.xpath("//a[@href='/closet?map=ft&_q=closet']");


    public static By getBtnSearch(){
        return btnSearch;
    }


    public static By getBtnArmario() {
        return btnArmario;
    }
    private InicioPageObjects(){
    }

}
