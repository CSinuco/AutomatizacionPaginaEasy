package com.co.easy.pageObject;

import org.openqa.selenium.By;

public class AnadirPageObject {

    private static By btnAgregar = By.xpath("(//div[@class='vtex-rich-text-0-x-wrapper vtex-rich-text-0-x-wrapper--btn-trigger vtex-rich-text-0-x-wrapper--btn-trigger-location'])[2]");
    // //header[@class='desktop-header']//a[text()='Amor']"
    //<div class="vtex-rich-text-0-x-wrapper vtex-rich-text-0-x-wrapper--btn-trigger vtex-rich-text-0-x-wrapper--btn-trigger-location"><p class="lh-copy vtex-rich-text-0-x-paragraph vtex-rich-text-0-x-paragraph--btn-trigger vtex-rich-text-0-x-paragraph--btn-trigger-location">Agregar</p></div>
    public static By getBtnAgregar(){
        return btnAgregar;
    }
    private static By btnEscribir = By.xpath("//input[@placeholder ='Ingresa aquí tu correo']");

    public static  By getBtnEscribir(){
        return btnEscribir;
    }

    private static By btnEnviar = By.xpath("//*[text()='Enviar']");

    public static By getBtnEnviar(){
        return btnEnviar;
    }


    private static By txtFinal = By.xpath("//div[@class='vtex-modal-layout-0-x-headerContainer vtex-modal-layout-0-x-headerContainer vtex-modal-layout-0-x-headerContainer--delivery flex items-start bb b--muted-3 flex-shrink-0 flex-grow-0 z-5 justify-between']");

    public static  By getTxtFinal(){return txtFinal;}
    private AnadirPageObject(){

    }
}
