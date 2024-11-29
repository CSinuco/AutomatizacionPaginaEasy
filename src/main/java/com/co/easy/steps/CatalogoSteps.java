package com.co.easy.steps;


import com.co.easy.pageObject.*;
import com.co.easy.utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import org.apache.xmlbeans.GDuration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static com.co.easy.driver.SeleniumWebDriver.driver;

public class CatalogoSteps {


    @Step
    public void SeleccionCatalogo() {
        seleccionClick(InicioPageObjects.getBtnSearch());
        seleccionClick(InicioPageObjects.getBtnArmario());


    }
    @Step
    public void ComprarProducto(){
        //tuvimos que agregar una espera porque el elemento se demoraba un poco en salir
        esperarElementoVisible(ClosetPageObject.getBtnCloset(), Duration.ofSeconds(5));
        clickJavaScript(ClosetPageObject.getBtnCloset());
        esperarElementoVisible(AnadirPageObject.getBtnAgregar(), Duration.ofSeconds(5));
        seleccionClick(AnadirPageObject.getBtnAgregar());
        //Al haber botones con el mismo indice toca agregar esta espera mientras se cambia a la pagina final
        esperar(Duration.ofSeconds(20));
        esperarElementoVisible(AnadirPageObject.getBtnEscribir(), Duration.ofSeconds(5));
        seleccionClick(AnadirPageObject.getBtnEscribir());
        escrituraTexto(AnadirPageObject.getBtnEscribir(), "carlosmurcia@gmail.com");
        //Ultima espera para que el boton de enviar se habilite
        esperar(Duration.ofSeconds(3));
        clickJavaScript(AnadirPageObject.getBtnEnviar());


    }
    public void seleccionClick(By elemento) {
        driver.findElement(elemento).click();
    }
    public void clickJavaScript(By elemento){
        WebElement element = driver.findElement(elemento);
        JavascriptExecutor jsExecutor = (JavascriptExecutor)  driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }
    public void esperarElementoVisible(By elemento, Duration tiempoEsperaSegundos){
        WebDriverWait wait = new WebDriverWait(driver,tiempoEsperaSegundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

    }
    public void esperar(Duration tiempoEsperaSegundos){
        WebDriverWait wait = new WebDriverWait(driver,tiempoEsperaSegundos);
    }
    public void escrituraTexto(By elemento, String texto){
        driver.findElement(elemento).sendKeys(texto);
    }



}
