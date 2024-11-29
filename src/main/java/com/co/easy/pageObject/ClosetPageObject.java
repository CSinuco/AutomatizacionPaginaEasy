package com.co.easy.pageObject;

import org.openqa.selenium.By;



public class ClosetPageObject {
    private static By btnCloset = By.xpath("//a[@href='/closet-6pts2cjs-180x46-x182-nuez/p']");
 //href="/closet-6pts2cjs-180x46-x182-nuez/p"
    public static By getBtnCloset(){
        return btnCloset;
    }

    private ClosetPageObject(){}
}


