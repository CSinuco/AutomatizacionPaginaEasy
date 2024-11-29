package com.co.easy.stepDefinitions;


import com.co.easy.driver.SeleniumWebDriver;
import com.co.easy.steps.CatalogoSteps;
import com.co.easy.steps.ValidacionSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import static com.co.easy.driver.SeleniumWebDriver.driver;

public class AgregarProductoStepDefinitions {

    @Steps
    CatalogoSteps seleccionarcatalogo = new CatalogoSteps();

    @Steps
    ValidacionSteps validacion = new ValidacionSteps();

    @Dado("Me Encuentro En La Pagina de Easy")
    public void meEncuentroEnLaPaginaDeEasy() {

        SeleniumWebDriver.chromeDrive("https://www.easy.com.co/");

    }

    @Cuando("Seleccionamos la pagina de busqueda y elegimos un producto")
    public void seleccionamosLaVentanaDeBusquedaYElegimosElProducto() {
        seleccionarcatalogo.SeleccionCatalogo();
    }

    @Cuando("Agregamos el producto al carrito")
    public void agregamosElProductoAlCarrito() {
        seleccionarcatalogo.ComprarProducto();

    }
    @Cuando("Visualizare la pantalla de validacion")
    public void visualizareLaPantallaDeValidacion(){
        
    }







}
